package day19_sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RankingEngineDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("KC003", "Zoe", 85.0));
        students.add(new Student("KC001", "Ama", 95.0));
        students.add(new Student("KC004", "Kojo", 85.0));
        students.add(new Student("KC002", "Brim", 70.0));

        students.sort(null);
        System.out.println("--- Natural Order (By ID) ---");
        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> byScoreDesc = Comparator
                .comparing(Student::getScore)
                .reversed();

        students.sort(byScoreDesc);
        System.out.println("--- Custom Order (By Score Descending) ---");
        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> multiSort = Comparator
                .comparing(Student::getScore)
                .thenComparing(Student::getName);

        List<Student> sortedList = students.stream()
                .sorted(multiSort)
                .collect(Collectors.toList());

        System.out.println("--- Multi-Sort (Score Desc, then Name Asc) ---");
        for (Student student : sortedList) {
            System.out.println(student);
        }
    }
}
