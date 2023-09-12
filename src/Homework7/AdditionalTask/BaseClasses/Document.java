package Homework7.AdditionalTask.BaseClasses;

import java.util.Date;

public abstract class Document {

    protected int number;
    protected Date date;

    protected Document(){
        number = 1111;
        date = new Date();
    }

    protected Document(int setNumber, Date setDate) {
        number = setNumber;
        date = setDate;
    }
}
