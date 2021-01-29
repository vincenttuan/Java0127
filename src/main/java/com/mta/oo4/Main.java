package com.mta.oo4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", 18);
        Student s2 = new Student();
        s2.setName("Mary");
        s2.setAge(17);
        System.out.println(s2.getAge());
        System.out.println(s1);
        System.out.println(s2);
    }
}
