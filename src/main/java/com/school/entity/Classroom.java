package com.school.entity;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int id;
    private String name;
    // 一對多
    private List<Student> students = new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        // id, name, [student's name, student's score] ...
        String msg = "";
        msg += String.format("id: %d name:%s ", id, name);
        for(Student s : students) {
            msg += String.format("[%s, %d] ", s.getName(), s.getScore());
        }
        return msg;
    }
    
}
