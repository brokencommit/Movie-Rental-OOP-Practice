package com.MovieRental.project.controller;
import com.MovieRental.project.model.Rental;
import java.util.List;
import java.util.ArrayList;

public class RentalController {
    private static List<Rental> rentalList = new ArrayList<>();

    public static List<Rental> getRentalList() {
        return rentalList;
    }

    public static void setRentalList(Rental r) {
        rentalList.add(r);
    }

}
