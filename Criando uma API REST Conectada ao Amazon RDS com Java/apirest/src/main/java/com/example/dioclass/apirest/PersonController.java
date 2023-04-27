package com.example.dioclass.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    @GetMapping("/")
    public String helloWord(){
        return ("This is my first API REST in Spring Boot");
    }

    // Estão dispostos todos os metodos de requisição
    @GetMapping("/persons")
    public List<Person> consultAllPersons(){
        return repositoryPerson.findAll();
    }

    @GetMapping("/person/{id}")
    public Optional<Person> consultById(@PathVariable long id){
        return repositoryPerson.findById(id);
    }
}
