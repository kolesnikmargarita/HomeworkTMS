package Homework11.AdditionalTask.Exceptions;

public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
