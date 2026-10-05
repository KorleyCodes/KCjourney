package day17_optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public void save(Student s) {
        if (s != null) {
            this.students.add(s);
        }
    }

    public Optional<Student> findbyId(String id) {
        return students.stream()
                .filter(s -> s.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    public List<Student> findall() {
        return new ArrayList<>(students);
    }
}
