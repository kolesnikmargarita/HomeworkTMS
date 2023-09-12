package Homework11.MainTask;

import Homework11.MainTask.Exceptions.LineHaveNotABCException;
import Homework11.MainTask.Exceptions.LineNotFinishedWithSequenceException;
import Homework11.MainTask.Exceptions.LineNoteStartsWithSequenceException;

public class Methods {

    public static void displayEightNumbers(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber, 0, 4).append(documentNumber, 9, 13).append("\n");
        System.out.println(result.toString());
    }

    public static void displayDocumentNumberWithStars(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber).replace(13, 16, "***")
                .replace(22, 25, "***").append("\n");
        System.out.println(result.toString());
    }

    public static void displayLettersInLowerCase(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber.substring(5, 8).toLowerCase()).append("/")
                .append(documentNumber.substring(14, 17).toLowerCase()).append("/")
                .append(documentNumber.substring(19, 20).toLowerCase()).append("/")
                .append(documentNumber.substring(21, 22).toLowerCase()).append("\n");
        System.out.println(result);
    }

    public static void displayLettersInUpperCase(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append("Letters:").append(documentNumber.substring(5, 8).toUpperCase()).append("/")
                .append(documentNumber.substring(14, 17).toUpperCase()).append("/")
                .append(documentNumber.substring(19, 20).toUpperCase()).append("/")
                .append(documentNumber.substring(21, 22).toUpperCase()).append("\n");
        System.out.println(result);
    }

    public static void displayHaveABC(String documentNumber) throws LineHaveNotABCException {
        if(documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность abc");
        } else {
            throw new LineHaveNotABCException();
        }
    }

    public static void displayStartsSequence(String documentNumber) throws LineNoteStartsWithSequenceException {
        if(documentNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с последовательности 555");
        } else {
            throw new LineNoteStartsWithSequenceException();
        }
    }

    public static void displayEndsSequence(String documentNumber) throws LineNotFinishedWithSequenceException {
        if(documentNumber.endsWith("1a2b")) {
            System.out.println("Номер документа закансивается последовательностью 1a2b");
        } else {
           throw new LineNotFinishedWithSequenceException();
        }
    }
}
