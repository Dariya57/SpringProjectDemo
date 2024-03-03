package com.example.springprojectdemo.services.interfaces;
import com.example.springprojectdemo.models.Ticket;
import java.time.LocalTime;
import java.util.List;

public interface TicketServiceInterface {
    List<Ticket> getAll();
    Ticket getById(int id);
    Ticket create(Ticket ticket);
    List <Ticket> getByTime(LocalTime time);
}