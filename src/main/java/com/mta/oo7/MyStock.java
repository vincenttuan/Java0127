package com.mta.oo7;

public class MyStock {
    private static String name = "小明的投資";
    private String stockName; // 股票名稱
    private String symbol;    // 股票代號
    private double cost;      // 買進價格(成本)
    private int amount;       // 買進數量

    public MyStock() {
    }

    public MyStock(String stockName, String symbol, double cost, int amount) {
        this.stockName = stockName;
        this.symbol = symbol;
        this.cost = cost;
        this.amount = amount;
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
        return "MyStock{" + "stockName=" + stockName + ", symbol=" + symbol + ", cost=" + cost + ", amount=" + amount + '}';
    }
    
}
