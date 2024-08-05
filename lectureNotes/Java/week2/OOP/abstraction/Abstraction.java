package lectureNotes.Java.week2.OOP.abstraction;

public class Abstraction {

    public static void main(String[] args) {

        HeartDoctor heartDoctor = new HeartDoctor();
        heartDoctor.maasZammiHesaplama(30000, 2, 3);
        System.out.println(heartDoctor);

        EyeDoctor eyeDoctor = new EyeDoctor();
        eyeDoctor.maasZammiHesaplama(50000, 3, 4);

    }
}
