package com.example.springprojectdemo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "price")
    private double price;

    @Column(name = "id_person")
    private int id_person;

    @Column(name = "name_person")
    private String name_person;
}