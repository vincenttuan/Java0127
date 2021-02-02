package com.mta.oo9;

public class Student {
    private String name;
    private int age;
    
    // getter / setter
    
    // 學習紀錄
    public void study(String language) {
        System.out.printf("%s 正在學習 %s 語言\n", name, language);
    }
    
}
