package day10_abstract_interfaces;

public class Student extends Person implements Reportable {
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

    @Override
    public void performRole() {
        System.out.println("Students attends lectures and studies");
    }

    @Override
    public String generateReport() {
        return "Student: " + getName() + ", Age: " + getAge() + ", Score: " + getScore();
    }
}
