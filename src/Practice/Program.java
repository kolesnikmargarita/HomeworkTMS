package Practice;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("Result is:\n");
        Scanner scan = new Scanner(System.in);
        String[] strings = new String[3];
        float avg = 0;
        for(int i = 0; i < strings.length; i++) {
            strings[i] = scan.nextLine();
            avg += strings[i].length();
        }
        avg /= strings.length;
        for(String string : strings) {
            if(string.length() > avg) {
                result.append(string).append("\n").append(string.length()).append("\n");
            }
        }
        System.out.println(result.toString());
    }
}
