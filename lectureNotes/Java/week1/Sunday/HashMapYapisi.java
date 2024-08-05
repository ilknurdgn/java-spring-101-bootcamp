package lectureNotes.Java.week1.Sunday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapYapisi {

    public static void main(String[] args) {

        HashMap<Integer, String> personMap = new HashMap<>();
        personMap.put(1, "Kutay");
        personMap.put(2, "Selin");
        personMap.put(2, "Muhammed");

        for (Map.Entry<Integer, String> entryMap : personMap.entrySet()) {
            entryMap.getKey();
            System.out.println(entryMap.getValue());
        }

        System.out.println(personMap.size());
        String name = personMap.get(2);

        for (Integer i : personMap.keySet()) {
            System.out.println(i + " " + personMap.get(i));
        }

        Map<String, List<String>> nameMap = new HashMap<>();
        List<String> femaleNames = List.of("Emine", "Yağmur", "Beliz");
        List<String> maleNames = List.of("Can", "Halil", "Hüseyin");
        nameMap.put("Kadın", femaleNames);
        nameMap.put("Erkek", maleNames);

        for (Map.Entry<String, List<String>> entryName : nameMap.entrySet()) {
            for(String str : entryName.getValue()) {
                System.out.println("Cinsiyet: " + entryName.getKey() + " / İsim: " + str);
            }
        }


    }

}
