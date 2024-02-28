package modules;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

    private int idPerson;

    private int idFilm;

    private int seatNumber;

    private LocalDate scheduleDate;

    private LocalTime scheduleTime;

    // Constructor to initialize a new ticket
    public Ticket(int idPerson, int idFilm, int seatNumber, LocalDate scheduleDate, LocalTime scheduleTime) {
        this.idPerson = idPerson;
        this.idFilm = idFilm;
        this.seatNumber = seatNumber;
        this.scheduleDate = scheduleDate;
        this.scheduleTime = scheduleTime;
    }

    // Getters and setters
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(LocalDate scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public LocalTime getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(LocalTime scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    // Overridden toString method to display booking details
    @Override
    public String toString() {
        return "Ticket{" +
                "idPerson=" + idPerson +
                ", idFilm=" + idFilm +
                ", seatNumber=" + seatNumber +
                ", scheduleDate=" + scheduleDate +
                ", scheduleTime=" + scheduleTime +
                '}';
    }
}
