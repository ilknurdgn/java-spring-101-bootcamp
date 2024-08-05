package springboot.com.techcareer.week2.sunday;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component  // @Component olmazsa PostConstruct'a düşmez.
public class PostConstructAnotation {

    public static List<String> cityList = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Proje ayağa kalktıktan sonra ilk çağırılan metot.");
        cityList();
        testPostConstructor();
    }

    public void testPostConstructor() {
        System.out.println("test");
    }

    public void cityList() {
        cityList.add("Samsun");
        cityList.add("Ankara");
    }
}
