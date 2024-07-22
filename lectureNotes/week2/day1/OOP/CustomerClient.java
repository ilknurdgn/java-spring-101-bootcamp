package techCareer.week2.OOP;

public class CustomerClient {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.customerData(true);

        CustomerService customerService1 = new CustomerService(true);
    }
}
