package org.example.models;

public class CompanyCustomer extends Customer {

    private String companyName;
    private String taxNumber;


    public CompanyCustomer(Long id, String phoneNumber, String customerType, String companyName, String taxNumber) {
        super(id, phoneNumber, customerType);
        this.companyName = companyName;
        this.taxNumber = taxNumber;

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "CompanyCustomer{" +

                "companyName='" + companyName + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                '}';
    }
}
