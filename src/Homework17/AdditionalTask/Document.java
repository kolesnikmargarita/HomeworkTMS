package Homework17.AdditionalTask;

import java.util.ArrayList;
import java.util.function.Function;

public class Document implements Function<ArrayList<String>, StringBuilder> {

    private ArrayList<String> numberOfDoc = new ArrayList<>();
    private ArrayList<String> phoneNumber = new ArrayList<>();
    private ArrayList<String> email = new ArrayList<>();

    public void setNumberOfDoc(ArrayList<String> setNumberOfDoc) {
        numberOfDoc = setNumberOfDoc;
    }

    public void setPhoneNumber(ArrayList<String> setPhoneNumber) {
        phoneNumber = setPhoneNumber;
    }

    public void setEmail(ArrayList<String> setEmail) {
        email = setEmail;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Номера документов: ").append(apply(numberOfDoc))
                .append("Номера телефонов: ").append(apply(phoneNumber))
                .append("email: ").append(apply(email));
        return result.append("\n").toString();
    }

    public StringBuilder apply(ArrayList<String> arrayList) {
        StringBuilder result = new StringBuilder("\n");
        for(String element : arrayList) {
            result.append(element).append("\n");
        }
        return result;
    }
}
