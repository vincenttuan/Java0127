package com.mta.oo11;

public class Son extends Father {

    public Son() {
        this(1000);
        System.out.println("Son 建構子1");
    }
    
    public Son(int money) {
        super(money);
        System.out.println("Son 建構子2");
    }
    
}
