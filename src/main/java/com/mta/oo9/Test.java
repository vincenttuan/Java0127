package com.mta.oo9;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("John");
        teacher.setAge(30);
        Student student = new Student();
        student.setName("Tom");
        student.setAge(16);
        // 印出 Teacher 相關資料
        System.out.printf("%s 年齡 %d\n", teacher.getName(), teacher.getAge());
        teacher.teaching("Java");
        // 印出 Student 相關資料
        System.out.printf("%s 年齡 %d\n", student.getName(), student.getAge());
        student.study("Java");
    }
}
