package school;

import com.school.util.AdvDB;
import org.junit.Test;

public class Test9 {
    @Test
    public void t9() {
        System.out.println(AdvDB.getClassroomByIdAdv(1));
        System.out.println(AdvDB.getClassroomByNameAdv("B02"));
        System.out.println(AdvDB.getClassroomByIdAdv(3));
        System.out.println(AdvDB.getStudentByIdAdv(2));
    }
}
