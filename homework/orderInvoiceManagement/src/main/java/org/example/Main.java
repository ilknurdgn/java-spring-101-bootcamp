package org.example;

import org.example.model.Customer;
import org.example.model.Invoice;
import org.example.service.CustomerService;
import java.util.List;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        List<Customer> customers = customerService.getCustomers();

        // Tüm müşteriler
        System.out.println("\nTüm müşteriler: ");
        customers.stream().forEach(customer -> System.out.println(customer.getName()));

        //İçinde C harfi olan müşteriler
        System.out.println("\nİçinde C harfi olan müşteriler: ");
        customers.stream().filter(customer -> customer.getName().toLowerCase().contains("c"))
                .forEach(customer -> System.out.println(customer.getName()));

        //Haziran ayında kayıt olan müşterilerin faturalarının toplam tutarı
        System.out.println("\nHaziran ayında kayıt olan müşterilerin faturalarının toplam tutarı: ");
        double totalJuneInvoice = customers.stream().filter(customer -> customer.getRegisterDate().getMonthValue() == 6)
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getInvoices().stream())
                .mapToDouble(Invoice::getAmount)
                .sum();

        System.out.println(totalJuneInvoice);

        //Sistemde kayıtlı tüm faturalar
        System.out.println("\nSistemde kayıtlı tüm faturalar:  ");
        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getInvoices().stream())
                .forEach(invoice -> System.out.println("Invoice Id: " + invoice.getInvoiceId() + " - Invoice Amount: " + invoice.getAmount()));

        //Sistemde kayıtlı 1500TL üstündeki faturalar
        System.out.println("\nSistemde kayıtlı 1500TL üstündeki faturalar: ");
        customers.stream().flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getInvoices().stream())
                .filter(invoice -> invoice.getAmount() > 1500)
                .forEach(invoice -> System.out.println( "Invoice Id: " + invoice.getInvoiceId() + " - Invoice Amount: " + invoice.getAmount()));

        //Sistemde kayıtlı 1500TL üstündeki faturaların ortalaması
        System.out.println("\nSistemde kayıtlı 1500TL üstündeki faturaların ortalaması: ");
        double averageOver1500 = customers.stream()
                .flatMap(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getInvoices().stream())
                .filter(invoice -> invoice.getAmount() > 1500))
                .mapToDouble(Invoice::getAmount)
                .average()
                .orElse(0.0);

        System.out.println(averageOver1500);

        //Sistemde kayıtlı 500TL altındaki faturalara sahip müşteriler
        System.out.println("\nSistemde kayıtlı 500TL altındaki faturalara sahip müşteriler: ");
        List<String> customerName = customers.stream()
                .filter(customer -> customer.getOrders().stream()
                .flatMap(order -> order.getInvoices().stream())
                .anyMatch(invoice -> invoice.getAmount() < 500))
                .map(Customer::getName)
                .collect(Collectors.toList());

        customerName.forEach(customer -> System.out.println(customer));



    }
}