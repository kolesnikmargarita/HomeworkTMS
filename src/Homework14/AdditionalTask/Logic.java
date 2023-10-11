package Homework14.AdditionalTask;

import java.util.Scanner;
import java.util.function.Predicate;

public class Logic {

    public void setInterface(int choice) {
        Scanner scanner = new Scanner(System.in);
        if(choice == 1) {
            System.out.println("Введите строку: ");
            StringBuilder inputStr = new StringBuilder(scanner.nextLine());
            StringIntegerInterface<StringBuilder> performer = str -> System.out.println(str.reverse());
            performer.generate(inputStr);
        } else {
            System.out.print("Введите неотрицательное число: ");
            Predicate<Integer> predicate = t -> t >= 0;
            int inputNumber = Main.checkInt(predicate);
            StringIntegerInterface<Integer> performer = number -> {
                int result = 1;
                for(int i = 2; i <= number; i++) {
                    result *= i;
                }
                System.out.println(result);
            };
            performer.generate(inputNumber);
        }
    }
}
