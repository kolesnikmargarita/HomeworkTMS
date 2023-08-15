package Homework5.AdditionTask;

import java.util.Random;

public class Main4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] arr = new int[random.nextInt(3) + 1][random.nextInt(3) + 1];
        int sum = 0;
        System.out.println("{");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(40) - 20;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" }");
        for(int[] i : arr) {
            for(int j : i) {
                sum += j;
            }
        }
        System.out.println("sum = " + sum);
    }
}
