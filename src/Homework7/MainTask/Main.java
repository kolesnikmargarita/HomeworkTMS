package Homework7.MainTask;

public class Main {

    public static void main(String[] args) {
        Phone firstPhone = new Phone("+375447689834", "HONOR", (short)183);
        Phone secondPhone = new Phone("+375257683478", "POCO F5", (short)181);
        Phone thirdPhone = new Phone("+375337854987", "Infinix Note 30", (short)219);
        firstPhone.displayInfo();
        secondPhone.displayInfo();
        thirdPhone.displayInfo();
        System.out.println();
        firstPhone.receiveCall("Liz");
        secondPhone.receiveCall("Mark");
        thirdPhone.receiveCall("Ann");
        System.out.println("\n" + firstPhone.getNumber() + "\n" + secondPhone.getNumber() + "\n" + thirdPhone.getNumber());
        firstPhone.receiveCall("Mary", "+375296754678");
        secondPhone.receiveCall("Anton", "+375256748908");
        secondPhone.receiveCall("Pavel", "+375338764389");
        firstPhone.sendMessage("+373296758934", "+375446782605");
        secondPhone.sendMessage("+375258578723");
        thirdPhone.sendMessage("+375446726743", "+375257835590", "+375297857623", "+375337869843", "+375258750098");
    }
}
