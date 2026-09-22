package day13_collections;

public class Student {

    private String studentId;
    private String name;
    private double score;

    public Student(String studentId, String name, double score) throws InvalidScoreException {
        this.name = name;
        this.studentId = studentId;
        setScore(score);
    }

    public void setScore(double score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("number must be between 0 and 100");
        } else {
            this.score = score;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void displayInfo() {
        System.out.println("ID: " + getStudentId() + "| Name " + getName() + " | Score: " + getScore());
    }
}
