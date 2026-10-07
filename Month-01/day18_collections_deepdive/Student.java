package day18_collections_deepdive;

import java.lang.Object;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student s = (Student) o;
        return this.id.equals(s.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
