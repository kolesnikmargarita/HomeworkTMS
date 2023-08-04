package main;

import java.util.Scanner;

public class FirstHomework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
    }
}
