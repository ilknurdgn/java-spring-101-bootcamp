package springboot.com.techcareer.week3.sunday.exceptionHandling;

import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;

public class UnCheckedException {

    public static void main(String[] args) {
        Student student = null;
        student.setAddress("Sinop");

        System.out.println(student.getAddress());
    }
}
