package com.mta.oo3;

public class Student {
    String name;
    int age;
    
    // Constructor (建構子)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
}
