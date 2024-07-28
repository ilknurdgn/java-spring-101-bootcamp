package lectureNotes.week2.day2.springBean;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
     // Constructor Injection
     private final ManagerService managerService;
     private final EngineerService engineerService;
 
     public SpringBean(ManagerService managerService, EngineerService engineerService) {
         this.managerService = managerService;
         this.engineerService = engineerService;
     }
 
 
     @Override
     public void run(String... args) throws Exception {
         managerService.getEmployeeValue();
         engineerService.getEmployeeValue();
     }
}
