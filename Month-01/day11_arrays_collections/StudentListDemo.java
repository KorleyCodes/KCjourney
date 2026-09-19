package day11_arrays_collections;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("KorleyCodes", 20, 41.5));
        studentList.add(new Student("John Walker", 32, 27));
        studentList.add(new Student("Erica Smith", 19, 89));

        for (Student s : studentList) {
            s.introduce();
        }
    }
}
