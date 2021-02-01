package com.mta.oo8;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Util {
    // 取得匯率資料
    // cur1, cur2 幣別
    public static Stock getExchange(String cur1, String cur2) {
        String symbol = cur1 + cur2 + "=x";
        Stock stock = null;
        try {
            stock = YahooFinance.get(symbol);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stock;
    }
}
