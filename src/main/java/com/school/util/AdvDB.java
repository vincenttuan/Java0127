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
}
