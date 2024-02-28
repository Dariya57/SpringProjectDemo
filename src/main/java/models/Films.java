package modules;

import java.time.LocalDate;

public class Film {

    private int id;

    private String name;

    private String ageCategory;

    private String genre;

    private int seatNumber;

    private LocalDate day;

    // Constructor without id, used to create new movies before saving them to the database
    public Film(String name, String ageCategory, String genre, int seatNumber, LocalDate day) {
        setName(name);
        setAgeCategory(ageCategory);
        setGenre(genre);
        setSeatNumber(seatNumber);
        setDay(day);
    }

    // Constructor with id, used when retrieving movie data from the database
    public Film(int id, String name, String ageCategory, String genre, int seatNumber, LocalDate day) {
        this(name, ageCategory, genre, seatNumber, day); // Вызывает первый конструктор для установки name, ageCategory, genre, seatNumber и day
        setId(id); // Дополнительно устанавливает id фильма
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    // Method to return a string representation of movie details
    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ageCategory='" + ageCategory + '\'' +
                ", genre='" + genre + '\'' +
                ", seatNumber=" + seatNumber +
                ", day=" + day +
                '}';
    }
}