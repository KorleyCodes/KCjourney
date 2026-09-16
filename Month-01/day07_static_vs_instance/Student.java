package day07_static_vs_instance;
public class Student {
    private String name;
    private int age;
    private double score;
    private static int studentCount = 0;

    // Constructor
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
        studentCount++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean isPassing() {
        return (score >= 40 && score <= 100);
    }

    public String calculateGrade() {
        if (score > 100 || score < 0) {
            return "---";
        } else if (score >= 80) {
            return "A";

        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";

        } else if (score >= 50) {
            return "D";
        } else if (score >= 40) {
            return "E";
        } else {
            return "F";
        }
    } 
}