package SecondHomework;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
        scanner.close();
    }
}
