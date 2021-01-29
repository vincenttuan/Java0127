package com.mta.oo4;

public class Student {
    // 物件屬性(變數/資產/欄位)
    private String name;
    private int age;
    
    // 建構子
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 封裝方法 (getter/setter)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // 一般(加值)方法
    // 是否成年 ?
    public boolean isAdult() {
        return age >= 18 ? true : false;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
}
