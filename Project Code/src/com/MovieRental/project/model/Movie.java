package com.MovieRental.project.model;

import java.util.*;

public class Movie {
    private int movieID;
    private String movieName;
    private int movieYear;
    private String movieGenre;
    private String movieDescription;
    private String movieLength;

    public ArrayList<Movie> movieList = new ArrayList<Movie>();

    public Movie(int movieID, String movieName, int movieYear, String movieGenre, String movieDescription, String movieLength) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieGenre = movieGenre;
        this.movieDescription = movieDescription;
        this.movieLength = movieLength;
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
// ------------------------------------------------------------------------------------------
    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }
}