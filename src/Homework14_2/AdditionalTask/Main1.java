package Homework14_2.AdditionalTask;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        students.add("Mariya");
        students.add("Aleksandr");
        students.add("Ivan");
        students.add("Marina");
        students.add("Margarita");
        students.add("Margarita");
        students.add("Nikolay");
        students.add("Aleksandr");
        students.add("Elena");
        students.add("Ekaterina");
        students.add("Margarita");
        students.add("Anna");
        students.add("Alina");
        result.append("number of students with my name is ")
                .append(students.stream().filter(t -> t.equalsIgnoreCase("Margarita")).count());
        result.append("\nNames that starts with \"A\"")
                .append(students.stream().filter(t -> t.toLowerCase().startsWith("a")).toList());
        result.append("\nFirst name in sorted stream ")
                .append(students.stream().sorted().findFirst().orElse("Empty"));
        System.out.println(result);
    }
}
