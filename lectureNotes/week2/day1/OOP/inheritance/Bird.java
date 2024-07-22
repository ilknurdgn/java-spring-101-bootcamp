package techCareer.week2.OOP.inheritance;

public class Bird extends Animal{

    @Override
    public void eat() {
        System.out.println("Bird id fed mama");
    }

    public void flying() {
        System.out.println("Bird is flied");
    }

}
