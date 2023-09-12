package Homework7.AdditionalTask;

import Homework7.AdditionalTask.BaseClasses.DocInformation;
import Homework7.AdditionalTask.Documents.ContractSupplyGoods;
import Homework7.AdditionalTask.Documents.EmployeeContract;
import Homework7.AdditionalTask.Documents.FinanceInvoice;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        DocInformation document;
        document = new EmployeeContract();
        register.saveDoc(document);
        document = new ContractSupplyGoods();
        register.saveDoc(document);
        document = new FinanceInvoice();
        register.saveDoc(document);
        document = new EmployeeContract(12345, new Date(2023 - 1900, 7 - 1, 27),
                new Date(2025, 7, 27), "Иванов Василий");
        register.saveDoc(document);
        document = new ContractSupplyGoods(23456, new Date(2022 - 1900, 5 - 1, 11),
                "кирамика", 13);
        register.saveDoc(document);
        document = new FinanceInvoice(43215, new Date(2022 - 1900, 12 - 1, 3),
                543.4, 90778);
        register.saveDoc(document);
        document = new EmployeeContract();
        register.saveDoc(document);
        document = new ContractSupplyGoods();
        register.saveDoc(document);
        document = new FinanceInvoice();
        register.saveDoc(document);
        document = new EmployeeContract();
        register.saveDoc(document);
        document = new ContractSupplyGoods();
        register.saveDoc(document);
        document = new FinanceInvoice();
        register.saveDoc(document);
        document = new EmployeeContract();
        register.saveDoc(document);
        document = new ContractSupplyGoods();
        register.saveDoc(document);
        document = new FinanceInvoice();
        register.saveDoc(document);
        for(byte i = 0; i < register.getQuantityOfDocuments(); i++) {
            register.displayInfo(i);
        }
    }
}
