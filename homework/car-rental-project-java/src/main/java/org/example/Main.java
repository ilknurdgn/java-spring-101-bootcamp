package org.example;

import org.example.models.*;
import org.example.services.CarService;
import org.example.services.CustomerService;
import org.example.services.RentalService;

public class Main {
    public static void main(String[] args) {

//--------------------------------------------------------------------------------------------------------------------//

        CustomerService customerService = new CustomerService();

        Customer customer1 = new IndividualCustomer(10L, "9898989890809", "individual", "ilknur", "doğan", "969596959669");
        Customer customer2 = new CompanyCustomer(11L, "9898989890809", "company", "trendyol", "969596959669");
        Customer customer3 = new IndividualCustomer(12L, "9898989890809", "individual", "enes", "kaya", "969596959669");
        Customer customer4 = new CompanyCustomer(13L, "9898989890809", "company", "hepsiburada", "969596959669");

        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
        customerService.addCustomer(customer3);
        customerService.addCustomer(customer4);


        System.out.println("\nTüm müşteriler");
        customerService.getAllCustomer();

        System.out.println("\nid'si verilen müşteri");
        Customer customer = customerService.getCustomerById(11L);
        System.out.println(customer);

//--------------------------------------------------------------------------------------------------------------------//

        CarService carService = new CarService();

        Car car1 = new SUV(1L, "Ford", "SUV", "bilmiyom", "manuel", "500", "white", 3, "dizel", 3740.5);
        Car car2 = new Hatchback(2L, "Ford", "Hatchback", "bilmiyom", "manuel", "500", "white", 3, "dizel", 1999.9, 0.05);
        Car car3 = new Sedan(3L, "Ford", "Sedan", "bilmiyom", "manuel", "500", "white", 3, "dizel", 2544.5, 0.07);

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);

        System.out.println("\nTüm araçlar");
        carService.getAllCar();

        System.out.println("\nid'si verilen araç");
        Car car = carService.getCarById(1L);
        System.out.println(car);

        System.out.println("\nSUV ve Hatchback araçlar");
        carService.filteredCar("SUV");
        carService.filteredCar("Hatchback");

//--------------------------------------------------------------------------------------------------------------------//

        RentalService rentalService = new RentalService(customerService, carService);

        Rental rental1 = new Rental(20L, 5,  0.0,10L, 1L);
        Rental rental2 = new Rental(21L, 30, 0.0,12L, 2L);
        Rental rental3 = new Rental(22L, 45, 0.0,13L, 3L);
        Rental rental4 = new Rental(23L, 33, 0.0,11L, 1L);



        //rentalService.addRental(rental1); // Individual customers cannot rent SUV.
        rentalService.addRental(rental2);
        rentalService.addRental(rental3);
        //rentalService.addRental(rental4); // SUV cars cannot be rented monthly.

        System.out.println("\nTüm araç kiralama bilgileri: ");
        rentalService.getAllRental();

        System.out.println("\nid'si verilen kiralama");
        Rental rental = rentalService.getRentalById(22L);
        System.out.println(rental);


//--------------------------------------------------------------------------------------------------------------------//





    }
}