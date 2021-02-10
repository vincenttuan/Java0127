package school;

import com.school.entity.Classroom;
import com.school.entity.Student;
import static com.school.util.DB.queryClassroom;
import static com.school.util.DB.queryStudentByClassroomId;
import java.util.List;
import org.junit.Test;

public class Test6 {
    @Test
    public void t6() {
        List<Classroom> classrooms = queryClassroom();
        // 裝配 student 前
        for(Classroom room : classrooms) {
            System.out.println(room);
        }
        // 裝配 student
        for(Classroom room : classrooms) {
            List<Student> students = queryStudentByClassroomId(room.getId());
            room.setStudents(students); // 裝配
        }
        // 裝配 student 後
        for(Classroom room : classrooms) {
            System.out.println(room);
        }
    }
}
