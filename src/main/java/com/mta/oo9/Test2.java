package com.mta.oo9;

public class Test2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("John");
        teacher.setAge(30);
        Student student = new Student();
        student.setName("Tom");
        student.setAge(16);
        print(teacher);
        //print(student);
    }
    
    public static void print(Person person) {
        System.out.printf("1. %s 年齡 %d\n", person.getName(), person.getAge());
    }
    
}
