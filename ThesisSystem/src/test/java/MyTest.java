import com.LeaYrx.pojo.College;
import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Teacher;
import com.LeaYrx.pojo.Thesis;
import com.LeaYrx.service.CollegeServiceImpl;
import com.LeaYrx.service.StudentServiceImpl;
import com.LeaYrx.service.ThesisServiceImpl;
import com.LeaYrx.service.TeacherServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThesisServiceImpl thesisService = context.getBean("ThesisServiceImpl", ThesisServiceImpl.class);
        TeacherServiceImpl teacherService  = context.getBean("TeacherServiceImpl", TeacherServiceImpl.class);
        StudentServiceImpl studentService = context.getBean("StudentServiceImpl", StudentServiceImpl.class);
        CollegeServiceImpl collegeService = context.getBean("CollegeServiceImpl", CollegeServiceImpl.class);
        List<College> colleges = collegeService.queryAllCollege();

        List<Thesis> theses = thesisService.queryAllThesis();

        for (Thesis thesis : theses) {
            System.out.println(thesis);
        }

    }
}
