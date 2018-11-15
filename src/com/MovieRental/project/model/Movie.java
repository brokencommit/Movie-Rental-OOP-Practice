package com.MovieRental.project.model;

public class Movie {
    private int movieID;
    private String movieName;
    private int movieYear;
    private String movieGenre;
    private String movieDescription;
    private String movieLength;


    public Movie(int id, String name, int year, String description, String length, String genre) {
        this.movieID = id;
        this.movieName = name;
        this.movieYear = year;
        this.movieDescription = description;
        this.movieLength = length;
        this.movieGenre = genre;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public String getMovieLength() {
        return movieLength;
    }
}