package ThirdHomework;

import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
            if(number%2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        }
    }
}
