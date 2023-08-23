package Homework7.AdditionalTask;

import Homework7.AdditionalTask.BaseClasses.DocInformation;

public class Register {

    private int quantityOfDocuments = 0;
    private DocInformation[] documentArr = new DocInformation[10];

    public void saveDoc(DocInformation document) {
        documentArr[quantityOfDocuments] = document;
        quantityOfDocuments++;
    }

    public void displayInfo(byte number) {
        documentArr[number].displayDocInformation();
    }

    public int getQuantityOfDocuments() {
        return quantityOfDocuments;
    }
}
