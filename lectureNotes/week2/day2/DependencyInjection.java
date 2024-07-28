package lectureNotes.week2.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjection implements CommandLineRunner {

    /**
     * Field Injection
     */
//    @Autowired
//    StudentService studentService;

    /**
     * Constructor Injection
     */
    private final StudentService studentService;

    @Autowired  //Spring 4.3 ve sonrası için zorunluluk kalmıştır.
    public DependencyInjection(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Setter Injection
     */
//    StudentService studentService;

//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }
    @Override
    public void run(String... args) throws Exception {
        studentService.getName();
    }
}