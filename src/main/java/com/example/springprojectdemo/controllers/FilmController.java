package com.example.springprojectdemo.controllers;

import com.example.springprojectdemo.services.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springprojectdemo.models.Films;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("film")
public class FilmController {
    private final FilmService service;

public FilmController(FilmService service) {
    this.service = service;
}

@GetMapping("/")
public List<Films> getAll(){
    return service.getAll();
}

@GetMapping("/{film_id}")
public ResponseEntity<Films> getById(@PathVariable("film_id") int id){
    Films films = service.getById(id);
    if(films == null)
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    return new ResponseEntity<>(films, HttpStatus.OK);
}

@PostMapping("/")
public ResponseEntity<Films> create(@RequestBody Films films){
    Films createdFilm = service.create(films);
    if(createdFilm == null)
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    return new ResponseEntity<>(createdFilm, HttpStatus.CREATED);
}

@GetMapping("/genre/{film_genre}")
public List<Films> getAllByGenre(@PathVariable("film_genre") String genre){
    return service.getByGenre(genre);
}

}
