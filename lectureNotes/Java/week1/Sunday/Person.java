package lectureNotes.Java.week1.Sunday;

import java.util.Objects;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
