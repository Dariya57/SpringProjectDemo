package com.example.springprojectdemo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "films")

public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    public String name;

    @Column(name = "ageCategory")
    private String ageCategory;

    @Column(name = "genre")
    private String genre;

    @Column(name = "seatNumber")
    private int seatNumber;

    @Column(name = "day")
    private LocalDate day;
}