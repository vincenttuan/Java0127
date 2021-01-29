package com.mta.oo4;

import static com.mta.oo4.Util.getStudents;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Student> students = getStudents(n);
        // System.out.println(students);
        // 1.要印出未成年
        for(Student student : students) {
            if(!student.isAdult()) {
                System.out.println(student);
            }
        }
        // 2.成年與未成年的比例
        int amountAdult = 0;
        for(Student student : students) {
            if(student.isAdult()) amountAdult++;
        }
        System.out.printf("已成年: %2d (%.1f)\n", amountAdult, (double)amountAdult/n);
        System.out.printf("未成年: %2d (%.1f)\n", n-amountAdult, (double)(n-amountAdult)/n);
        
    }
}
