package com.example.springprojectdemo.controllers;

import com.example.springprojectdemo.services.FilmService; import org.springframework.web.bind.annotation.GetMapping; import org.springframework.web.bind.annotation.RequestMapping; import org.springframework.web.bind.annotation.RestController;

import com.example.springprojectdemo.models.Film; import org.springframework.http.HttpStatus; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("film") public class FilmController { private final FilmService service;

public FilmController(FilmService service) {
    this.service = service;
}

@GetMapping("/")
public List<Film> getAll(){
    return service.getAll();
}

@GetMapping("/{film_id}")
public ResponseEntity<Film> getById(@PathVariable("film_id") int id){
    Film film = service.getById(id);
    if(film == null)
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    return new ResponseEntity<>(film, HttpStatus.OK);
}

@PostMapping("/")
public ResponseEntity<Film> create(@RequestBody Film film){
    Film createdFilm = service.create(film);
    if(createdFilm == null)
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    return new ResponseEntity<>(createdFilm, HttpStatus.CREATED);
}

@GetMapping("/genre/{film_genre}")
public List<Film> getAllByGenre(@PathVariable("film_genre") String genre){
    return service.getByGenre(genre);
}

}
