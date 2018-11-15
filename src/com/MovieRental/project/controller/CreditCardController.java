package com.MovieRental.project.controller;

import com.MovieRental.project.model.CreditCard;

import java.util.*;

public class CreditCardController {
    private static List<CreditCard> CreditCardList = new ArrayList<>();

    public static void createHardCodeCreditCard() {
        CreditCard cc1 = new CreditCard(1, "3333 3333 3333 3333", 5, 2018, 451, 80303);
        CreditCard cc2 = new CreditCard(2, "5555 5555 5555 5555", 9, 2018, 573, 80303);
        CreditCard cc3 = new CreditCard(3, "7777 7777 7777 7777", 5, 2018, 159, 80302);
        CreditCard cc4 = new CreditCard(4, "1111 1111 1111 1111", 7, 2018, 279, 80302);
        CreditCard cc5 = new CreditCard(1, "2222 2222 2222 2222", 12, 2018, 694, 80302);

        CreditCardList.add(cc1);
        CreditCardList.add(cc2);
        CreditCardList.add(cc3);
        CreditCardList.add(cc4);
        CreditCardList.add(cc5);
    }

    public static List<CreditCard> getCreditCardList() {
        return CreditCardList;
    }

    public static List<CreditCard> getUserCreditCard(int customerID) {
        List<CreditCard> userCard = new ArrayList<>();
        for (CreditCard cc : getCreditCardList()) {
            if (cc.getCustomerID() == customerID) {
                userCard.add(cc);
            }
        }
        return userCard;
    }

    public static CreditCard getSpecificCard(int customerID, int CCV) {
        for (CreditCard cc : getCreditCardList()) {
            if (cc.getCustomerID() == customerID && cc.getCardCCV() == CCV) {
                return cc;
            }
        }
        return null;
    }

    public List<CreditCard> deleteCreditCard(int customerID, String cardNumber) {
        for (CreditCard cc : getCreditCardList()) {
            if (cc.getCustomerID() == customerID && cc.getCardNumber().equals(cardNumber)) {
                CreditCardList.remove(cc);
                return CreditCardList;
            }
        }
        System.out.print("No such credit card was found");
        return CreditCardList;
    }

    public List<CreditCard> editCreditCard(int customerID, String cardNumber, int cardExpMonth, int cardExpYear, int cardCCV, int cardZIP) {
        for (CreditCard cc : getCreditCardList()) {
            if (cc.getCustomerID() == customerID) {
                cc.setCardNumber(cardNumber);
                cc.setCardExpMonth(cardExpMonth);
                cc.setCardExpYear(cardExpYear);
                cc.setCardCCV(cardCCV);
                cc.setCardZIP(cardZIP);
                return CreditCardList;
            }
        }
        return CreditCardList;
    }

}
