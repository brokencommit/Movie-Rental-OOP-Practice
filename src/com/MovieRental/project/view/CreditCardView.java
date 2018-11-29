package com.MovieRental.project.view;

import com.MovieRental.project.model.CreditCard;

import java.util.Scanner;

public class CreditCardView {
    /**
     * @param customerID    the id for the customer
     * @return CreditCard   the credit card being used
     */
    public static CreditCard promptForCreditCard(int customerID) {
        System.out.println("What is card number?");
        Scanner num = new Scanner(System.in);
        String cardNumber = num.nextLine();

        System.out.println("What is the card expiration month?");
        Scanner exp = new Scanner(System.in);
        int cardExpMonth = exp.nextInt();

        System.out.println("What is the card expiration year?");
        Scanner year = new Scanner(System.in);
        int cardExpYear = year.nextInt();

        System.out.println("What is the card CCV?");
        Scanner ccv = new Scanner(System.in);
        int cardCCV = ccv.nextInt();

        System.out.println("What is the card zipcode?");
        Scanner zipp = new Scanner(System.in);
        int cardZIP = zipp.nextInt();
        return new CreditCard(customerID, cardNumber, cardExpMonth, cardExpYear, cardCCV, cardZIP);
    }
}
