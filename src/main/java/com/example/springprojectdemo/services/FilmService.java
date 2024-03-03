package com.example.springprojectdemo.services;

import com.example.springprojectdemo.models.Film;
import com.example.springprojectdemo.repositories.FilmRepositoryInterface;
import com.example.springprojectdemo.services.interfaces.FilmServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FilmService implements FilmServiceInterface {
    private final FilmRepositoryInterface repo;

    public FilmService(FilmRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Film> getAll() {
        return repo.findAll();
    }

    @Override
    public Film getById(int id) {

        return repo.findById(id);
    }

    @Override
    public Film create(Film film) {return repo.save(film);}

    @Override
    public List<Film> getByGenre(String genre) {
        return repo.findByGenre(genre);
    }
}