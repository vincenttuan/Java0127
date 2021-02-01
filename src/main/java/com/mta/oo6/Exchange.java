package com.mta.oo6;


import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class Exchange {
    private static double rate;
    private int money;
    
    // static 屬性初始區塊
    static {
        try {
            Stock stock = YahooFinance.get("USDTWD=x");
            rate = stock.getQuote().getPrice().doubleValue();
        } catch (Exception e) {
            System.out.println("有錯誤訊息");
            e.printStackTrace(); // 將錯誤訊息印出
        }
    }
    
    public Exchange(int money) {
        this.money = money;
    }
    
    double getTWD() { // 美金換台幣
        System.out.printf("目前美金兌換台幣的匯率: %.2f\n", rate);
        return money * rate;
    }
    
}
