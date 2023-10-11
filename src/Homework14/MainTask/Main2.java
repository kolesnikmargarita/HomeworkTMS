package Homework14.MainTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {
        final int MSInDay = 86400000;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E");
        SimpleDateFormat simpleDateFormatForResult = new SimpleDateFormat("E dd.MM.yyyy");
        String dayOfWeekToday = simpleDateFormat.format(date);
        Date result =
        switch (dayOfWeekToday) {
            case "пн" -> new Date(date.getTime() + MSInDay);
            case "вт" -> new Date(date.getTime() + MSInDay * 7);
            case "ср" -> new Date(date.getTime() + MSInDay * 6);
            case "чт" -> new Date(date.getTime() + MSInDay * 5);
            case "пт" -> new Date(date.getTime() + MSInDay * 4);
            case "сб" -> new Date(date.getTime() + MSInDay * 3);
            case "вс" -> new Date(date.getTime() + MSInDay * 2);
            default -> null;
        };
        System.out.println(simpleDateFormatForResult.format(result));
    }
}
