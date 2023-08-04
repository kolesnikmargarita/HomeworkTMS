package ThirdHomework;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {

        float t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите t: ");
        if(scanner.hasNextFloat()) {
            t = scanner.nextFloat();
            if(t > -5f) {
                System.out.println("Тепло");
            } else if(t > -20) {
                System.out.println("Нормально");
            } else {
                System.out.println("Холодно");
            }
        }
        scanner.close();
    }
}
