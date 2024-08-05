package lectureNotes.Java.week2.OOP.interfaceYapisi;

public interface SendMessage {

    // Gövdesiz metotlar alt classlarda override edilmelidir.
    public void sendSms();

    public void sendMail();


    // Java 8 ile gövdeli metot oluşturme özelliği gelmiştir.
    // Gövdeli metot oluşturmak için default ya da static anahtar kelimeleri kullanılmalıdır.
    public default void test() {
    }

    public static void test2() {
    }
}
