package com.example.springprojectdemo.models;

import jakarta presistence.*;
import lombok.Data;
import java.time.LocalDate;


public class Tickets {
    private int id;
    private String time;
    private String date;

    public Tickets(int id, String time, String date) {
        this.id = id;
        this.time = time;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
