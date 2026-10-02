package day16_streams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAnalyticsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("KorleyCodes", 88.5, "Computer Science"),
                new Student("John Walker", 42.0, "Computer Science"),
                new Student("Erica Smith", 95.0, "Electrical Engineering"),
                new Student("Ama Mensah", 68.0, "Computer Science")));

        List<Student> csPassingStudents = students.stream()
                .filter(student -> student.getDepartment().equals("Computer Science") && student.getScore() > 50.0)
                .collect(Collectors.toList());
        csPassingStudents.forEach(student -> student.displayInfo());

        List<String> honorRollNames = students.stream()
                .filter(student -> student.getScore() > 80.0)
                .map(s -> s.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(honorRollNames);

        long failCount = students.stream()
                .filter(score -> score.getScore() < 50.0)
                .count();
        System.out.println("Number of students who failed: " + failCount);
    }
}
