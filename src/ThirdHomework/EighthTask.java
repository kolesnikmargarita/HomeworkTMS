package ThirdHomework;

import java.util.Scanner;

public class EighthTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.println("Enter number");
        while(true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(number > 0) {
                    break;
                }
            } else {
                scanner.nextLine();
            }
            System.out.println("Incorrect input. Try again.");
        }
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Result = " + sum);
        scanner.close();
    }
}
