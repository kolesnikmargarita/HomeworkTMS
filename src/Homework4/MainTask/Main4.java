package Homework4.MainTask;

public class Main4 {

    public static void main(String[] args) {

        final int minRandomNumber = -99;
        final int maxRandomNumber = 99;
        int[] firstArr = new int[5];
        int[] secondArr = new int[5];
        float avgOfFirstArr = 0;
        float avgOfSecondArr = 0;
        for(int i = 0; i < 5; i++) {
            firstArr[i] = minRandomNumber + (int) ((maxRandomNumber - minRandomNumber + 1) * Math.random());
            secondArr[i] = minRandomNumber + (int) ((maxRandomNumber - minRandomNumber + 1) * Math.random());
        }
        for(int i : firstArr) {
            System.out.print(i + " ");
            avgOfFirstArr += i;
        }
        System.out.println();
        for(int i : secondArr) {
            System.out.print(i + " ");
            avgOfSecondArr += i;
        }
        avgOfFirstArr /= 5;
        avgOfSecondArr /= 5;
        System.out.println("\nсреднее арифметическое первого массива = " + avgOfFirstArr
                + "\nсреднее арифметическое первого массива = " + avgOfSecondArr);
        if(avgOfFirstArr > avgOfSecondArr) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if(avgOfFirstArr < avgOfSecondArr) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
