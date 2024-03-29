package com.example.springprojectdemo.services.interfaces;

import com.example.springprojectdemo.models.Person;
import java.util.List;

public interface PersonServiceInterface {
    List<Person> getAll();
    Person getById(int id);
    Person create(Person person);
    List<Person> getByName(String name);
}
