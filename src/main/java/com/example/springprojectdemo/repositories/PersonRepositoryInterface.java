package com.example.springprojectdemo.repositories;

import com.example.springprojectdemo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepositoryInterface extends JpaRepository<Person, Integer> {
    List<Person> findBySurname(String surname);
}
