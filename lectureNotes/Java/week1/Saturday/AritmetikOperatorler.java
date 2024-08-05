package lectureNotes.Java.week1.Saturday;

public class AritmetikOperatorler {

    public static void main(String[] args) {

        //  +, -, /, %, *

        int carpma = 3 * 5;
        System.out.println("çarpım: " + carpma);

        int bolme = 10 / 3;
        System.out.println("bolme: " + bolme);

        int mod = 10 % 3;
        System.out.println("mod: " + mod);

        double bolme2 = 10.0 / 3.0;
        System.out.println("bölme double: " + bolme2);

        double mod2 = 10.0 % 3.0;
        System.out.println("mod double: " + mod2);

        double bolme3 = 10 / 3;
        System.out.println("bolme3: " + bolme3);

        double bolme4 = (double) 10 / (double) 3;
        System.out.println("bolme4: " + bolme4);

        int i = 5;
        int y2 = i + 2;
        System.out.println("y2: " + y2);

        // i = i - 1;
        i -= 1;

        i = i + 1;
        i += 1;
        System.out.println("i: " + i);

        int x = 1, y = 2, z = 3;
        z = x + y * z;
        System.out.println("z: " + z);

        z = (x + y) * z;
        System.out.println("z: " + z);


        int sayi = 0;
        sayi = sayi + 1;
        sayi += 1;
        sayi++;

        int sayi1 = 6;
        int sayi2 = sayi1++;
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2);

        int a = 2;
        int b = 3;
        int c = ++b;   // b = b + 1;
        int d = a++;   // a = a + 1;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

    }
}
