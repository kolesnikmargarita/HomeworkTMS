package Homework4.MainTask;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        int[] mas = {5, 54, 23, 87, 3, 664, 76, 2, 0, -43, 45, -4};
        Scanner scanner = new Scanner(System.in);
        int number;
        while(true) {
            System.out.print("Введите целое число: ");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            scanner.nextLine();
        }
        for(int i : mas) {
            if(number == i) {
                System.out.println("Заданное число входит в массив");
                System.exit(0);
            }
        }
        System.out.println("Число не входит в массив");
        scanner.close();
    }
}