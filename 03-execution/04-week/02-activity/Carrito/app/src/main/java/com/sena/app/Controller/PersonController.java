package com.sena.app.Controller;

import com.sena.app.Entity.Person;
import com.sena.app.Service.PersonService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> list() {
        return service.findAll();
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }
}
