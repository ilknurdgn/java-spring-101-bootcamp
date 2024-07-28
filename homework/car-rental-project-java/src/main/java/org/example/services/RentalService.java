package org.example.services;

import org.example.models.Car;
import org.example.models.Customer;
import org.example.models.Rental;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    List<Rental> rentalList = new ArrayList<>();
    CustomerService customerService;
    CarService carService;

    public RentalService(CustomerService customerService, CarService carService) {
        this.rentalList = rentalList;
        this.customerService = customerService;
        this.carService = carService;
    }

    public void addRental(Rental rental) {
        Customer customer = customerService.getCustomerById(rental.getCustomerId());
        Car car = carService.getCarById(rental.getCarId());

        if (customer == null || car == null) {
            throw new IllegalArgumentException("Invalid customer or car.");
        }

        if (customer.getCustomerType().equals("individual") && car.getModel().equals("SUV")) {
            throw new IllegalArgumentException("Individual customers cannot rent SUV.");
        }

        if (car.getModel().equals("SUV") && rental.getDays() >= 30) {
            throw new IllegalArgumentException("SUV cars cannot be rented monthly.");
        }

        Double totalAmount = rental.getDays() >= 30 ? car.calculateMonthlyRentalFee() * (rental.getDays() / 30.0) : car.calculateDailyRentalFee() * rental.getDays();

        rental.setTotalAmount(totalAmount);
        rentalList.add(rental);
    }


    public void removeRental(Long rentalId) {
        rentalList.removeIf(rental -> rental.getId().equals(rentalId));
    }


    public void getAllRental() {
        rentalList.stream().forEach(rental -> System.out.println(rental));
    }

    public Rental  getRentalById(Long rentalId){
        return rentalList.stream()
                .filter(rental -> rental.getId().equals(rentalId))
                .findFirst()
                .orElse(null);
    }




}
