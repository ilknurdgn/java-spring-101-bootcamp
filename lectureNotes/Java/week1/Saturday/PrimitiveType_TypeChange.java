package lectureNotes.Java.week1.Saturday;

public class PrimitiveType_TypeChange {
    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = 129;
        shortValue = byteValue;
        System.out.println("shortValue değeri: " + shortValue);

        int intValue = 1_000_000;
        long longValue = 100_000L;

        intValue = (int) longValue;  //casting

        //casting işleminde veri kaybı olabilir.
        long valueLong = 100_000_000_000L;
        int valueInt = (int) valueLong;
        System.out.println("cast edilmemiş değer: " + valueLong);
        System.out.println("cast edilmiş değer: " + valueInt);


        // Integer cache: -128 ile 127 arasındaki sayılar cache'lenir.
        Integer intValue1 = 128;
        Integer intValue2 = 128;
        //   System.out.println(intValue1 == intValue2);

        int intValue11 = 230;
        int intValue22 = 230;
        System.out.println(intValue11 == intValue22);
    }
}
