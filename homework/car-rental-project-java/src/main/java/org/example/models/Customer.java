package org.example.models;

public class Customer {

    private final Long id;
    private String phoneNumber;
    private String customerType;

    public Customer(Long id, String phoneNumber, String customerType) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.customerType = customerType;
    }

    public Long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
