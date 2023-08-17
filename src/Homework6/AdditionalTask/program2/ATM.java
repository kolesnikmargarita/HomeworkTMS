package Homework6.AdditionalTask.program2;

public class ATM {

    private int twentyDenominationBills;
    private int fiftyDenominationBills;
    private int hundredDenominationBills;

    public ATM(int setTwentyDenominationBills, int setFiftyDenominationBills, int setHundredDenominationBills) {
        twentyDenominationBills = setTwentyDenominationBills;
        fiftyDenominationBills = setFiftyDenominationBills;
        hundredDenominationBills = setHundredDenominationBills;
    }

    public void addMoney(int newTwentyDenominationBills, int newFiftyDenominationBills, int newHundredDenominationBills) {
        twentyDenominationBills += newTwentyDenominationBills;
        fiftyDenominationBills += newFiftyDenominationBills;
        hundredDenominationBills += newHundredDenominationBills;
    }

    public boolean withdrawMoney(int amount) {
        int getTwentyDenominationBills;
        int getFiftyDenominationBills;
        int getHundredDenominationBills;
        if(20 * twentyDenominationBills + 50 * fiftyDenominationBills + 100 * hundredDenominationBills > amount) {
            getHundredDenominationBills = (int) (amount / 100);
            if(getHundredDenominationBills > hundredDenominationBills) {
                getHundredDenominationBills = hundredDenominationBills;
            }
            amount -= getHundredDenominationBills * 100;
            getFiftyDenominationBills = (int) (amount / 50);
            if(getFiftyDenominationBills > fiftyDenominationBills) {
                getFiftyDenominationBills = fiftyDenominationBills;
            }
            amount -= getFiftyDenominationBills * 50;
            if(amount % 20 != 0 && getFiftyDenominationBills > 0) {
                getFiftyDenominationBills--;
                amount += 50;
            }
            getTwentyDenominationBills = (int) (amount / 20);
            if(getTwentyDenominationBills > twentyDenominationBills) {
                getTwentyDenominationBills = twentyDenominationBills;
            }
            amount -= getTwentyDenominationBills * 20;
            if (amount == 0) {
                System.out.printf("К выдаче:\n номиналом 20           %d\n" +
                        " номиналом 50           %d\n номиналом 100           %d\n",
                        getTwentyDenominationBills, getFiftyDenominationBills,
                        getHundredDenominationBills);
                hundredDenominationBills -= getHundredDenominationBills;
                fiftyDenominationBills -= getFiftyDenominationBills;
                twentyDenominationBills -= getTwentyDenominationBills;
                return true;
            }
        }
        return  false;
    }
}
