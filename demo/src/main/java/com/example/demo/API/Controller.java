package com.example.demo.API;

import com.example.demo.Model.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final PersonService personService;

    @Autowired
    public Controller(PersonService personService) {
        this.personService = personService;
    }

    @PatchMapping
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
