package Homework5.AdditionTask;

import java.util.Arrays;
import java.util.Random;

public class Main6 {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] arr = new int[random.nextInt(10) + 1][random.nextInt(10) + 1];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(40) - 20;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int[] i : arr) {
            Arrays.sort(i);
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
