package lectureNotes.Java.week2;

public class StaticAndFinal {

    private final static String salary = "salary";

    static int i;   // class değişkeni
    int j;

    public static void main(String[] args) {

        String movieName = Movie.movieName;

        // static metotta static olmayan metot çağırılamaz.
        toplam(2,3);

        System.out.println(Message.PRODUCT_NOT_FOUND_MESSAGE);
    }

    // static  metotta static olmayan değişken çağırılamaz.
    public static int toplam(int a, int b) {
       // j = a+b;
        return a + b;
    }

    // static olmayan  metotta static değişken çağırılabilir.
    public int carpim(int a, int b) {
        i = a * b;
        return i;
    }

    // static metotlar override edilemez.



}
