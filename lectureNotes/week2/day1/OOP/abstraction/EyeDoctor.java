package techCareer.week2.OOP.abstraction;

public class EyeDoctor extends Doctor{


    // extends edilen abstract classtaki abstract metodu implemen etmek zorundayız.
    @Override
    public void uzmanlik() {
        System.out.println("Uzmanlık alanı gözdür");
    }

    @Override
    public void maasZammiHesaplama(Integer mevcutMaas, int calistigiYilSuresi, int zamKatsayisi){
        mevcutMaas = mevcutMaas * calistigiYilSuresi * (10 /100);
        System.out.println(mevcutMaas);
    }
}
