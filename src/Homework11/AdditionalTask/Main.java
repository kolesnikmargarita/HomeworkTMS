package Homework11.AdditionalTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String login;
        String password;
        String confirmPassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("Login: ");
        login = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.print("Confirm password: ");
        confirmPassword = scan.nextLine();
        System.out.println(Account.checkEnteringDate(login,  password, confirmPassword));
    }
}
