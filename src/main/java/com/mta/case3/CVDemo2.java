package com.mta.case3;
/*
某公司有18位員工
其中10位在去年投資股票，一年的獲利率如下(單位：%)：
    7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外8位員工投資買公債一年內獲利率如下(單位：%)
    6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數。
*/
public class CVDemo2 {
    // 股票獲利
    static double [] stock = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
    // 公債獲利
    static double [] bond = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
    
    public static void main(String[] args) {
        // 股票獲利 CV
        double stockCV = Util.getCV(stock);
        // 股票獲利 CV
        double bondCV = Util.getCV(bond);
    
        System.out.printf("變異係數股票獲利: %.1f%%  變異係數公債獲利: %.1f%%\n", stockCV*100, bondCV*100);
        
        System.out.printf("獲利穩健的投資商品是: %s\n", stockCV < bondCV ? "股票" : "公債");
    }
}
