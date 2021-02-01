package com.mta.oo7;

public class Util {
    public static void print(MyStock[] myStocks) {
        System.out.printf("+----------+----------+----------+----------+----------+\n");
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|\n", "Symbol", "Cost", "Prcie", "Amount", "Profit");
        System.out.printf("+----------+----------+----------+----------+----------+\n");
        for(MyStock myStock : myStocks) {
            double profit = (myStock.getPrice() - myStock.getCost()) * myStock.getAmount();
            System.out.printf("|%-10s|%,10.1f|%,10.1f|%,10d|%,10.1f|\n", 
                              myStock.getSymbol(),
                              myStock.getCost(),
                              myStock.getPrice(),
                              myStock.getAmount(),
                              profit);
            System.out.printf("+----------+----------+----------+----------+----------+\n");
        }
    }
}
