package day09_polymorphism;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi my name is " + getName() + " and my age is " + getAge() + ". I teach " + getSubject());
    }
}