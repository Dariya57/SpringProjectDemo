package com.example.springprojectdemo.services;

import org.springframework.stereotype.Service;
import com.example.springprojectdemo.repositories.TicketRepositoryInterface;
import com.example.springprojectdemo.services.interfaces.TicketServiceInterface;
import com.example.springprojectdemo.models.Ticket;

import java.time.LocalTime;
import java.util.List;

@Service

public class TicketService implements TicketServiceInterface {

    private final TicketRepositoryInterface repo;

    public TicketService(TicketRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Ticket> getAll() {
        return repo.findAll();
    }

    @Override
    public Ticket getById(int id) {
        return repo.findById(id);
    }

    @Override
    public Ticket create(Ticket ticket) {
        return repo.save(ticket);
    }

    @Override
    public List<Ticket> getByTime(LocalTime time) {
        return repo.findByTime(time);
    }
}