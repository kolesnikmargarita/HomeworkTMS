package Homework6.MainTask.program1;

public class Program {

    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("BY7568347587435", 43.65f);
        CreditCard secondCreditCard = new CreditCard("BY7568347587436", 245.00f);
        CreditCard thirdCreditCard = new CreditCard("BY7568347587437", 85.97f);

        firstCreditCard.increaseBalance(87.00f);
        secondCreditCard.increaseBalance(55.76f);
        thirdCreditCard.shrinkBalance(34.54f);

        firstCreditCard.displayInformation();
        secondCreditCard.displayInformation();
        thirdCreditCard.displayInformation();
    }
}
