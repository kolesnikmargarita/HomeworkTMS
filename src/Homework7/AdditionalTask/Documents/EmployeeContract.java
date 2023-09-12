package Homework7.AdditionalTask.Documents;

import Homework7.AdditionalTask.BaseClasses.DocInformation;
import Homework7.AdditionalTask.BaseClasses.Document;

import java.util.Date;

public class EmployeeContract extends Document implements DocInformation {

    private Date contractEndDate;
    private String employeeName;

    public EmployeeContract() {
        employeeName = "инкогнито";
        contractEndDate = new Date();
        contractEndDate.setYear(contractEndDate.getYear() + 1);
    }

    public EmployeeContract(int setNumber, Date setDate, Date setContractEndDate, String setEmployeeName) {
        super(setNumber,setDate);
        contractEndDate = setContractEndDate;
        employeeName = setEmployeeName;
    }

    @Override
    public void displayDocInformation() {
        System.out.printf("\n- Номер документа: %d\n" +
                "- Дата документа: %s\n" +
                "- Дата окончания контракта: %s\n" +
                "- Имя сотрудника: %s\n", number, date.toString(), contractEndDate.toString(), employeeName);
    }
}
