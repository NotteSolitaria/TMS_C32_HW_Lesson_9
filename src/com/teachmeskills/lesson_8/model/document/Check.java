package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты +
// TODO создать метод для вывода информации о чеке на экран +
public class Check {

    public double transferAmount;
    public Date transferDate;
    String fromNumber;
    String toNumber;
    String comment;

    public Check(double transferAmount, Date transferDate, String fromNumber, String toNumber, String comment) {
        this.transferAmount = transferAmount;
        this.transferDate = transferDate;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.comment = comment;
    }

    public void showCheckInfo(){
        System.out.println("Transfer amount:" + this.transferAmount
                + "Date of Transfer:" + this.transferDate
                + ", from:" + this.fromNumber
                + " , to:" + this.toNumber
                + " . Comment: " + this.comment);
    }

}
