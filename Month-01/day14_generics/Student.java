package day14_generics;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id + " | Name: " + name);
    }
}
