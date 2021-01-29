package com.mta.oo4;

import static com.mta.oo4.Util.getStudents;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> students = getStudents(30);
        System.out.println(students);
    }
}
