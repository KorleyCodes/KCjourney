package day12_exception_handling;

public class Day12Demo {
    public static void main(String[] args) {
        try {
            Student student = new Student("RKO", 22, 115);
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation test complete");
        }

        try {
            Student student = new Student("Rose", 23, 89);
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation test complete");
        }
    }
}
