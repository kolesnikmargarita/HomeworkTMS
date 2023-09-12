package Homework4.MainTask;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        final int minRandomNumber = -99;
        final int maxRandomNumber = 99;
        int[] arr;
        int max = minRandomNumber;
        int min = maxRandomNumber;
        float avg = 0;
        int numberOfElements;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите количество элементов массива: ");
            if(scanner.hasNextInt()) {
                numberOfElements = scanner.nextInt();
                if(numberOfElements > 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
        }
        arr = new int[numberOfElements];
        System.out.print("Массив: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = minRandomNumber + (int) ((maxRandomNumber - minRandomNumber + 1) * Math.random());
            System.out.print(arr[i] + ", ");
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
            avg = avg + arr[i];
        }
        avg /= numberOfElements;
        System.out.println("\nмаксимальное = " + max + "\nминимальное = " + min + "\nсреднее арифметическое = " + avg);
        scanner.close();
    }
}
