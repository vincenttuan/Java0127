package com.mta.oo7;

// 投資組合
public class MyPortfolio {
    public static void main(String[] args) {
        MyStock s1 = new MyStock("台積電", "2330.TW", 550.5, 1000);
        MyStock s2 = new MyStock("鴻海", "2317.TW", 120, 2000);
        System.out.println(s1);
        System.out.println(s2);
    }
}
