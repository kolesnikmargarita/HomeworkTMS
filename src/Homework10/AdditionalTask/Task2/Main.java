package Homework10.AdditionalTask.Task2;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder(args[0].trim());
        result.append(" ");
        int indexOfWordStart = 0;
        int indexOfWordEnd = args[0].indexOf(" ");
        int indexOfMaxWordStart = indexOfWordStart;
        int indexOfMaxWordEnd = indexOfWordEnd;
        int indexOfMinWordStart = indexOfWordStart;
        int indexOfMinWordEnd = indexOfWordEnd;
        int maxWordLength = 0;
        int minWordLength = indexOfWordEnd - indexOfWordStart;
        while(indexOfWordStart < result.length() - 1) {
            if(indexOfWordEnd - indexOfWordStart >= maxWordLength) {
                maxWordLength = indexOfWordEnd - indexOfWordStart;
                indexOfMaxWordStart = indexOfWordStart;
                indexOfMaxWordEnd = indexOfWordEnd;
            }
            if(indexOfWordEnd - indexOfWordStart <= minWordLength) {
                minWordLength = indexOfWordEnd - indexOfWordStart;
                indexOfMinWordStart = indexOfWordStart;
                indexOfMinWordEnd = indexOfWordEnd;
            }
            indexOfWordStart = indexOfWordEnd + 1;
            indexOfWordEnd = result.indexOf(" ", indexOfWordStart);
        }
        result.delete(0, result.length()).append("max: ")
                .append(args[0], indexOfMaxWordStart, indexOfMaxWordEnd)
                .append("\nmin: ").append(args[0], indexOfMinWordStart, indexOfMinWordEnd);
        System.out.println(result.toString());
    }
}
