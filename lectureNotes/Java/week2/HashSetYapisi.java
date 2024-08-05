package lectureNotes.Java.week2;

import techCareer.week1.Sunday.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetYapisi extends Object {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Mustafa");
        stringList.add("Beyza");
        stringList.add("Eren");
        stringList.add("Eren");

        System.out.println("Listenin uzunluğu: " + stringList.size());

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Mustafa");
        hashSet.add("Beyza");
        hashSet.add("Eren");
        hashSet.add("Eren");

        System.out.println("HashSet'in uzunluğu: " + hashSet.size());


        HashSet<String> names = new HashSet<>();
        names.add("Mustafa");
        names.add("Beyza");
        names.add(new String("Selin"));
        names.add(new String("Selin"));

        System.out.println("names'in uzunluğu: " + names.size());

        String str = new String("Mustafa");
        //str.equals()

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Emine"));
        personSet.add(new Person("Emine"));

        Person person = new Person();
        //   person.equals()

        System.out.println("personSet'in uzunluğu: " + personSet.size());

    }
}
