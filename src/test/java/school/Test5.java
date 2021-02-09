package school;

import com.school.entity.Student;
import com.school.util.DB;
import org.junit.Test;

public class Test5 {
    @Test
    public void t5() {
        Student student = DB.getStudentById(1);
        if(student != null) {
            System.out.printf("id: %d name: %s score: %d ts: %s\n", 
                    student.getId(),
                    student.getName(),
                    student.getScore(),
                    student.getTs());
        }
    }
}
