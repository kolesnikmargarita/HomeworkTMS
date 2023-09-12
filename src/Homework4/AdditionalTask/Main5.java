package Homework4.AdditionalTask;

import java.util.Random;

public class Main5 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[random.nextInt(20) + 1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200) - 100;
            System.out.print(arr[i] + " ");
        }
        for(int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println();
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
