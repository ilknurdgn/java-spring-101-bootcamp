package org.example.models;

public abstract  class Car {
    private final Long id;
    private String brand;
    private String model;
    private String segment;
    private String gearType;
    private String baggageCapacity;
    private String color;
    private Integer age;
    private String fuelType;
    private Double dailyRentalRate;

    public Car(Long id, String brand, String model, String segment, String gearType, String baggageCapacity, String color, Integer age, String fuelType, Double dailyRentalRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.segment = segment;
        this.gearType = gearType;
        this.baggageCapacity = baggageCapacity;
        this.color = color;
        this.age = age;
        this.fuelType = fuelType;
        this.dailyRentalRate = dailyRentalRate;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(String baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Double getDailyRentalRate() {
        return dailyRentalRate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", segment='" + segment + '\'' +
                ", gearType='" + gearType + '\'' +
                ", baggageCapacity='" + baggageCapacity + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", fuelType='" + fuelType + '\'' +
                ", dailyRentalRate=" + dailyRentalRate +
                '}';
    }

    public void setDailyRentalRate(Double dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    public abstract Double calculateMonthlyRentalFee();

    public Double calculateDailyRentalFee(){
        return  dailyRentalRate;
    }





}





