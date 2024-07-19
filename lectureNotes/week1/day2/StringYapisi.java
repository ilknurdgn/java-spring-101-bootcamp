package lectureNotes.week1.day2;

public class StringYapisi {
    public static void main(String[] args) {

        //immutable
        String str = new String("Emine");
        String str2 = new String("Emine");
        String str3 = "Emine";
        String str4 = "Emine";
        str3 = "Buğra";

        if (str3 == str4) {
            System.out.println("yeap");
        }
        if (str3.equals(str4)) {
            System.out.println("yeap2");
        }
        if (str == str2) {
            System.out.println("yeap3");
        }
        if (str.equals(str2)) {
            System.out.println("equals");
        }
        if (str == str3) {
            System.out.println("yeap4");
        }

        String name = "Emine";   // A11
        name = "Buğra";          // B12

        String name2 = new String("Emine");   //  A11
        name2 = "Sadettin";                           // B11
        name2 = new String("Emine");           // A12
        name2 = "Sadettin";                           // B11


        //mutable
        StringBuilder builder = new StringBuilder("Sayaç Değeri: ");

        for (int i = 0; i < 10; i++) {
            int a = 0;
            builder.append(i);   // builder
            System.out.println(builder);
        }


    }
}
