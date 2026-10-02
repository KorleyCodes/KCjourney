package day15_lambdas;

public class Student {
    private String name;
    private Double score;

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + " | Score: " + score);
    }
}
