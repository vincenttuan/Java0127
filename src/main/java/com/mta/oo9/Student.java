package com.mta.oo9;

public class Student extends Person {
    // 學習紀錄
    public void study(String language) {
        System.out.printf("%s 正在學習 %s 語言\n", getName(), language);
    }
    
}
