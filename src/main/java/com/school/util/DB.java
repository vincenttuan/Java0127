package com.school.util;

import com.school.entity.Classroom;
import com.school.entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DB {
    public static Connection conn;
    static {
        String url = "jdbc:derby://localhost:1527/mta";
        String username = "app";
        String password = "app";
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("連線失敗: " + e);
        }
    }
    
    // 查詢所有 Classroom
    public static List<Classroom> queryClassroom() {
        List<Classroom> classrooms = new ArrayList<>();
        String sql = "SELECT id, name FROM Classroom";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
            // 逐步走訪 rs 的內容
            while (rs.next()) {
                // 將欄位資料取出
                int id = rs.getInt("id");
                String name = rs.getString("name"); // 資料表的 varchar 對應的就是 String
                // 將取出的欄位資料內容放入 classroom 物件中
                Classroom classroom = new Classroom();
                classroom.setId(id);
                classroom.setName(name);
                // 將物件(classroom)加入到集合(classrooms)內
                classrooms.add(classroom);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return classrooms;
    }

    // 查詢所有 Student
    public static List<Student> queryStudent() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT id, name, score, ts, classroom_id FROM Student";
        try(PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();) {
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int score = rs.getInt("score");
                Timestamp ts = rs.getTimestamp("ts");
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setScore(score);
                student.setTs(ts);
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
