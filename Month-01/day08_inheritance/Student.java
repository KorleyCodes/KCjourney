package day08_inheritance;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    // getter
    public double getScore() {
        return score;
    }

    public boolean isPassing() {
        return score >= 40 && score <= 100;
    }
}
