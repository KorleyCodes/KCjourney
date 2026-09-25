package day14_generics;

public class Day14Demo {
    public static void main(String[] args) {
        DataRepository<Student> studentRepo = new DataRepository<>();

        studentRepo.save(new Student("KC001", "KorleyCodes"));
        studentRepo.save(new Student("KC002", "John Walker"));

        for (Student s : studentRepo.getAll()) {
            s.displayInfo();
        }

        System.out.println("Total Students in Repo: " + studentRepo.count());

        // Task B
        DataRepository<String> courses = new DataRepository<>();
        courses.save("CS01");
        courses.save("CS02");

        for (String c : courses.getAll()) {
            System.out.println(c);
        }
        System.out.println("Total Courses in Repo: " + courses.count());

    }
}