package school;

import com.school.entity.Classroom;
import com.school.util.DB;
import java.util.List;
import org.junit.Test;

public class Test1 {
    @Test
    public void t1() {
        // 取得所有的 Classroom
        List<Classroom> classrooms = DB.queryClassroom();
        for(Classroom classroom : classrooms) {
            System.out.printf("id: %d name: %s\n", classroom.getId(), classroom.getName());
        }
    }
}
