package com.example.springprojectdemo.controllers;

import com.example.springprojectdemo.services.interfaces.TicketServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springprojectdemo.models.Ticket;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;



@RestController
@RequestMapping("ticket")
public class TicketController{
    private final TicketServiceInterface service;

    public TicketController(TicketServiceInterface service) {
        this.service = service;
    }

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/")
    public List<Ticket> getAll() {
        return service.getAll();
    }

    @GetMapping("/{ticket_id}")
    public ResponseEntity<Ticket> getById(@PathVariable("ticket_id") int id) {
        Ticket ticket = service.getById(id);
        if (ticket == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(ticket, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        Ticket createdTicket = service.create(ticket);
        if (createdTicket == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED); //201
    }

    @GetMapping("/time/{ticket_time}")
    public List<Ticket> getAllByTime(@PathVariable("ticket_time") LocalTime time) {

        return service.getByTime(time);
    }
}
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> delete(@PathVariable("ticket_id") int id){
//        Ticket.delete(todoId);
//        return ResponseEntity.ok("Todo deleted successfully!.");
//
//    }