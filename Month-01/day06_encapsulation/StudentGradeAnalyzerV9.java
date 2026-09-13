package day06_encapsulation;

public class StudentGradeAnalyzerV9 {
    public static void main(String[] args) {

        Student student1 = new Student("KorleyCodes", 20, 41.5);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getScore());

        System.out.println(student1.isAdult());
        System.out.println(student1.isPassing());
        System.out.println(student1.calculateGrade());

        student1.setScore(95);
        System.out.println(student1.getScore());

        student1.setScore(150);
        System.out.println(student1.getScore());

        Student student2 = new Student("John Doe", 16, 75.0);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getScore());

        System.out.println(student2.isAdult());
        System.out.println(student2.isPassing());
        System.out.println(student2.calculateGrade());
    }
}
