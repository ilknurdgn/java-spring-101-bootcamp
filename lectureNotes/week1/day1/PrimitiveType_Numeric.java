package lectureNotes.week1.day1;

public class PrimitiveType_Numeric {
    public static void main(String[] args) {

        byte byteValue = 127;
        System.out.println("byte value: " + byteValue);

        // byte byteValue1 = 129;

        short shortValue = 10000;
        System.out.println("short value: " + shortValue);

        int sayi = 556464654;
        System.out.println("int value: " + sayi);

        int sayiValue = 10_000_000;  //  10000000
        System.out.println("int value: " + sayiValue);

        long longValue = 5564646L;
        System.out.println("long value:" + longValue);

        float floatValue = 1.1f;
        System.out.println("Float Value: " + floatValue);

        double doubleValue = 1.1;
        System.out.println("Double value: " + doubleValue);

        Double aDouble = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        Float aFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("double sayının değeri: " + aDouble);
        System.out.println("float sayının değeri: " + aFloat);

        /** Double ve float gerçek sayılar kümesinin elemanlarını tutarlar.
        Yani 1.2 ile 2.1 arasında sonsuz sayıda değer vardır.
        Matematiksel işlemler yapılacağı zaman hatalardan kaçınmak içim BigDecimal kullanılmalıdır.
         */


    }
}
