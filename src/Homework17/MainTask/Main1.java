package Homework17.MainTask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) {
        String ip;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        System.out.println("Enter ip: ");
        ip = scanner.nextLine();
        System.out.println(pattern.matcher(ip).matches());
    }
}
