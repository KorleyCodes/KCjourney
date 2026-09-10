package Day04_classes_objects;

public class Student {
    String name;
    int age;
    double score;

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
