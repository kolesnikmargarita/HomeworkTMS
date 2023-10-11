package Homework14.MainTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {
        Date date;
        int day;
        int month;
        int year;
        Predicate<Integer> predicate;
        Calendar calendar = Calendar.getInstance();
        System.out.println("Введите число: ");
        predicate = t -> t > 0 && t <= 31;
        day = check(predicate);
        System.out.println("Введите номер месяца: ");
        predicate = t -> t > 0 && t <= 12;
        month = check(predicate) - 1;
        System.out.println("Введите год: ");
        predicate = t -> t > 0;
        year = check(predicate);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E");
        System.out.println(
                switch (simpleDateFormat.format(date)) {
                    case "пн" -> "понедельник";
                    case "вт" -> "вторник";
                    case "ср" -> "среда";
                    case "чт" -> "четверг";
                    case "пт" -> "пятница";
                    case "сб" -> "суббота";
                    case "вс" -> "воскресенье";
                    default -> "неизвестный день";
                }
        );
    }

    private static int check(Predicate<Integer> predicate) {
        Scanner scanner = new Scanner(System.in);
        int result;
        while (true) {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (predicate.test(result)) {
                    return result;
                }
            }
            scanner.nextLine();
            System.out.println("Некорректный ввод, повторите попытку.");
        }
    }
}
