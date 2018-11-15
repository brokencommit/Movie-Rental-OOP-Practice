package com.MovieRental.project.controller;

import com.MovieRental.project.model.CreditCard;
import com.MovieRental.project.model.Rental;

import java.util.List;
import java.util.Scanner;

public class CheckoutController {
    public static boolean confirmCheckout(List<Rental> rental_l, CreditCard cc) {
        double totalPrice = 0.00;
        for (Rental r : rental_l) {
            totalPrice += 3.00;
        }
        // verify credit card words (magic with servers and api)
        System.out.println("The total price is: $" + String.format("%.2f", totalPrice));
        System.out.println("You are paying with: " + cc.getCardNumber());
        System.out.println("Is that okay? (yes/no)");
        Scanner choice = new Scanner(System.in);
        String confirm = choice.nextLine();
        if (confirm.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
}
