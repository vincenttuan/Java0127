package com.mta.oo14_try;

public class CallstackDemo {
    public static void main(String[] args) {
        System.out.println("執行 main()");
        a(0);
    }
    public static void a(int n) {
        System.out.println("執行 a()");
        try {
            b(n);
        } catch (Exception e) {
            System.out.println("a() 處理錯誤了");
        }
    }
    public static void b(int n) {
        System.out.println("執行 b()");
        c(n);
    }
    public static void c(int n) {
        System.out.println("執行 c()");
        System.out.println(10/n);
        System.out.println("程式結束...");
    }
    
}
