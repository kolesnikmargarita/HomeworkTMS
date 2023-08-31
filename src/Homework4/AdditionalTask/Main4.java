package Homework4.AdditionalTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        int[] arr;
        int[] evenArr;
        byte numberOfElementsInArr;
        byte numberOfElementsInEvenArr = 0;
        int indexEvenArr = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер массивов из интервала (5; 10]: ");
        do{
            if(scanner.hasNextByte()) {
                numberOfElementsInArr = scanner.nextByte();
                if(numberOfElementsInArr > 5 && numberOfElementsInArr <= 10) {
                    break;
                }
            }
            System.out.print("Некорректный ввод. Повторите ввод: ");
            scanner.nextLine();
        } while(true);
        arr = new int[numberOfElementsInArr];
        for(int i = 0; i < numberOfElementsInArr; i++) {
            arr[i] = random.nextInt(20) - 10;
            if(arr[i] % 2 == 0) {
                numberOfElementsInEvenArr++;
            }
        }
        evenArr = new int[numberOfElementsInEvenArr];
        for(int i : arr) {
            System.out.print(i + " ");
            if(i % 2 == 0) {
                evenArr[indexEvenArr] = i;
                indexEvenArr++;
            }
        }
        System.out.println();
        for(int i : evenArr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
