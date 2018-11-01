// print statements
package com.MovieRental.project.view;
import com.MovieRental.project.controller.CustomerController;
import com.MovieRental.project.model.Customer;

import java.util.*;

public class CustomerView {
    public static void CustomerPrompt() {
        System.out.println("*Logging in*");
        System.out.println("What is your First Name:");
        Scanner first = new Scanner(System.in);
        String firstString = first.nextLine();

        System.out.println("What is your Last Name:");
        Scanner last = new Scanner(System.in);
        String lastString = last.nextLine();

        Customer c = CustomerController.loginInCustomer(firstString, lastString);
        if (c != null) {
            System.out.println("Hello " + c.getCustomerFirstName() + " " + c.getCustomerLastName());

            String areYouBanned = c.isCustomerBanned() ? "Yes" : "No";
            System.out.println("Are you currently banned? " + areYouBanned);
        }
    }
}
