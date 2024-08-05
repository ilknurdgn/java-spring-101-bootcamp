package springboot.com.techcareer.week3.sunday.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("C:\\test\\a.txt");
            bufferedReader  = new BufferedReader(fileReader);
        } catch (Exception e) {
            System.out.println("Dosya bulunamadı.");
        } finally {
            if(fileReader != null){
                fileReader.close();
            }
            if(bufferedReader != null){
                bufferedReader.close();
            }

        }
    }

}
