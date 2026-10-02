package day15_lambdas;

import java.util.ArrayList;
import java.util.List;

public class Day15Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("KorleyCodes", 85.0));
        students.add(new Student("John Walker", 42.5));
        students.add(new Student("Erica Smith", 92.0));

        StudentProcessor.filterAndExecute(students, (Student) -> Student.getScore() > 50.0,
                student -> student.displayInfo());

        System.out.println(StudentProcessor.transformStudents(students, student -> student.getName().toUpperCase()));

        StudentProcessor.createDefaultStudent(() -> new Student("Guest Student", 0.0)).displayInfo();

    }
}
