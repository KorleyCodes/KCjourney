package day15_lambdas;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentProcessor {
    public static void filterAndExecute(List<Student> students, Predicate<Student> predicate,
            Consumer<Student> consumer) {
        for (Student student : students) {
            if (predicate.test(student)) {
                consumer.accept(student);
            }
        }
    }

    public static List<String> transformStudents(List<Student> students, Function<Student, String> transformer) {
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            result.add(transformer.apply(student));
        }
        return result;
    }

    public static Student createDefaultStudent(Supplier<Student> supplier) {
        return supplier.get();
    }
}
