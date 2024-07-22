package techCareer.week2.OOP.interfaceYapisi;

public class XCompany implements SendMessage, Test {

    @Override
    public void sendSms() {
        System.out.println("Bu sms X Şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail() {
        System.out.println("Bu mail X Şirketi tarafından gönderilmiştir.");
    }


    // implement edilen iki interface'de de olduğu için override etmek zorundayız.
    @Override
    public void test() {
        SendMessage.super.test();   // SendMessage interface'indeki test() metoduna gider.
        System.out.println();
    }
}
