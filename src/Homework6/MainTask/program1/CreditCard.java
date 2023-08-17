package Homework6.MainTask.program1;

public class CreditCard {

    private final String accountNumber;
    private float currentAccountBalance;

    public CreditCard(String setAccountNumber, float setAccountBalance) {
        accountNumber = setAccountNumber;
        currentAccountBalance = setAccountBalance;
    }

    public void addSum(float sum) {
        currentAccountBalance += sum;
    }

    public void subSum(float sum) {
        if(sum <= currentAccountBalance) {
            currentAccountBalance -= sum;
        } else {
            System.out.println("Не достаточно средств!");
        }
    }

    public void displayInformation() {
        System.out.printf("Номер счета: %s\nТекущая сумма: %.2f\n", accountNumber, currentAccountBalance);
    }
}
