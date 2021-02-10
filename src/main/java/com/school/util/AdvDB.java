package com.school.util;

import com.school.entity.Classroom;
import com.school.entity.Student;
import java.util.List;

// 會自動裝配 Student 與 Classroom
public class AdvDB extends DB {
    // 1.查詢所有 Classroom (多筆) - 含 Student 裝配
    public static List<Classroom> queryClassroomAdv() {
        // 取得未裝配 student 的資料
        List<Classroom> classrooms = queryClassroom();
        // 裝配 student
        for(Classroom room : classrooms) {
            List<Student> students = queryStudentByClassroomId(room.getId());
            room.setStudents(students); // 裝配
        }
        return classrooms; // 已裝配 student
    }
    
    // 2.查詢所有 Student (多筆) - 含 Classroom 裝配
    public static List<Student> queryStudentAdv() {
        // 取得未裝配 classroom 的資料
        List<Student> students = queryStudent();
        // 裝配 classroom
        for(Student s : students) {
            Classroom room = getClassroomById(s.getClassroomId());
            s.setClassroom(room); // 裝配
        }
        return students; // 已裝配 classroom
    }

    // 3.查詢 Classroom 根據 id (單筆) - 含 Student 裝配
    public static Classroom getClassroomByIdAdv(int id) {
        Classroom room = AdvDB.getClassroomById(id);
        if(room != null) {
            List<Student> students = AdvDB.queryStudentByClassroomId(room.getId());
            room.setStudents(students);
        }
        return room;
    }
    
    // 4.查詢 Classroom 根據 name (單筆) - 含 Student 裝配
    public static Classroom getClassroomByNameAdv(String name) {
        Classroom room = AdvDB.getClassroomByName(name);
        if(room != null) {
            List<Student> students = AdvDB.queryStudentByClassroomId(room.getId());
            room.setStudents(students);
        }
        return room;
    }
    
    // 5.查詢 Student 根據 id (單筆) - 含 Student 裝配
    public static Student getStudentByIdAdv(int id) {
        Student student = AdvDB.getStudentById(id);
        if(student != null) {
            Classroom room = AdvDB.getClassroomById(student.getClassroomId());
            student.setClassroom(room);
        }
        return student;
    }
}
