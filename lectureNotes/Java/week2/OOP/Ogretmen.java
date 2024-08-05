package lectureNotes.Java.week2.OOP;

public class Ogretmen {

    public Long id;
    public String name;
    public int age;

    public void okulaGider() {
        System.out.println("Öğretmenler okula servisle gider.");
    }

    //Constructor metodu class ile aynı isimde olur ve geriye değer döndürmez.
    public Ogretmen() {
        System.out.println("Constructor Ogretmen");
    }

    public Ogretmen(Long id) {
        this();
        this.id = id;
    }


}
