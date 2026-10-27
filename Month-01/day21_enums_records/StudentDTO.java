package day21_enums_records;

public record StudentDTO(String id, String name, double score, String statusDescription) {
    public StudentDTO {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Student ID cannot be null or blank");
        }
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

    }
}
