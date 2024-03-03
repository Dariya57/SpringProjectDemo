package com.example.springprojectdemo.services.interfaces;
import com.example.springprojectdemo.models.Film;

import java.util.List;

public interface FilmServiceInterface {
    List<Film> getAll();
    Film getById(int id);
    Film create(Film film);
    List<Film> getByGenre(String genre);
}
