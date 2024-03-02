package com.example.springprojectdemo.controllers;

import com.example.springprojectdemo.services.interfaces.PersonServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
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
    public ResponseEntity<Person> create(@RequestBody Person person){
        Person createdPerson = service.create(person);
        if(createdPerson == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED); //201
    }

    @GetMapping("/name/{person_name}")
    public List<Person> getAllByName(@PathVariable("person_name") String name){
        return service.getByName(name);
    }

}