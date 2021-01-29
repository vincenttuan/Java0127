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
        int amountAdult = 0; // 成年人數量
        for(Student student : students) {
            if(student.isAdult()) amountAdult++;
        }
        int amountChild = n-amountAdult; // 未成年人數量
        double percentAdult = (double)amountAdult/n; // 成年人比例
        double percentChild = (double)amountChild/n; // 未成年人比例
        // 長條圖表字串
        String chartAdult = "";
        String chartChild = "";
        for(int i=0;i<(int)(percentAdult*10);i++) chartAdult += "*";
        for(int i=0;i<(int)(percentChild*10);i++) chartChild += "*";
        
        System.out.printf("已成年: %2d (%.2f) %-10s\n", amountAdult, percentAdult, chartAdult);
        System.out.printf("未成年: %2d (%.2f) %-10s\n", amountChild, percentChild, chartChild);
        
    }
}
