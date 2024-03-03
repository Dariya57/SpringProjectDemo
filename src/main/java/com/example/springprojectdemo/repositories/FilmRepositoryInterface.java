package com.example.springprojectdemo.repositories;

import com.example.springprojectdemo.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmRepositoryInterface extends JpaRepository<Film, Integer> {
    List<Film> findByGenre(String genre);
    Film findById(int id);
    Film save(Film film);
    List<Film> findAll();
}