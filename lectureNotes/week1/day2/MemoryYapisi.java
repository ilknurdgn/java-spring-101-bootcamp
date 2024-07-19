package lectureNotes.week1.day2;

public class MemoryYapisi {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Emine");

        // Java pass by value bir tiptir.

        int a = 3;   // A11
        int b = a;   // B11
        a = 4;       // A11
        System.out.println("a'nın değeri: " + a);
        System.out.println("b'nın değeri: " + b);


        String str1 = new String("a");
        String str2 = new String("b");
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1 nin değeri: " + str1);
        System.out.println("str2 nin değeri: " + str2);
        System.out.println("temp nin değeri: " + temp);

        Person person1 = new Person();
        person1 = null;
    }
}
