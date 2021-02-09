package school;

import com.school.entity.Student;
import com.school.util.DB;
import java.util.List;
import org.junit.Test;

public class Test2 {
    @Test
    public void t2() {
        // 查詢所有 Student
        List<Student> students = DB.queryStudent();
        for(Student student : students) {
            System.out.printf("id: %d name: %s score: %d ts: %s\n", 
                    student.getId(),
                    student.getName(),
                    student.getScore(),
                    student.getTs());
        }
    }
}
