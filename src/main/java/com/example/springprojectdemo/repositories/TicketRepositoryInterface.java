package com.example.springprojectdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalTime;
import com.example.springprojectdemo.models.Ticket;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TicketRepositoryInterface extends JpaRepository<Ticket, Integer> {
    List <Ticket> findByTime(LocalTime time);
    Ticket findById(int id);
    Ticket save(Ticket ticket);
    List <Ticket> findAll();
}

