package com.MovieRental.project.model;

import java.util.*;

public class Rental {
    private int movieID;
    private String rentalBegins;
    private String rentalEnds;

    /**
     * @param id            the id for the movie - constructor
     * @param begins        the rental beings for the movie
     * @param ends          the return time for the movie
     */
    public Rental(int id, String begins, String ends) {
        this.movieID = id;
        this.rentalBegins = begins;
        this.rentalEnds = ends;
    }

    /**
     * @return movieID  the id for the movie - getter
     */
    public int getMovieID() {
        return movieID;
    }

    /**
     * @return rentalBeigins  the rental beings for the movie - getter
     */
    public String getRentalBegins() {
        return rentalBegins;
    }

    /**
     * @return rentalends   the return time for the movie - getter
     */
    public String getRentalEnds() {
        return rentalEnds;
    }
}
