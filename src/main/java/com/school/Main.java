package com.school;

import com.school.entity.Classroom;
import com.school.entity.Student;
import com.school.util.AdvDB;
import static com.school.util.DB.queryClassroom;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static boolean exit; // 預設 false
    public static void main(String[] args) {
        while (!exit) {
            menu();
        }
    }
    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("1. 列出所有班級");
        System.out.println("2. 列出所有學生");
        System.out.println("3. 列出所有班級(含學生)");
        System.out.println("4. 列出所有學生(含班級)");
        System.out.println("5. 單筆查詢指定班級名稱(含學生)");
        System.out.println("6. 單筆查詢指定學生id(含班級)");
        System.out.println("0. 離開");
        System.out.println("------------------------------------");
        action();
    }
    
    public static void action() {
        // 會用到的區域變數先宣告 -------------------
        List<Classroom> classrooms = null;
        List<Student> students = null;
        Classroom classroom = null;
        Student student = null;
        //----------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇 ==> ");
        int no = sc.nextInt();
        switch(no) {
            case 1:
                classrooms = AdvDB.queryClassroom();
                for(Classroom room : classrooms) {
                    System.out.println(room);
                }
                break;
            case 2:
                students = AdvDB.queryStudent();
                for(Student s : students) {
                    System.out.println(s);
                }
                break;
            case 3:
                classrooms = AdvDB.queryClassroomAdv();
                for(Classroom room : classrooms) {
                    System.out.println(room);
                }
                break;
            case 4:
                students = AdvDB.queryStudentAdv();
                for(Student s : students) {
                    System.out.println(s);
                }
                break;
            case 5:
                System.out.print("請輸入班級名稱: ");
                String name = sc.next();
                classroom = AdvDB.getClassroomByNameAdv(name);
                System.out.println(classroom);
                break;
            case 6:
                System.out.print("請輸入學生id: ");
                int id = sc.nextInt();
                student = AdvDB.getStudentByIdAdv(id);
                System.out.println(student);
                break;
            case 0:
                exit = true;
                System.out.println("離開本系統~");
                break;
        }
        if(!exit) {
            System.out.println("按下 enter 後繼續 ...");
            new Scanner(System.in).nextLine();
        }
    }
}
