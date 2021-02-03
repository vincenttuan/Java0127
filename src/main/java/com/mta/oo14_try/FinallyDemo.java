package com.mta.oo14_try;

public class FinallyDemo {
    public static void main(String[] args) {
        String openFile = "開啟檔案";
        System.out.printf("程式啟動: %s\n", openFile);
        
        try {
            System.out.printf("計算結果: %d\n", 10/0);
        } catch (Exception e) {
            System.out.println(e);
            return;
            // System.exit(0); // 強迫關閉程式
        } finally { // 不論 try 區塊內是否有錯誤發生, 皆會執行此方法
            openFile = "關閉檔案";
            System.out.printf("程式結束: %s\n", openFile);
        }
        
        
    }
}
