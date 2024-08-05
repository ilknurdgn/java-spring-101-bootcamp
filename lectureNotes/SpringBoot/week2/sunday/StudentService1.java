package springboot.com.techcareer.week2.sunday;

import org.springframework.stereotype.Component;

@Component
public class StudentService1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
