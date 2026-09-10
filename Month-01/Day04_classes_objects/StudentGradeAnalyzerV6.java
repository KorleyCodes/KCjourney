package Day04_classes_objects;

public class StudentGradeAnalyzerV6 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "KorleyCodes";
        student1.age = 20;
        student1.score = 41.5;

        Student student2 = new Student();
        student2.name = "John Doe";
        student2.age = 22;
        student2.score = 75.0;

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.score);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.score);
    }
}
