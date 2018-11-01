package com.MovieRental.project.view;

import java.util.Scanner;

public class MainView {
    public static void MainPrint() {
        System.out.println(("Please Enter in UserType (Admin, Customer):"));
        Scanner user = new Scanner(System.in);
        String userString = user.nextLine();

        if (userString.equals("Admin")) {
            AdminView.AdminPrompt();
        } else if (userString.equals("Customer")){
            CustomerView.CustomerPrompt();
        }
    }
}
