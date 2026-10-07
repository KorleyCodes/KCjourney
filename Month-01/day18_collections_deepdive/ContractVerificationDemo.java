package day18_collections_deepdive;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContractVerificationDemo {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        Student s1 = new Student("KC001", "KorleyCodes", 90.0);
        Student s2 = new Student("KC001", "KorleyCodes Dup", 85.0);

        set.add(s1);
        set.add(s2);

        System.out.println(set.size());

        Map<Student, String> registry = new HashMap<>();
        registry.put(s1, "Active Student");

        String result = registry.get(s2);
        System.out.println("Map retrieval results " + result);
    }
}
