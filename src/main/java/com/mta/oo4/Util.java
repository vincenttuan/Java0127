package com.mta.oo4;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Random;

public class Util {
    public static ArrayList<Student> getStudents(int n) {
        ArrayList<Student> list = new ArrayList<>();
        Faker faker = new Faker();
        Random r = new Random();
        for(int i=0;i<n;i++) {
            Student student = new Student();
            String name = faker.name().lastName();
            int age = r.nextInt(50);
            student.setName(name);
            student.setAge(age);
            // 將 student 放入 list 中
            list.add(student);
        }
        return list;
    }
}
