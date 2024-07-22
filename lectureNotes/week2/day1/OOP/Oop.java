package techCareer.week2.OOP;

public class Oop {

    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.name = "Ahmet";
        ogretmen.age = 25;
        ogretmen.okulaGider();

        Mudur mudur = new Mudur();
        mudur.okulaGider();

        Ogretmen ogretmen1 = new Ogretmen(123L);
        ogretmen1.name = "Ahmet";
        ogretmen1.age = 25;
    }

    // Metot imzası, metot ismi ve metot parametreleridir. Dönüş tipi metot imzasına dahil değildir.
    public int hesapla() {
        return 1;
    }

    protected int hesapla(int a) {
        return 2;
    }

//    public void hesapla(){
//        return;
//    }

}
