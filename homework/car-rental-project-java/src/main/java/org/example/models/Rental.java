package org.example.models;


public class Rental {

    private final Long id;
    private Integer days;
    private Double totalAmount;
    private final Long customerId;
    private final Long carId;

    public Rental(Long id, Integer days,Double totalAmount, Long customerId, Long carId) {
        this.id = id;
        this.days = days;
        this.totalAmount = totalAmount;
        this.customerId = customerId;
        this.carId = carId;
    }

    public Long getId() {
        return id;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getCarId() {
        return carId;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", days=" + days +
                ", totalAmount=" + totalAmount +
                ", customerId=" + customerId +
                ", carId=" + carId +
                '}';
    }
}