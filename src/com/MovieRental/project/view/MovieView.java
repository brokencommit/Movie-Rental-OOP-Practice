package com.MovieRental.project.view;
import com.MovieRental.project.model.Rental;

import com.MovieRental.project.controller.MovieController;
import com.MovieRental.project.controller.RentalController;
import com.MovieRental.project.model.Movie;

import java.util.*;

import static com.MovieRental.project.controller.MovieController.displayMovie;

public class MovieView {
    public static void MoviePrompt() {
        displayMovie();
        System.out.println("Select the movie ID you would like to rent out:");
        Scanner selection = new Scanner(System.in);
        String confirm_choice = "no";
        while (confirm_choice.equals("no")) {
            int pick = selection.nextInt();
            Movie m = MovieController.selectMovie(pick);
            System.out.println("Are you sure you want to rent out: " + m.getMovieName() + " (yes/no)");
            Scanner confirm = new Scanner(System.in);
            confirm_choice = confirm.nextLine();
            if (confirm_choice.equals("yes")) {
                System.out.println("Please specify when you would like to rent the movie i.e. (mm/dd/yyyy hh:mm or 11/05/2018 14:30)");
                Scanner start = new Scanner(System.in);
                String start_rent = start.nextLine();

                System.out.println("Please specify when you would like to return the movie i.e. (mm/dd/yyyy hh:mm or 11/05/2018 14:30)");
                Scanner end = new Scanner(System.in);
                String end_rent = end.nextLine();

                Rental r = new Rental(pick, start_rent, end_rent);
                RentalController.setRentalList(r);
                System.out.println("Movie ID: " + r.getMovieID() + "\nBegins: " + r.getRentalBegins() + "\nEnds: " + r.getRentalEnds());
            }
        }
    }
}