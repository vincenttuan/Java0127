package com.mta.oo14_try;

public class IDException extends Exception {

    public IDException(String string) {
        super(string);
    }
    
    // 自訂方法
    public void 怎麼辦() {
        System.out.println("請重新輸入~");
    }
    
}
