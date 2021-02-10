package school;

import com.school.entity.Classroom;
import com.school.util.DB;
import static com.school.util.DB.queryClassroom;
import java.util.List;
import org.junit.Test;

public class Test6 {
    @Test
    public void t6() {
        List<Classroom> classrooms = queryClassroom();
        for(Classroom room : classrooms) {
            System.out.println(room);
        }
    }
}
