package Homework11.MainTask.Exceptions;

public class LineHaveNotABCException extends Exception {

    public LineHaveNotABCException() {
        super("The line hasn't \"abc\"");
    }
}
