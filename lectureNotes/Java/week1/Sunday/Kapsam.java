package lectureNotes.Java.week1.Sunday;

public class Kapsam {

    // Test classs'ında bu değişkenler kullanılmıştır.

    public int nesneDegiskeni = 5;

    public static int classDegiskeni = 10;

    public static void main(String[] args) {

        String name = "Emine";

        int yas = 0;
        for (int i = 0; i < 5; i++) {
            //   int yas = i;
            yas = i;
            name = "Emine";
            System.out.println(yas);
        }
        System.out.println(yas);
    }
}
