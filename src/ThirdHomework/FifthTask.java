package ThirdHomework;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {

        byte color;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер цвета радуги: ");
        while (!scanner.hasNextByte()) {
            String str = scanner.nextLine();
            System.out.println("Некорректный ввод");
        }
        color = scanner.nextByte();
        switch(color) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Цвета с таким номером нет");
        }
        scanner.close();
    }
}
