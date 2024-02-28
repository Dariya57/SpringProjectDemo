package com.example.springprojectdemo.controllers;

import com.example.springprojectdemo.models.Person;
import com.example.springprojectdemo.services.interfaces.PersonServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class PersonController {

    private final PersonServiceInterface service;

    public PersonController(PersonServiceInterface service) {
        this.service = service;
    }

    @GetMapping("hello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/")
    public List<Person> getAll(){
        return service.getAll();
    }

    @GetMapping("/{person_id}")
    public ResponseEntity<Person> getById(@PathVariable("person_id") int id){
        Person person = service.getById(id);
        if(person == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(person, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody Person person){
        Person createdPerson = service.create(person);
        if(createdPerson == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); //201
    }

    @GetMapping("/surname/{person_surname}")
    public List<Person> getAllBySurname(@PathVariable("person_surname") String surname){
        return service.getBySurname(surname);
    }

}