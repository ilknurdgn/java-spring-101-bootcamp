package techCareer.week2.OOP.inheritance;

public class Animal {

    private String name;

    public void eat() {
        System.out.println("Animal is feed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
