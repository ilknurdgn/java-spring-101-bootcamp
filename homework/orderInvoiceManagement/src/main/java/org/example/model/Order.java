package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Long orderId;
    private final LocalDate orderDate;
    private final List<Invoice> invoices;

    public Order(Long orderId, LocalDate orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.invoices = new ArrayList<>();
    }

    public Long getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }

}
