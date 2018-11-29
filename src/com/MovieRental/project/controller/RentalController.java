package com.MovieRental.project.controller;
import com.MovieRental.project.model.Rental;
import java.util.List;
import java.util.ArrayList;

public class RentalController {
    /**
     * a list of rentals
     */
    private static List<Rental> rentalList = new ArrayList<>();

    /**
     * @return rentalList   the movies being rented
     */
    public static List<Rental> getRentalList() {
        return rentalList;
    }

    /**
     * @param r     adds movie to rentlist
     */
    public static void setRentalList(Rental r) {
        rentalList.add(r);
    }

}
