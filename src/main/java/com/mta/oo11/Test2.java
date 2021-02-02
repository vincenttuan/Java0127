package com.mta.oo11;

class A {
    int money = 100;
}

class B extends A {
    int money = 10;
    void access() {
        int money = 1;
        System.out.println(money);
        System.out.println(this.money);
        System.out.println(super.money);
    }
}

public class Test2 {
    public static void main(String[] args) {
        new B().access();
    }
}
