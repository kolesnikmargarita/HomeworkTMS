package Homework10.AdditionalTask.Task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder string = new StringBuilder(args[0].trim());
        string.append(" ");
        StringBuilder result = new StringBuilder();
        int numberOfWord;
        int indexOfWordStart = 0;
        int indexOfWordEnd = string.indexOf(" ");
        System.out.print("Number of word: ");
        while(!scan.hasNextInt()) {
            System.out.print("Incorrect input. Try again: ");
            scan.nextLine();
        }
        numberOfWord = scan.nextInt();
        for(int i = 1; i < numberOfWord && indexOfWordEnd > -1; i++) {
            indexOfWordStart = indexOfWordEnd + 1;
            indexOfWordEnd = string.indexOf(" ", indexOfWordStart);
        }
        if(numberOfWord > 0 && indexOfWordEnd > -1){
            result.append(string, indexOfWordStart, indexOfWordEnd).reverse();
            if (result.toString().equals(string.substring(indexOfWordStart, indexOfWordEnd))) {
                result.append(" является палиндромом");
            } else {
                result.append(" не является палиндромом");
            }
        } else {
            result.append("Слово с таким номером отсутствует");
        }
        System.out.println(result.toString());
    }
}