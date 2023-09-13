package Homework11.MainTask.Exceptions;

public class LineNoteStartsWithSequenceException extends Exception{

    public LineNoteStartsWithSequenceException() {
        super("Line not starts from \"555\"");
    }
}
