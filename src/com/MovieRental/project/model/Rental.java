package com.MovieRental.project.model;

import java.util.*;

public class Rental {
    private int movieID;
    private String rentalBegins;
    private String rentalEnds;
    public Rental(int id, String begins, String ends) {
        this.movieID = id;
        this.rentalBegins = begins;
        this.rentalEnds = ends;

    }

    public int getMovieID() {
        return movieID;
    }

    public String getRentalBegins() {
        return rentalBegins;
    }

    public String getRentalEnds() {
        return rentalEnds;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setRentalBegins(String rentalBegins) {
        this.rentalBegins = rentalBegins;
    }

    public void setRentalEnds(String rentalEnds) {
        this.rentalEnds = rentalEnds;
    }
}
