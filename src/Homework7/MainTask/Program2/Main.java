package Homework7.MainTask.Program2;

public class Main {

    public static void main(String[] args) {
        Display peron = new Director();
        peron.displayNameOfProfession();
        peron = new Accountant();
        peron.displayNameOfProfession();
        peron = new Employee();
        peron.displayNameOfProfession();
    }
}
