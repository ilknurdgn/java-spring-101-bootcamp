package lectureNotes.Java.week2.BuilderDesignPattern;

public class Student {

    public Long id;
    public String name;
    public String surname;
    public int age;
    public String address;

    public Student() {
    }

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        public Long id;
        public String name;
        public String surname;
        public int age;
        public String address;

        public Builder() {

        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
