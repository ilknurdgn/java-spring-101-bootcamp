package springboot.com.techcareer.week3.saturday.jdbcTemplate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springboot.com.techcareer.week3.saturday.jdbcTemplate.service.PersonService;
import springboot.com.techcareer.week3.saturday.jdbcTemplate.entity.Person;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/personList")
    public List<Person> getPersonList() {
        return personService.getPersonList();
    }


    @GetMapping("/getPersonListByName")
    public List<Person> getPersonListByName(@RequestParam String name) {
        return personService.getPersonListByName(name);
    }
}
