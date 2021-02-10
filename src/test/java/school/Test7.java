package school;


import com.school.entity.Classroom;
import com.school.entity.Student;
import static com.school.util.DB.getClassroomById;
import static com.school.util.DB.queryStudent;

import java.util.List;
import org.junit.Test;

public class Test7 {
    @Test
    public void t7() {
        List<Student> students = queryStudent();
        // 裝配前
        for(Student s : students) {
            System.out.println(s);
        }
        // 裝配 Classroom
        for(Student s : students) {
            Classroom classroom = getClassroomById(s.getClassroomId());
            s.setClassroom(classroom);
        }
        // 裝配後
        for(Student s : students) {
            System.out.println(s);
        }
    }
}
