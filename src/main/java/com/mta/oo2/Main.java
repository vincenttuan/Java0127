package com.mta.oo2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Mary";
        s2.age = 17;
        System.out.println(s1); // 同等 s1.toString()
        System.out.println(s1.toString());
        System.out.println(s2); // 同等 s2.toString()
        System.out.println(s2.toString());
        
    }
}
