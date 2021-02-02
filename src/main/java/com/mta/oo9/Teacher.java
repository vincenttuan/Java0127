package com.mta.oo9;

public class Teacher extends Person {
    // 教學紀錄
    public void teaching(String language) {
        System.out.printf("%s 正在教授 %s 語言\n", getName(), language);
    }
    
}
