package day05_constructors;

public class StudentGradeAnalyzerV8 {
    public static void main(String[] args) {

        Student student1 = new Student("KorleyCodes", 20, 41.5);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.score);

        System.out.println(student1.isAdult());
        System.out.println(student1.isPassing());
        System.out.println(student1.calculateGrade());

        Student student2 = new Student("John Doe", 16, 75.0);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.score);

        System.out.println(student2.isAdult());
        System.out.println(student2.isPassing());
        System.out.println(student2.calculateGrade());

        Student student3 = new Student("Erica Smith", 18, 105.0);
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.score);

        System.out.println(student3.isAdult());
        System.out.println(student3.isPassing());
        System.out.println(student3.calculateGrade());
    }

}
