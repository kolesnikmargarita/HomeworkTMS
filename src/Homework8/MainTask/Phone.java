package Homework8.MainTask;

public class Phone {

    private String number;
    private String model;
    private short weight;

    public Phone(String setNumber, String setModel, short setWeight) {
        this(setNumber, setModel);
        weight = setWeight;
    }

    public Phone(String setNumber, String setModel) {
        number = setNumber;
        model = setModel;
    }

    public Phone() {}

    public void displayInfo() {
        System.out.println("\nnumber: " + number + "\nmodel: " + model + "\nweight: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("\nЗвонит " + name + "\nномер: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String ... phoneNumbers) {
        System.out.println();
        for(String number : phoneNumbers) {
            System.out.println(number);
        }
    }
}
