package com.example.springprojectdemo.repositories;

import models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepositoryInterface extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);
}
