package Day04_classes_objects;

public class StudentGradeAnalyzerV7 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "KorleyCodes";
        student1.age = 20;
        student1.score = 41.5;

        System.out.println(student1.isAdult());
        System.out.println(student1.isPassing());
        System.out.println(student1.calculateGrade());

        Student student2 = new Student();

        student2.name = "John Doe";
        student2.age = 16;
        student2.score = 75.0;

        System.out.println(student2.isAdult());
        System.out.println(student2.isPassing());
        System.out.println(student2.calculateGrade());
    }
}
