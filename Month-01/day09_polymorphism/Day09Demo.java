package day09_polymorphism;

public class Day09Demo {
    public static void main(String[] args) {
        Person[] group = new Person[3];
        group[0] = new Person("John Kwesi", 47);
        group[1] = new Student("KorleyCodes", 20, 41.5);
        group[2] = new Teacher("Mr. Mensah", 35, "Computer Science");

        for (Person person : group) {
            person.introduce();
        }
    }

}
