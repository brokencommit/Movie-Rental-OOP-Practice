package com.MovieRental.project.controller;

import com.MovieRental.project.model.CreditCard;

import java.util.*;

public class CreditCardController {
    public static List<CreditCard> CreditCardList;

    public static List<CreditCard> createHardCodeCreditCard() {
        CreditCard cc1 = new CreditCard(1, "1111 1111 1111 1111", 05, 2018, 259, 80303);
        CreditCard cc2 = new CreditCard(2, "1111 1111 1111 1111", 05, 2018, 259, 80303);
        CreditCard cc3 = new CreditCard(3, "1111 1111 1111 1111", 05, 2018, 259, 80303);
        CreditCard cc4 = new CreditCard(4, "1111 1111 1111 1111", 05, 2018, 259, 80303);
        CreditCard cc5 = new CreditCard(1, "2222 2222 2222 2222", 05, 2018, 259, 80303);

        CreditCardList = new ArrayList<CreditCard>();
        CreditCardList.add(cc1);
        CreditCardList.add(cc2);
        CreditCardList.add(cc3);
        CreditCardList.add(cc4);
        CreditCardList.add(cc5);

        return CreditCardList;
    }

    public List<CreditCard> addCreditCard(int customerID, String cardNumber, int cardExpMonth, int cardExpYear, int cardCCV, int cardZIP) {
        List<CreditCard> CreditCardList = createHardCodeCreditCard();
        CreditCard newCC = new CreditCard(customerID, cardNumber, cardExpMonth, cardExpYear, cardCCV, cardZIP);
        CreditCardList.add(newCC);
        return CreditCardList;
    }

    public List<CreditCard> deleteCreditCard(int customerID, String cardNumber) {
        List<CreditCard> CreditCardList = createHardCodeCreditCard();
        for (CreditCard cc : CreditCardList) {
            if (cc.getCustomerID() == customerID && cc.getCardNumber().equals(cardNumber)) {
                CreditCardList.remove(cc);
                return CreditCardList;
            }
        }
        return CreditCardList;
    }

    public List<CreditCard> editCreditCard(int customerID, String cardNumber, int cardExpMonth, int cardExpYear, int cardCCV, int cardZIP) {
        List<CreditCard> CreditCardList = createHardCodeCreditCard();
        for (CreditCard cc : CreditCardList) {
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
