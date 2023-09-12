package Homework11.MainTask.Exceptions;

public class LineNotFinishedWithSequenceException extends Exception{

    public LineNotFinishedWithSequenceException() {
        super("Line not finished \"1a2b\"");
    }
}
