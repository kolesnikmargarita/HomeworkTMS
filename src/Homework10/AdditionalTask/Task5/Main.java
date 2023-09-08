package Homework10.AdditionalTask.Task5;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        result.append(args[0]);
        char letter;
        for(int i = 0; i < result.length(); i += 2) {
            letter = result.charAt(i);
            if(letter >= 'A' && letter <= 'z') {
                result.insert(i, letter);
            } else {
                i--;
            }
        }
        System.out.println(result);
    }
}
