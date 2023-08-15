package Homework5.AdditionTask;

import java.util.Random;

public class Main5 {

    public static void main(String[] args) {

        Random random = new Random();
        int sizeOfArray = random.nextInt(10) + 2;
        int[][] arr = new int[sizeOfArray][sizeOfArray];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(40) - 20;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Главная диагональ            Побочная диагонааль");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("     " + arr[i][i] + "                            "
                    + arr[i][arr.length - i - 1]);
        }
    }
}
