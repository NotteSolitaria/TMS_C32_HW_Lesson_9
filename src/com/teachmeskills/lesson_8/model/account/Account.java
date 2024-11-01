package com.teachmeskills.lesson_8.model.account;

public class Account {

    String accountNumber;
    public double amount;

    public Account(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

}
