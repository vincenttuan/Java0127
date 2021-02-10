package school;

import com.school.entity.Classroom;
import com.school.entity.Student;
import com.school.util.AdvDB;
import java.util.List;
import org.junit.Test;

public class Test8 {
    @Test
    public void t8() {
        // 查詢已裝備的 classroom
        List<Classroom> classrooms = AdvDB.queryClassroomAdv();
        for(Classroom room : classrooms) {
            System.out.println(room);
        }
        // 查詢已裝備的 student
        List<Student> students = AdvDB.queryStudentAdv();
        for(Student s: students) {
            System.out.println(s);
        }
    }
}
