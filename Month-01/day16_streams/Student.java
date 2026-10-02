package day16_streams;

public class Student {
    private String name;
    private double score;
    private String department;

    public Student(String name, double score, String department) {
        this.name = name;
        this.score = score;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getDepartment() {
        return department;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Score: " + score + ", Department: " + department);
    }
}
