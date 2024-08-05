package lectureNotes.Java.week2.OOP.abstraction;

public abstract class Doctor {

    private String name;

    public void muayene(){
        System.out.println("Doktor hastayı muayene eder.");
    }

    // abstract metot sadece abstract classlarda oluşturulur
    // gövdesis metottur.
    public abstract void uzmanlik();

    public void maasZammiHesaplama(Integer mevcutMaas, int calistigiYilSuresi, int zamKatsayisi){
        mevcutMaas = mevcutMaas * calistigiYilSuresi * zamKatsayisi;
        System.out.println(mevcutMaas);
    }
}
