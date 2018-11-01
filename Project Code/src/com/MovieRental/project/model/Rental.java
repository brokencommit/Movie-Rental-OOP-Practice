package com.MovieRental.project.model;

import java.util.*;

public class Rental {
    private int movieID;
    private Date rentalBegins;
    private Date rentalEnds;

//    public addRental() {
//
//    }
//
//    public deleteRental() {
//
//    }

    public int getMovieID() {
        return movieID;
    }

    public Date getRentalBegins() {
        return rentalBegins;
    }

    public Date getRentalEnds() {
        return rentalEnds;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setRentalBegins(Date rentalBegins) {
        this.rentalBegins = rentalBegins;
    }

    public void setRentalEnds(Date rentalEnds) {
        this.rentalEnds = rentalEnds;
    }
}
