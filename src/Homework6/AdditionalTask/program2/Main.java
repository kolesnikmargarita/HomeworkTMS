package Homework6.AdditionalTask.program2;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ATM atm = new ATM(56, 35, 97);
        int choice;
        while(true) {
            System.out.println("Положить деньги - 1\nСнять деньги - 2\n");
            choice = checkInt();
            if(choice == 1) {
                addMoney(atm);
            } else if (choice == 2) {
                getMoney(atm);
            } else {
                break;
            }
        }
        scanner.close();
    }

    private static void addMoney(ATM atm) {
        int twentyDenominationBills;
        int fiftyDenominationBills;
        int hundredDenominationBills;
        System.out.print("Количество купюр номиналом 20: ");
        twentyDenominationBills = checkInt();
        System.out.print("Количество купюр номиналом 50: ");
        fiftyDenominationBills = checkInt();
        System.out.print("Количество купюр номиналом 100: ");
        hundredDenominationBills = checkInt();
        atm.addMoney(twentyDenominationBills, fiftyDenominationBills,hundredDenominationBills);
    }

    private static void getMoney(ATM atm) {
        System.out.println("Введите сумму, которую хотите снять\n");
        int amount;
        while(true) {
            if(scanner.hasNextInt()) {
                amount = scanner.nextInt();
                if(amount >= 0 && (amount % 20 == 0 || (amount - 50) % 20 == 0)) {
                    break;
                }
            }
            scanner.nextLine();
            System.out.println("Не возможно выдать запрашиваемую сумму");
        }
        if(atm.withdrawMoney(amount)) {
            System.out.println("Завершено успешно!");
        } else {
            System.out.println("Не возможно выдать запрашиваемую сумму");
        }
    }

    private static int checkInt() {
        int number;
        while(true) {
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(number >= 0) {
                    return number;
                }
            }
            scanner.nextLine();
            System.out.println("Некорректный ввод. Повторите попытку.");
        }
    }
}
