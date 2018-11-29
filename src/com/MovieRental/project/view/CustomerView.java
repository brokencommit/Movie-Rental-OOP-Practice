// print statements
package com.MovieRental.project.view;
import com.MovieRental.project.controller.CheckoutController;
import com.MovieRental.project.controller.CreditCardController;
import com.MovieRental.project.controller.CustomerController;
import com.MovieRental.project.controller.RentalController;
import com.MovieRental.project.model.CreditCard;
import com.MovieRental.project.model.Customer;
import com.MovieRental.project.model.Rental;

import java.util.*;

public class CustomerView {
    /**
     * main prompt for the customer
     */
    public static void CustomerPrompt() {
        System.out.println("Please Enter in: login (0) - signup (1)");

        Scanner type = new Scanner(System.in);
        int login_or_signup = type.nextInt();

        Customer c = null;
        if (login_or_signup == 1) {
            System.out.println("*Signing Up*");
            System.out.println("What is your First Name:");
            Scanner first = new Scanner(System.in);
            String firstString = first.nextLine();

            System.out.println("What is your Last Name:");
            Scanner last = new Scanner(System.in);
            String lastString = last.nextLine();
            c = CustomerController.SignUp(firstString, lastString);
        } else if (login_or_signup == 0) {
            System.out.println("What is your First Name:");
            Scanner first = new Scanner(System.in);
            String firstString = first.nextLine();

            System.out.println("What is your Last Name:");
            Scanner last = new Scanner(System.in);
            String lastString = last.nextLine();
            c = CustomerController.loginInCustomer(firstString, lastString);
        }
        if (c != null) {
            System.out.println("Hello " + c.getCustomerFirstName() + " " + c.getCustomerLastName());

            String areYouBanned = c.isCustomerBanned() ? "Yes" : "No";
            System.out.println("Are you currently banned? " + areYouBanned);
            MovieView.MoviePrompt();
            System.out.println("Please choose a credit card to check out with:");
            List<CreditCard> customer_cards = CreditCardController.getUserCreditCard(c.getCustomerID());
            for (CreditCard cc : customer_cards) {
                System.out.println("Credit card number: " + cc.getCardNumber() + " CCV: " + cc.getCardCCV());
            }
            System.out.println("Please select your card by 'CCV' or type 'new' to add a new card: ");
            Scanner payment = new Scanner(System.in);
            String selectCard = payment.nextLine();
            CreditCard paymentCard;
            if (selectCard.equals("new")) {
                paymentCard = CreditCardView.promptForCreditCard(c.getCustomerID());
            } else {
                paymentCard = CreditCardController.getSpecificCard(c.getCustomerID(), Integer.parseInt(selectCard));
            }

            List<Rental> rent_list = RentalController.getRentalList();
            boolean confirmPay = CheckoutController.confirmCheckout(rent_list, paymentCard);
            if (confirmPay) {
                System.out.print("Payment confirmed, thank you!");
            } else {
                System.out.print("Oh No!! Something went wrong, please try again.");
            }
        }
    }
}
