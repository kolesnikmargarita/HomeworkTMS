package Homework4.MainTask;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int[] arr = {-7, 45, -54, 86, 765, 0, 45, 0, 0, -4, -2, 0, 76, 54, 3};
        int[] bufferArr = new int[arr.length];
        Scanner scanner = new Scanner(System.in);
        int number;
        int bufferArrElementIndex = -1;
        while(true) {
            System.out.print("Введите целое число: ");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            }
            scanner.nextLine();
        }
        for(int i : arr) {
            if(i != number) {
                bufferArrElementIndex++;
                bufferArr[bufferArrElementIndex] = i;
            }
        }
        if(bufferArrElementIndex < arr.length - 1) {
            arr = new int[bufferArrElementIndex + 1];
            System.arraycopy(bufferArr, 0, arr, 0, arr.length);
        } else {
            System.out.print("Такого числа нет. Массив не изменился: ");
        }
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
