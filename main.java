// MainApp.java
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = ctx.getBean(StudentService.class);
        CourseService courseService = ctx.getBean(CourseService.class);
        FeeService feeService = ctx.getBean(FeeService.class);

        Sample usage: Add student, assign course, pay fees, etc.
        Student student = new Student(); student.setName("Rahul"); student.setBalance(2000);
        studentService.addStudent(student);
        feeService.payFees(student.getStudentId(), 500);

        // Build your menu logic or web controller based on this structure
    }
}
