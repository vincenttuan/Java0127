package school;

import com.school.entity.Student;
import com.school.util.DB;
import java.util.List;
import org.junit.Test;

public class Test3 {
    @Test
    public void t3() {
        // 查詢所有 Student By classroom id
        int classroomId = 1;
        List<Student> students = DB.queryStudentByClassroomId(classroomId);
        for(Student student : students) {
            System.out.printf("id: %d name: %s score: %d ts: %s\n", 
                    student.getId(),
                    student.getName(),
                    student.getScore(),
                    student.getTs());
        }
    }
}
