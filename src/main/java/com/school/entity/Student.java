package com.school.entity;

import java.sql.Timestamp;

public class Student {
    private int id;
    private String name;
    private int score;
    private Timestamp ts;
    private int classroomId;
    // 欄位 classroom_id 所關聯的 classroom
    // 多對一
    private Classroom classroom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }
    
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += String.format("id: %2d name: %-10s score:%4d (%-23s) ", id, name, score, ts);
        if(classroom != null) {
            msg += String.format("[ %-3s ]", classroom.getName());
        }
        return msg;
    }
    
    
    
}
