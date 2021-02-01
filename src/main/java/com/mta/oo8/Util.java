package com.mta.oo8;

import javax.swing.JComboBox;
import javax.swing.JTextField;
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
                                JTextField moneyField2) {
        String cur1 = curCombo1.getItemAt(curCombo1.getSelectedIndex());
        String cur2 = curCombo2.getItemAt(curCombo2.getSelectedIndex());
        Stock stock = Util.getExchange(cur1, cur2);
        double money = Double.parseDouble(moneyField1.getText());
        double result = money * stock.getQuote().getPrice().doubleValue();
        moneyField2.setText(String.format("%.1f", result));
    }
}
