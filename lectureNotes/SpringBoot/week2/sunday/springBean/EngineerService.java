package springboot.com.techcareer.week2.sunday.springBean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class EngineerService {

    // Constructor Injection
    private final EmployeeService employeeService;
    public EngineerService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void getEmployeeValue() {
        System.out.println(this.employeeService);
    }
}
