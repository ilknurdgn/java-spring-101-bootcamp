package springboot.com.techcareer.week3.sunday.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {

        // FileReader fileReader = new FileReader("C:\\test\\a.txt");

        try {
            FileReader fileReader = new FileReader("C:\\test\\a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulamadı.");
        }

    }
}
