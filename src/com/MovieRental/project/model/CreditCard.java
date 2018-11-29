package com.MovieRental.project.model;

public class CreditCard {
    private int customerID;
    private String cardNumber;
    private int cardExpMonth;
    private int cardExpYear;
    private int cardCCV;
    private int cardZIP;

    /**
     * @param customerID    the id of the customer - constructor
     * @param cardNumber    the card number for the credit card
     * @param cardExpMonth  the expiration month for the credit card
     * @param cardExpYear   the expiration year for the credit card
     * @param cardCCV       the ccv for the credit card
     * @param cardZIP       the zip code for the credit card
     */
    public CreditCard(int customerID, String cardNumber, int cardExpMonth, int cardExpYear, int cardCCV, int cardZIP) {
        this.customerID = customerID;
        this.cardNumber = cardNumber;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
        this.cardCCV = cardCCV;
        this.cardZIP = cardZIP;
    }

    /**
     * @return  customerID    the id of the customer - getter
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @return cardNumber    the card number for the credit card - getter
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @return cardCCV       the ccv for the credit card - getter
     */
    public int getCardCCV() {
        return cardCCV;
    }

    /**
     * @param cardNumber   the card number for the credit card - setter
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @param cardExpMonth   the card expiration month for the credit card - setter
     */
    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    /**
     * @param cardExpYear   the card expiration year for the credit card - setter
     */
    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    /**
     * @param cardCCV   the card CCV for the credit card - setter
     */
    public void setCardCCV(int cardCCV) {
        this.cardCCV = cardCCV;
    }

    /**
     * @param cardZIP   the card zip code for the credit card - setter
     */
    public void setCardZIP(int cardZIP) {
        this.cardZIP = cardZIP;
    }
}
