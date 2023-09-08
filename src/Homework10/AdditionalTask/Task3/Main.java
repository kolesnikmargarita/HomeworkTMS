package Homework10.AdditionalTask.Task3;

public class Main {

    public static void main(String[] args) {
        args[0] = args[0].trim();
        StringBuilder result = new StringBuilder(args[0]);
        result.append(" ");
        String letter;
        int indexOfWordStart = -1;
        int indexOfWordEnd = result.indexOf(" ");
        int indexOfLetter;
        int indexCopyLetter;
        int minLength = indexOfWordEnd;
        int indexOfMinWordStart = 0;
        int indexOfMinWordEnd = indexOfWordEnd;
        int indexOfArgsWordStart = -1;
        int indexOfArgsWordEnd;
        while(indexOfWordStart < result.length() - 1){
            indexOfWordStart++;
            indexOfLetter = indexOfWordStart;
            indexOfArgsWordStart++;
            indexOfArgsWordEnd = args[0].indexOf(" ", indexOfArgsWordStart);
            if(indexOfArgsWordEnd == -1) {
                indexOfArgsWordEnd = args[0].length();
            }
            while(indexOfLetter < indexOfWordEnd - 1) {
                letter = result.substring(indexOfLetter, indexOfLetter + 1);
                indexCopyLetter = result.indexOf(letter, indexOfLetter + 1);
                while(indexCopyLetter < indexOfWordEnd && indexCopyLetter > -1) {
                    result.deleteCharAt(indexCopyLetter);
                    indexOfWordEnd--;
                    indexCopyLetter = result.indexOf(letter, indexCopyLetter);
                }
                indexOfLetter++;
            }
            if(indexOfWordEnd - indexOfWordStart < minLength) {
                minLength = indexOfWordEnd  - indexOfWordStart;
                indexOfMinWordStart = indexOfArgsWordStart;
                indexOfMinWordEnd = indexOfArgsWordEnd;
            }
            indexOfWordStart = indexOfWordEnd;
            indexOfWordEnd = result.indexOf(" ", indexOfWordStart + 1);
            indexOfArgsWordStart = indexOfArgsWordEnd;
        }
        result.delete(0, result.length()).append(args[0], indexOfMinWordStart, indexOfMinWordEnd);
        System.out.println(result);
    }
}
