package day21_enums_records;

public class StudentEntity {
    private String id;
    private String name;
    private double score;
    private EnrollmentStatus status;

    public StudentEntity(String id, String name, double score, EnrollmentStatus status) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public StudentDTO toDTO() {
        return new StudentDTO(
                this.id,
                this.name,
                this.score,
                this.status.getDescription());
    }
}
