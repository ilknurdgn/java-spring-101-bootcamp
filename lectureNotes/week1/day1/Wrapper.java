package lectureNotes.week1.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Wrapper {
       public static void main(String[] args) {
        int a = 3;
        Integer b = 4;
        System.out.println(b.toString());

        String text = "100";
        String text2 = "200";
        System.out.println(text + text2);

        Integer i = Integer.valueOf(text);  //100
        int i1 = Integer.parseInt(text2);   //200
        int sonuc = i + i1;
        System.out.println(sonuc);

        int min = Integer.min(45, 98);
        System.out.println(min);

        double doubleValue = 0.3;
        Double dValue = 0.5;

        boolean bool = true;
        Boolean bool1 = false;

        if (Objects.equals(Boolean.TRUE, bool)) {
            System.out.println("Kayıt atıldı");
        }

        if (Objects.isNull(sonuc)) {
            System.out.println("alana değer girilmemiştir.");
        }

        // Autoboxing: primitive tipin wrapper class’a çevrilmesidir.
        List<Integer> integerList = new ArrayList<>();
        for (int x = 0; x < 10; x++) {
            integerList.add(x);
        }

        // Unboxing: wrapper class’ın primitive tipe çevrilmesidir.
        List<Integer> listInteger = new ArrayList<>();
        int total = 0;
        for (Integer y : listInteger) {
            total += y;
        }
    }
}
