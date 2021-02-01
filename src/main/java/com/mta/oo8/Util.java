package com.mta.oo8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Util {
    // 取得匯率資料
    // cur1, cur2 幣別
    public static Stock getExchange(String cur1, String cur2) {
        String symbol = cur1 + cur2 + "=x"; // ex: TWDUSD=x
        Stock stock = null;
        try {
            stock = YahooFinance.get(symbol);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stock;
    }
    
    public static void exchange(JComboBox<String> curCombo1, 
                                JComboBox<String> curCombo2,
                                JTextField moneyField1,
                                JTextField moneyField2,
                                JLabel timeLabel) {
        String cur1 = curCombo1.getItemAt(curCombo1.getSelectedIndex());
        String cur2 = curCombo2.getItemAt(curCombo2.getSelectedIndex());
        Stock stock = Util.getExchange(cur1, cur2);
        double money = Double.parseDouble(moneyField1.getText());
        double result = money * stock.getQuote().getPrice().doubleValue();
        moneyField2.setText(String.format("%.1f", result));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = stock.getQuote().getLastTradeTime().getTime();
        timeLabel.setText(sdf.format(date));
    }
    
    public static void exchangeList(JTable exchangeTable) {
        // 取得 JTable 的 model 物件
        DefaultTableModel model = (DefaultTableModel)exchangeTable.getModel();
        // 清空資料
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try {
            // 欲查詢的匯率商品
            String[] symbols = new String[] {"USDTWD=x", "JPYTWD=x", "CNYTWD=x", "EURTWD=x"};
            for(String symbol : symbols) {
                Stock stock = YahooFinance.get(symbol);
                // 將所的到的資料放入 Object[] 陣列
                Object[] data = {
                    stock.getName(),
                    stock.getQuote().getPreviousClose(),
                    stock.getQuote().getPrice(), 
                    stock.getQuote().getChange(),
                    stock.getQuote().getChangeInPercent(),
                    sdf.format(stock.getQuote().getLastTradeTime().getTime())
                };
                // 將 data (Object[] 陣列) 加入到 model 中
                model.addRow(data);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
