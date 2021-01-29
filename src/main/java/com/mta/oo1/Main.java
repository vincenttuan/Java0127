package com.mta.oo1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Mary";
        s2.age = 17;
        System.out.println(s1);
        System.out.println(s2);
        System.out.printf("name: %s age: %d\n", s1.name, s1.age);
        System.out.printf("name: %s age: %d\n", s2.name, s2.age);
    }
    
}
