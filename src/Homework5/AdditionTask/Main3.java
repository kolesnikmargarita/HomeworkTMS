package Homework5.AdditionTask;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {

        byte[][] firstArr = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        byte[][] secondArr = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] resultArr = new int[firstArr.length][firstArr.length];
        int resultElement;
        for(int i = 0; i < firstArr.length; i++) {
            for(int k = 0; k < secondArr[0].length; k++) {
                resultElement = 0;
                for(int j = 0; j < secondArr.length; j++) {
                    resultElement += firstArr[i][j] * secondArr[j][k];
                }
                System.out.print(resultElement + " ");
                resultArr[i][k] = resultElement;
            }
        }
        System.out.println("\n" + Arrays.deepToString(resultArr));
    }
}
