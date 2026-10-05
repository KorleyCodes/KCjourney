package day17_optionals;

public class Student {

    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.name = name;
        this.id = id;
        this.score = score;

    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Score: " + score);
    }
}
