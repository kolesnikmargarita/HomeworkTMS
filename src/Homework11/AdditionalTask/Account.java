package Homework11.AdditionalTask;

import Homework11.AdditionalTask.Exceptions.WrongLoginException;
import Homework11.AdditionalTask.Exceptions.WrongPasswordException;

public class Account {

    public static boolean checkEnteringDate(String login, String password, String confirmPassword) {
        try {
            if(login.contains(" ")) {
                throw new WrongLoginException();
            }
            if(login.length() >= 20) {
                throw new WrongLoginException("Login length should be no more 20 letters!");
            }
            if (password.contains(" ") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            if (password.length() >= 20) {
                throw new WrongPasswordException("Password length should be no more 20 letters!");
            }
            if(!containsNumber(password)) {
                throw new WrongPasswordException("There isn't number in password!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static boolean containsNumber(String string) {
        char[] arrOfString = string.toCharArray();
        for(char letter : arrOfString) {
            if(letter >= '0' && letter <= '9') {
                return true;
            }
        }
        return false;
    }
}
