package day09_polymorphism;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public void introduce() {
        System.out.println("Hi my name is " + getName() + " and my age is " + getAge() + ". My score is " + getScore());
    }
}
