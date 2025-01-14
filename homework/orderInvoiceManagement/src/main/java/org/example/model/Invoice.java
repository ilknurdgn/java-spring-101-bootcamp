package org.example.model;

public class Invoice {

    private final Long invoiceId;
    private final double amount;

    public Invoice(Long invoiceId, double amount){
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public double getAmount() {
        return amount;
    }

}
