package org.example.services;


import org.example.models.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> carList = new ArrayList<>();


    //     Add new car
    public void addCar(Car car) {
        carList.add(car);
    }


    //     Remove car
    public void removeCar(Long carId) {
        carList.removeIf(car -> car.getId().equals(carId));

    }


    //     Get all car
    public void getAllCar() {

        carList.stream().forEach(car -> System.out.println(car));

    }


    //     Get car by id
    public Car getCarById(Long carId) {

        return carList.stream()
                .filter(car -> car.getId().equals(carId))
                .findFirst()
                .orElse(null);
    }


    // Filtering car
    public void filteredCar(String carModel) {

        carList.stream()
                .filter(car -> car.getModel().equals(carModel))
                .forEach(car -> System.out.println(car));

    }


    //     Filtering SUV and Hatchback
    public void filteredSUVAndHatchback() {
        carList.stream()
                .filter(car -> car.getModel().equals("SUV") || car.getModel().equals("Hatchback"))
                .forEach(car -> System.out.println(car));
    }


}
