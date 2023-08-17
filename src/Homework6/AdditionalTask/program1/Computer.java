package Homework6.AdditionalTask.program1;

import Homework6.AdditionalTask.program1.components.HDD;
import Homework6.AdditionalTask.program1.components.RAM;

public class Computer {

    private float price;
    private final String model;
    private final RAM randomAccessMemory;
    private final HDD hardDiskDrive;

    public Computer(float setPrice, String setModel) {
        price = setPrice;
        model = setModel;
        randomAccessMemory = new RAM();
        hardDiskDrive = new HDD();
    }

    public Computer(float setPrice, String setModel, RAM setRAM, HDD setHDD) {
        price = setPrice;
        model = setModel;
        randomAccessMemory = setRAM;
        hardDiskDrive = setHDD;
    }

    public void displayInformation() {
        System.out.println("\nmodel: " + model + "\nprice: " + price);
        randomAccessMemory.displayInformation();
        hardDiskDrive.displayInformation();
    }

    public void setPrice(float newPrise) {
        price = newPrise;
    }
}