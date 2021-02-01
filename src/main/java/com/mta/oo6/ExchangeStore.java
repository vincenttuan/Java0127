package com.mta.oo6;

public class ExchangeStore {
    public static void main(String[] args) {
        Exchange e1 = new Exchange(100);
        Exchange e2 = new Exchange(250);
        System.out.printf("%.1f\n", e1.getTWD());
        System.out.printf("%.1f\n", e2.getTWD());
    }
}
