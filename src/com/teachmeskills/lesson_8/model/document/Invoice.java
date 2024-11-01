package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

// TODO добавить поля на свое усмотрение +
public class Invoice {

    private String number;
    private Date invoiceDate;
    private double amount;
    private String supplierName;

    public Invoice(String number, Date invoiceDate, double amount, String supplierName) {
        this.number = number;
        this.invoiceDate = invoiceDate;
        this.amount = amount;
        this.supplierName = supplierName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
