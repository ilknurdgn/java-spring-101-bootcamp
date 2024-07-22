package techCareer.week2.OOP.interfaceYapisi;

public class YCompany implements SendMessage{

    @Override
    public void sendSms (){
        System.out.println("Bu sms Y Şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail (){
        System.out.println("Bu mail Y Şirketi tarafından gönderilmiştir.");
    }
}
