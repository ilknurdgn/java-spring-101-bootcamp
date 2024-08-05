package lectureNotes.Java.week1.Sunday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Listeler {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Özlem");
        names.add("M.Akif");
        names.add("İlknur");
        names.add("İlknur");
        //  names.add(133);

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.size());

        HashSet<String> nameList = new HashSet<>();
        nameList.add("Özlem");
        nameList.add("M.Akif");
        nameList.add("İlknur");
        nameList.add("İlknur");

        for (String name1 : nameList) {
            System.out.println(name1);
        }
        System.out.println(nameList.size());

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList list = new ArrayList();
        list.add("Rahime");
        list.add(21);

        for (Object o : list) {

        }

        List.of("Emine", "Özlem", 12);
        Arrays.asList("Umut", "Ayşem");
    }
}
