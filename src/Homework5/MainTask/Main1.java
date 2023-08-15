package Homework5.MainTask;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        short number;
        int[][][] arr = new int[random.nextInt(5) + 1] // почему IDEA пишет "Contents of array 'arr' are read, but never written to"?
                [random.nextInt(5) + 1]
                [random.nextInt(5) + 1];
        for(int[][] i : arr) {
            System.out.print("{ ");
            for(int[] j : i) {
                for(int k = 0; k < j.length; k++) {
                    j[k] = random.nextInt(200) - 100;
                    System.out.print(j[k] + " ");
                }
                System.out.println();
            }
            System.out.println(" }");
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Введите целое число: ");
        while(!scanner.hasNextShort()) {
            System.out.print("Некорректный ввод. Повторите попытку: ");
            scanner.nextLine();
        }
        number = scanner.nextShort();
        scanner.close();
        for(int[][] i : arr) {
            System.out.print("{ ");
            for(int[] j : i) {
                for(int k = 0; k < j.length; k++) {
                    j[k] += number;
                    System.out.print(j[k] + " ");
                }
                System.out.println();
            }
            System.out.println(" }");
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
