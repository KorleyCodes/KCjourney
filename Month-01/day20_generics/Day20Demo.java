package day20_generics;
import java.util.List;

public class Day20Demo {
    public static void main(String[] args){

        GenericRepository<Student, String> studentRepo= new GenericRepository<>();
        
        studentRepo.save(new Student("KC001", "Alice", 85.5));
        studentRepo.save(new Student("KC002", "Bob", 90.0));
        studentRepo.save(new Student("KC003", "Charlie", 78.0));

        List<Student> batch = List.of(new Student("KC010", "Kojo", 78.0), new Student("KC011", "Erica", 92.0));
        studentRepo.saveAll(batch);

        studentRepo.findById("KC010").ifPresent(val -> System.out.println("Found: " + val));
        System.out.println("Total students: " + studentRepo.findAll().size());
    }
}
