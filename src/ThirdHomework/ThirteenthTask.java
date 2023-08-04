package ThirdHomework;

import java.util.Scanner;

public class ThirteenthTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum;
        byte numberOfMonths;
        final byte PERCENT = 7;
        while(true) {
            System.out.print("Enter deposit amount: ");
            if(scanner.hasNextFloat()) {
                sum = scanner.nextFloat();
                if(sum > 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
        }
        while(true) {
            System.out.print("Enter quantity of months: ");
            if(scanner.hasNextByte()) {
                numberOfMonths = scanner.nextByte();
                if(numberOfMonths > 0) {
                    break;
                }
            } else {
                scanner.nextLine();
                scanner.next();
            }
        }
        for(int i = 1; i <= numberOfMonths; i++) {
            sum *= 1f + PERCENT / 100f;
        }
        System.out.print("Result = " + sum);
        scanner.close();
    }
}
