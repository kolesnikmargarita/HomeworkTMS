package ThirdHomework;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        int monthNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        if(scanner.hasNextInt()) {
            monthNumber = scanner.nextInt();
        } else {
            monthNumber = 0;
        }
        if(monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if(monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Spring");
        } else if(monthNumber >= 6 && monthNumber <= 8){
            System.out.println("Summer");
        } else if(monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("There is no month with that number");
        }
    }
}
