package com.mta.oo14_try;

public class CallstackDemo {
    public static void main(String[] args) {
        System.out.println("執行 main()");
        a(10);
    }
    public static void a(int n) {
        System.out.println("執行 a()");
        b(n);
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
