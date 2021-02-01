package com.mta.oo7;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MyStock {
    private static String name = "小明的投資";
    private String stockName; // 股票名稱
    private String symbol;    // 股票代號
    private double cost;      // 買進價格(成本)
    private int amount;       // 買進數量
    private double price;     // 目前價格(透過 financequotes-api.com 取得)
    public MyStock() {
    }

    public MyStock(String stockName, String symbol, double cost, int amount) {
        setStockName(stockName);
        setSymbol(symbol);
        setCost(cost);
        setAmount(amount);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyStock.name = name;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        // 取得 price
        try {
            Stock stock = YahooFinance.get(symbol);
            price = stock.getQuote().getPrice().doubleValue();
        } catch (Exception e) {
        }
        this.symbol = symbol;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MyStock{" + "stockName=" + stockName + ", symbol=" + symbol + ", cost=" + cost + ", amount=" + amount + ", price=" + price + '}';
    }

    
}
