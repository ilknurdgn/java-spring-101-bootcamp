package springboot.com.techcareer.week2.sunday.OrganizationProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.com.techcareer.week2.sunday.OrganizationProject.service.OrganizationService;
import springboot.com.techcareer.week2.sunday.configuration.Organization;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/organization")
@RequiredArgsConstructor  //final değerler için constructor oluşturur.
public class OrganizationController {
    //Controller Clint'ten gelen isteğine ilk karşılandığı ve Client'e çıkan son noktadır.

    // Constructor Injection
    private final OrganizationService organizationService;

    @GetMapping("/getAllOrganization")
    public List<Organization> getAllOrganizations() {
        List<Organization> allOrganizations = organizationService.getAllOrganizations();
        return allOrganizations;
    }

//    @GetMapping("/getOrganizationById")
//    public Organization getOrganizationById(@RequestParam Long organizationId){
//        return organizationService.getOrganizationById(organizationId);
//    }

    @GetMapping("/getOrganizationById")
    public ResponseEntity<Organization> getOrganizationById(@RequestParam Long organizationId) {
        Organization organization = organizationService.getOrganizationById(organizationId);
        if (Objects.isNull(organization)) {
            return new ResponseEntity<>(organization, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(organization, HttpStatus.OK);
    }

    @PostMapping("saveOrganization")
    public boolean saveOrganization(@RequestBody Organization organization) {
        return organizationService.saveOrganization(organization);
    }

    @PutMapping("/updateOrganization")
    public ResponseEntity<Boolean> updateOrganization(@RequestParam Long organizationId) {
        boolean isUpdate = organizationService.updateOrganization(organizationId);
        return new ResponseEntity<>(isUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/deleteOrganization")
    public ResponseEntity<Boolean> deleteOrganization(@RequestParam Long organizationId) {
        boolean isDelete = organizationService.deleteOrganization(organizationId);
        return new ResponseEntity<>(isDelete, HttpStatus.OK);
    }

}
