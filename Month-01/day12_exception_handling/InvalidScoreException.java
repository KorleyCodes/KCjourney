package day12_exception_handling;

public class InvalidScoreException extends Exception {

    public InvalidScoreException(String message) {
        super(message);
    }
}
