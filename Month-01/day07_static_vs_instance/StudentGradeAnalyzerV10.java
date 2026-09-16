package day07_static_vs_instance;

public class StudentGradeAnalyzerV10 {
    public static void main(String[] args) {
        Student student1 = new Student("KorleyCodes", 20, 41.5);
        Student student2 = new Student("John Doe", 16, 75.0);
        Student student3 = new Student("Erica Smith", 18, 90.0);

        System.out.println(Student.getStudentCount());

        Student student4 = new Student("Michael", 21, 65.0);
        System.out.println(Student.getStudentCount());
    }

}
