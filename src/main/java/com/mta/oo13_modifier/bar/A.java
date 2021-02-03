package com.mta.oo13_modifier.bar;

public class A {
    public void door() {
        System.out.println("進入大門");
    }
    // 同 package 可存取
    // 不同 package 要繼承
    protected void room() { 
        System.out.println("進入房門");
    }
}
