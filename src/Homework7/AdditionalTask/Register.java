package Homework7.AdditionalTask;

import Homework7.AdditionalTask.BaseClasses.DocInformation;

public class Register {

    private int quantityOfDocuments;
    private final int lengthOfDocumentsArr;
    private DocInformation[] documentArr;
    private int quantityOfDocumentsArr;
    private DocInformation[][] arrOfDocumentsArr;

    public Register() {
        quantityOfDocuments = 0;
        lengthOfDocumentsArr = 10;
        documentArr = new DocInformation[lengthOfDocumentsArr];
        quantityOfDocumentsArr = 1;
        arrOfDocumentsArr = new DocInformation[quantityOfDocumentsArr][];
        arrOfDocumentsArr[0] = documentArr;
    }

    public void saveDoc(DocInformation document) {
        if(quantityOfDocuments == lengthOfDocumentsArr) {
            quantityOfDocumentsArr++;
            DocInformation[][] copyArrOfDocumentsArr = new DocInformation[quantityOfDocumentsArr][];
            for(int i = 0; i < arrOfDocumentsArr.length; i++) {
                copyArrOfDocumentsArr[i] = arrOfDocumentsArr[i];
            }
            documentArr = new DocInformation[lengthOfDocumentsArr];
            copyArrOfDocumentsArr[quantityOfDocumentsArr - 1] = documentArr;
            arrOfDocumentsArr = copyArrOfDocumentsArr;
        }
        documentArr[quantityOfDocuments % 10] = document;
        quantityOfDocuments++;
    }

    public void displayInfo(byte number) {
        arrOfDocumentsArr[number / 10][number % 10].displayDocInformation();
    }

    public int getQuantityOfDocuments() {
        return quantityOfDocuments;
    }
}
