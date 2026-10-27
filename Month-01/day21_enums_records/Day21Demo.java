package day21_enums_records;

public class Day21Demo {
    public static void main(String[] args) {
        StudentEntity s1 = new StudentEntity("KC001", "KorleyCodes", 88.5, EnrollmentStatus.PENDING);
        StudentDTO dto1 = s1.toDTO();
        System.out.println("StudentDTO: " + dto1);

        EnrollmentStatus.findByString("active")
                .ifPresentOrElse(
                        status -> System.out.println("Found status: " + status.getDescription()),
                        () -> System.out.println("Status not found"));

        try {
            StudentDTO s2 = new StudentDTO("KC002", "John Egeh", 105, "ACTIVE");
            System.out.println("StudentDTO: " + s2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating StudentDTO: " + e.getMessage());
        }

    }
}
