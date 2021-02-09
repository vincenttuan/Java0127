package school;

import com.school.entity.Classroom;
import com.school.util.DB;
import org.junit.Test;

public class Test4 {
    @Test
    public void t4() {
        Classroom classroom = DB.getClassroomById(1);
        if(classroom != null) {
            System.out.printf("id: %d name: %s\n", classroom.getId(), classroom.getName());
        }
    }
}
