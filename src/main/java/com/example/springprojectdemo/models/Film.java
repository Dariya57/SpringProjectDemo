package com.example.springprojectdemo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "film")

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "age_category")
    private String age_category;

    @Column(name = "genre")
    private String genre;

    @Column(name = "seat_number")
    private int seat_number;

    @Column(name = "day")
    private LocalDate day;

    @Column(name = "name")
    private String name;
}