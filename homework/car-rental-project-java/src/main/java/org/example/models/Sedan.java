package org.example.models;

public class Sedan extends Car {

    private Double discountRate ;

    public Sedan(Long carId, String brand, String model, String segment, String gearType, String baggageCapacity, String color, Integer age, String fuelType, Double dailyRentalRate,  Double discountRate) {
        super(carId, brand, model, segment, gearType, baggageCapacity, color, age, fuelType, dailyRentalRate);

        this.discountRate = discountRate;
    }

    public Double getDiscountRate() {

        return discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Sedan{" +
                "discountRate=" + discountRate +
                '}';
    }

    @Override
    public Double calculateMonthlyRentalFee(){
        return  super.getDailyRentalRate() * 30 * (1- discountRate);
    }
}


