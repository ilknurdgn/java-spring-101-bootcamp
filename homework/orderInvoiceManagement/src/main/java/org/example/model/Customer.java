package org.example.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private final Long id;
    private final String name;
    private final LocalDate registerDate;
    private final Set<Order> orders;

    public Customer(Long id, String name, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.registerDate = registerDate;
        this.orders = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }
}
