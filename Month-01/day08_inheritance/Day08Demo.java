package day08_inheritance;

public class Day08Demo {
    public static void main(String[] args) {
        Student student1 = new Student("KorleyCodes", 20, 41.5);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getScore());

        student1.introduce();
        System.out.println(student1.isPassing());

        Teacher teacher1 = new Teacher("Mr. Mensah", 35, "Computer Science");
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getAge());
        System.out.println(teacher1.getSubject());
        teacher1.introduce();
    }
}
