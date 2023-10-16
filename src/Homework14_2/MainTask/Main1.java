package Homework14_2.MainTask;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arrLength = (int)(Math.random() * 10 + 7);
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < arrLength; i++) {
            arrayList.add((int)(Math.random() * 50) - 25);
            line.append(arrayList.get(i)).append(" ");
        }
        line.append("\n").append(arrayList.stream().distinct().collect(Collectors.toList())).append("\n");
        line.append(arrayList.stream().filter(t -> t > 7 && t < 17 && t % 2 == 0)
                .collect(Collectors.toList()));
        System.out.println(line);
        line.delete(0, line.length());
        arrayList.stream().forEach(consumer -> System.out.print(consumer * 2 + " "));
        int[] sum = {0};
        line.append("\n").append(arrayList.stream().sorted().limit(4).collect(Collectors.toList()))
                .append("\n").append(arrayList.stream().count()).append("\n");
        arrayList.stream().forEach(consumer -> sum[0] += consumer);
        line.append((float)sum[0] / arrayList.size());
        System.out.println(line);
    }
}
