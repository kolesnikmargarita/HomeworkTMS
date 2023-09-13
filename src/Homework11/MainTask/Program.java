package Homework11.MainTask;

import Homework11.MainTask.Exceptions.LineHaveNotABCException;
import Homework11.MainTask.Exceptions.LineNotFinishedWithSequenceException;
import Homework11.MainTask.Exceptions.LineNoteStartsWithSequenceException;

public class Program {

    public static void main(String[] args){
        Methods.displayEightNumbers(args[0]);
        Methods.displayDocumentNumberWithStars(args[0]);
        Methods.displayLettersInLowerCase(args[0]);
        Methods.displayLettersInUpperCase(args[0]);
        try {
            Methods.displayHaveABC(args[0]);
            Methods.displayStartsSequence(args[0]);
            Methods.displayEndsSequence(args[0]);
        } catch (LineHaveNotABCException | LineNoteStartsWithSequenceException | LineNotFinishedWithSequenceException e) {
            System.out.println(e.getMessage());
        }
    }
}
