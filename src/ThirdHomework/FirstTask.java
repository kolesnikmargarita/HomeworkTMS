package ThirdHomework;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        int monthNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        monthNumber = scanner.nextInt();
        switch(monthNumber) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no month with that number");
        }
    }
}
