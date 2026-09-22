package day12_exception_handling;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) throws InvalidScoreException {
        this.name = name;
        this.age = age;
        setScore(score);
    }

    public void setScore(double score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100. Received: " + score);
        } else {
            this.score = score;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}
