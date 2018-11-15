package com.MovieRental.project.view;
import com.MovieRental.project.controller.AdminController;
import com.MovieRental.project.controller.CustomerController;
import com.MovieRental.project.controller.MovieController;
import com.MovieRental.project.model.Admin;
import com.MovieRental.project.model.Customer;
import com.MovieRental.project.model.Movie;
import com.MovieRental.project.model.MovieFactory;

import java.util.*;

public class AdminView {
    public static void AdminPrompt() {
        System.out.println("*Logging in*");
        System.out.println("What is your AdminId:");
        Scanner adminId = new Scanner(System.in);
        int AdminIdInt = adminId.nextInt();

        Admin a = AdminController.loginAdmin(AdminIdInt);
        if (a != null) {
            int pick = -1;
            while (pick != 0) {
                System.out.println("Hello " + a.getAdminId());
                System.out.println("(0) to exit");
                System.out.println("(1) Would you like to ban a customer");
                System.out.println("(2) Would you like to add a movie");
                System.out.println("(3) Would you like to delete a movie");
                Scanner admin_choice = new Scanner(System.in);
                pick = admin_choice.nextInt();
                if (pick == 1) {
                    CustomerController.printAllCustomer();
                    System.out.println("Who would you like to ban for violating the terms of use? (first name)");
                    Scanner customer_first = new Scanner(System.in);
                    String first_name = customer_first.nextLine();
                    System.out.println("Who would you like to ban for violating the terms of use? (last name)");
                    Scanner customer_last = new Scanner(System.in);
                    String last_name = customer_last.nextLine();
                    Customer c = CustomerController.loginInCustomer(first_name, last_name);
                    if (c != null) {
                        c.setCustomerBanned(true);
                        CustomerController.printAllCustomer();
                    } else {
                        System.out.println("Please confirm you entered in the right name");
                    }
                } else if (pick == 2) {
                    System.out.println("What movie would you like to add?");
                    System.out.println("id?");
                    Scanner id_in = new Scanner(System.in);
                    int id = id_in.nextInt();
                    System.out.println("Title?");
                    Scanner name_in = new Scanner(System.in);
                    String name = name_in.nextLine();
                    System.out.println("Year?");
                    Scanner year_in = new Scanner(System.in);
                    int year = year_in.nextInt();
                    System.out.println("Description?");
                    Scanner d_in = new Scanner(System.in);
                    String description = d_in.nextLine();
                    System.out.println("Length?");
                    Scanner length_in = new Scanner(System.in);
                    String length = length_in.nextLine();
                    System.out.println("Genre?");
                    Scanner genre_in = new Scanner(System.in);
                    String genre = genre_in.nextLine();

                    Movie new_movie = MovieFactory.generateMovieType(id, name, year, description, length, genre);
                    MovieController.addToMovieList(new_movie);
                    MovieController.displayMovie();
                } else if (pick == 3) {
                    MovieController.displayMovie();
                    System.out.println("Please select the movie id you wish to delete");
                    Scanner id_ = new Scanner(System.in);
                    int deleteMovieID = id_.nextInt();
                    MovieController.removeFromMovieList(deleteMovieID);
                    System.out.println("delete a movie here");
                }

            }
        }
    }
}
