package lectureNotes.Java.week2.BuilderDesignPattern;

public class StudentClient {

    public static void main(String[] args) {

        Student student = new Student.Builder().firstName("Emine").lastName("Özbek").age(27).build();
        Student student2 = new Student.Builder().id(123L).age(27).build();

        Student1 student1 = Student1.builder().id(123L).name("Emine").build();
    }
}
