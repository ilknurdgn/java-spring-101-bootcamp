package org.example.models;

public class IndividualCustomer extends Customer {

    private String firstName;
    private String lastName;
    private final String tc;


    public IndividualCustomer(Long id, String phoneNumber, String customerType, String firstName, String lastName, String tc) {
        super(id, phoneNumber, customerType);
        this.firstName = firstName;
        this.lastName = lastName;
        this.tc = tc;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTc() {
        return tc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "IndividualCustomer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tc='" + tc + '\'' +
                '}';
    }
}
