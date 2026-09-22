package day13_collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class CourseManagementDemo {
    public static void main(String[] args) {

        // TASK A

        List<Student> studentList = new ArrayList<>();
        // adding 3 students
        try {
            studentList.add(new Student("KC001", "KorleyCodes", 78.5));
            studentList.add(new Student("KC002", "John Walker", 43.5));
            studentList.add(new Student("KC003", "Erica Smith", 87.5));
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }

        for (Student student : studentList) {
            student.displayInfo();
        }

        // Task B

        Set<String> courseCode = new HashSet<>();
        courseCode.add("CS01");
        courseCode.add("CS02");
        courseCode.add("CS01");
        courseCode.add("CS02");
        courseCode.add("ENG101");

        for (String code : courseCode) {
            System.out.println(code);
        }

        // Task C
        Map<String, Student> studentRegistry = new HashMap<>();
        try {
            // creating the student object
            Student s1 = new Student("KC001", "KorleyCodes", 78.5);
            Student s2 = new Student("KC002", "John Walker", 43.5);
            Student s3 = new Student("KC003", "Erica Smith", 87.5);

            // adding them to the map
            studentRegistry.put(s1.getStudentId(), s1);
            studentRegistry.put(s2.getStudentId(), s2);
            studentRegistry.put(s3.getStudentId(), s3);
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }

        if (studentRegistry.get("KC001") != null) {
            Student retrieved = studentRegistry.get("KC001");
            retrieved.displayInfo();
        } else {
            System.out.println("Student doesn't exist");
        }

    }
}
