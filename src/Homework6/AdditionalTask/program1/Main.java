package Homework6.AdditionalTask.program1;

import Homework6.AdditionalTask.program1.components.HDD;
import Homework6.AdditionalTask.program1.components.RAM;

public class Main {

    public static void main(String[] args) {

        Computer firstComputer = new Computer(3299.00f, "Huawei MateBook D 16");
        Computer secondComputer = new Computer(2197.00f, "Lenovo IdeaPad 3",
                new RAM("DDR4", 16),
                new HDD("WD22PURZ", 2000, "внутренний"));
        firstComputer.displayInformation();
        secondComputer.displayInformation();
    }
}
