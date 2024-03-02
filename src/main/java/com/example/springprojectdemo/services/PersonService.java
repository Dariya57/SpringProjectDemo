package com.example.springprojectdemo.services;

import models.Person;
import com.example.springprojectdemo.repositories.PersonRepositoryInterface;
import com.example.springprojectdemo.services.interfaces.PersonServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonService implements PersonServiceInterface {

    private final PersonRepositoryInterface repo;

    public PersonService(PersonRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Person> getAll() {
        return repo.findAll();
    }

    @Override
    public Person getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {
        return repo.save(person);
    }

    @Override
    public List<Person> getByName(String name) {
        return repo.findByName(name);
    }
}
