package Homework4.AdditionalTask;

import java.util.Random;

public class Main7 {

    public static void main(String[] args) {

        int vial;
        Random random = new Random();
        int[] arr = new int[random.nextInt(20) + 1];
        for(byte i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200) - 100;
            System.out.print(arr[i] + " ");
        }
        for(byte i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    vial = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = vial;
                }
            }
        }
        System.out.println();
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
