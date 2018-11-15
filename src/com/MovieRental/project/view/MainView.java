package com.MovieRental.project.view;

import com.MovieRental.project.controller.AdminController;
import com.MovieRental.project.controller.CreditCardController;
import com.MovieRental.project.controller.CustomerController;
import com.MovieRental.project.controller.MovieController;

import java.util.Scanner;

public class MainView {
    public static void MainPrint() {
        // create simulated instance of data base pretty much
        CustomerController.createHardCodeCustomers();
        AdminController.createHardCodeAdmin();
        MovieController.createHardCodeMovie();
        CreditCardController.createHardCodeCreditCard();

        System.out.println(("Please Enter in UserType: Admin (0) - Customer (1)"));
        Scanner user = new Scanner(System.in);
        int userString = user.nextInt();
        if (userString == 0) {
            AdminView.AdminPrompt();
        }
        if (userString == 1){
            CustomerView.CustomerPrompt();
        }
    }
}
