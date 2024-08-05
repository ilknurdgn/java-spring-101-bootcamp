package springboot.com.techcareer.week2.sunday.OrganizationProject.service;

import org.springframework.stereotype.Service;
import springboot.com.techcareer.week2.sunday.configuration.ConfigurationAnotation;
import springboot.com.techcareer.week2.sunday.configuration.Organization;

import java.util.List;

@Service
public class OrganizationService {
    //Clint'tan gelen istek Controller Katmanında karşılandıktan sonra Service katmanına gelir.

    public List<Organization> getAllOrganizations() {
        List<Organization> organizationList = ConfigurationAnotation.organizationList;
        return organizationList;
    }

    public Organization getOrganizationById(Long organizationId) {
        List<Organization> organizationList = ConfigurationAnotation.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId().equals(organizationId)) {
                return organization;
            }
        }
        return null;
    }

    public boolean saveOrganization(Organization organization) {
        List<Organization> organizationList = ConfigurationAnotation.organizationList;
        organizationList.add(organization);
        return true;
    }

    public boolean updateOrganization(Long organizationId) {
        List<Organization> organizationList = ConfigurationAnotation.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId().equals(organizationId)) {
                organization.setOrganizationName("Wedding");
            }
        }
        return true;
    }

    public boolean deleteOrganization(Long organizationId) {
        List<Organization> organizationList = ConfigurationAnotation.organizationList;
        for (Organization organization : organizationList) {
            if (organization.getId().equals(organizationId)) {
                organizationList.remove(organization);
            }
        }
        return true;
    }
}
