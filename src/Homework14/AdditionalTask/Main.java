package Homework14.AdditionalTask;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main{

    public static void main(String[] args) {
        System.out.println("Выберите действие:\n1 - переворот строки\n2 - факториал числа");
        Predicate<Integer> predicate = t -> t == 1 || t == 2;
        int choice = checkInt(predicate);
        Logic logic = new Logic();
        logic.setInterface(choice);
    }

    public static int checkInt(Predicate<Integer> predicate) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
                if(predicate.test(inputNumber)) {
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Не корректный ввод. Повторите попытку.");
        }
        return inputNumber;
    }
}
