package springboot.com.techcareer.week2.sunday.configuration;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationAnotation {
    public static List<Organization> organizationList = new ArrayList<>();

    @PostConstruct
    public void fillOrganizationList() {
        Organization organization = new Organization();
        organization.setId(133L);
        organization.setOrganizationName("Düğün");
        organization.setAddress("Atakum");

        Organization organization1 = new Organization();
        organization1.setId(453L);
        organization1.setOrganizationName("Nişan");
        organization1.setAddress("Kadıköy");

        organizationList.add(organization);
        organizationList.add(organization1);
        //  System.out.println(organizationList.get(0));
    }
}
