package techCareer.week2.OOP;

public class CustomerService {

    public boolean admin;

    public CustomerService() {
    }

    public CustomerService(boolean admin) {
        this.admin = admin;
    }

    public void customerData(boolean admin) {
        if (admin) {
            System.out.println("Tüm verileri getir.");
        } else {
            System.out.println("Müşteri adını getir.");
        }
    }
}
