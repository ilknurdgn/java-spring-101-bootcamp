package org.example.models;

public  class SUV extends Car {


    public SUV(Long carId, String brand, String model, String segment, String gearType, String baggageCapacity, String color, Integer age, String fuelType, Double dailyRentalRate) {
        super(carId, brand, model, segment, gearType, baggageCapacity, color, age, fuelType, dailyRentalRate);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "SUV{}";
    }

    @Override
    public Double calculateMonthlyRentalFee(){
         throw new UnsupportedOperationException("SUV's can only be rented by the day.");
    }
}
