package com.MovieRental.project.model;

public class CreditCard {
    private int customerID;
    private String cardNumber;
    private int cardExpMonth;
    private int cardExpYear;
    private int cardCCV;
    private int cardZIP;

    public CreditCard(int customerID, String cardNumber, int cardExpMonth, int cardExpYear, int cardCCV, int cardZIP) {
        this.customerID = customerID;
        this.cardNumber = cardNumber;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
        this.cardCCV = cardCCV;
        this.cardZIP = cardZIP;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getCardExpMonth() {
        return cardExpMonth;
    }

    public int getCardExpYear() {
        return cardExpYear;
    }

    public int getCardCCV() {
        return cardCCV;
    }

    public int getCardZIP() {
        return cardZIP;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    public void setCardCCV(int cardCCV) {
        this.cardCCV = cardCCV;
    }

    public void setCardZIP(int cardZIP) {
        this.cardZIP = cardZIP;
    }

}
