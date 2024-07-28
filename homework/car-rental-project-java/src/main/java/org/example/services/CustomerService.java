package org.example.services;

import org.example.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customerList = new ArrayList<>();


//    Add new customer
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }


//    Remove customer
    public void removeCostomer(Long customerId){
        customerList.removeIf(customer -> customer.getId().equals(customerId));
    }


//    Get customer by id
    public Customer getCustomerById(Long customerId){

       return  customerList.stream()
               .filter(customer -> customer.getId().equals(customerId))
               .findFirst()
               .orElse(null);

    }


//    Get all customer
    public void getAllCustomer(){
        customerList.stream().forEach(customer -> System.out.println(customer)  );

    }



}
