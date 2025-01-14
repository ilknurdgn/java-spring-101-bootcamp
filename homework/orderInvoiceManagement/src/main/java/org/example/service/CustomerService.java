package org.example.service;

import org.example.model.Customer;
import org.example.model.Invoice;
import org.example.model.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private static final List<Customer> customers = new ArrayList<>();

    public CustomerService() {
        Customer customer1 = new Customer(100L, "Ahmet", LocalDate.of(2024,7,23));
        Customer customer2 = new Customer(101L, "Yücel", LocalDate.of(2024,6,12));
        Customer customer3 = new Customer(102L, "Melek", LocalDate.of(2023,1,8));
        Customer customer4 = new Customer(103L, "Buğra", LocalDate.of(2024,6,22));
        Customer customer5 = new Customer(104L, "Cansu", LocalDate.of(2024,8,30));
        Customer customer6 = new Customer(105L, "Firuze", LocalDate.of(2024,6,5));

        Order order1 = new Order(111L, LocalDate.of(2024,7,22));
        Order order2 = new Order(112L, LocalDate.of(2024,7,22));
        Order order3 = new Order(113L, LocalDate.of(2024,7,22));
        Order order4 = new Order(114L, LocalDate.of(2024,7,22));
        Order order5 = new Order(115L, LocalDate.of(2024,7,22));
        Order order6 = new Order(116L, LocalDate.of(2024,7,22));

        Invoice invoice1 = new Invoice(121L, 600.0);
        Invoice invoice2 = new Invoice(122L, 1000.5);
        Invoice invoice3 = new Invoice(123L, 1800.0);
        Invoice invoice4 = new Invoice(124L, 400.0);
        Invoice invoice5 = new Invoice(125L, 320.0);
        Invoice invoice6 = new Invoice(126L, 700.0);
        Invoice invoice7 = new Invoice(128L, 1564.0);

        order1.addInvoice(invoice1);
        order2.addInvoice(invoice2);
        order3.addInvoice(invoice3);
        order4.addInvoice(invoice4);
        order4.addInvoice(invoice5);
        order5.addInvoice(invoice6);
        order6.addInvoice(invoice7);

        customer1.addOrder(order1);
        customer2.addOrder(order2);
        customer3.addOrder(order3);
        customer4.addOrder(order4);
        customer5.addOrder(order5);
        customer6.addOrder(order6);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
    }

    public List<Customer> getCustomers() {
        return customers;
    }


}
