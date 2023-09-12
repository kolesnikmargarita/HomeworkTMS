package Homework7.AdditionalTask.Documents;

import Homework7.AdditionalTask.BaseClasses.DocInformation;
import Homework7.AdditionalTask.BaseClasses.Document;

import java.util.Date;

public class FinanceInvoice extends Document implements DocInformation {

    private double totalMonthAmount;
    private int departmentCode;

    public FinanceInvoice() {
        totalMonthAmount = 0;
        departmentCode = 1111;
    }

    public FinanceInvoice(int setNumber, Date setDate, double setTotalMonthAmount, int setDepartmentCode) {
        super(setNumber, setDate);
        totalMonthAmount = setTotalMonthAmount;
        departmentCode = setDepartmentCode;
    }

    @Override
    public void displayDocInformation() {
        System.out.printf("\n- Итоговая сумма за месяц: %.2f\n" +
                "- Дата документа: %s\n" +
                "- Номер документа: %d\n" +
                "- Код департамента: %d\n", totalMonthAmount, date.toString(), number, departmentCode);
    }

}
