package Homework11.AdditionalTask.Exceptions;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException() {}
    public WrongLoginException(String message) {
        super(message);
    }
}
