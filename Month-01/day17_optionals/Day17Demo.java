package day17_optionals;

public class Day17Demo {

    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();

        repository.save(new Student("KC001", "KorleyCodes", 88.5));
        repository.save(new Student("KC002", "John Walker", 42.0));

        repository.findbyId("KC001")
                .ifPresent(s -> s.displayInfo());

        Student defaultStudent = repository.findbyId("KC999")
                .orElse(new Student("0000", "Default Student", 0.0));
        defaultStudent.displayInfo();
        try {
            repository.findbyId("KC999")
                    .orElseThrow(() -> new IllegalArgumentException("Student cannot be found"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}