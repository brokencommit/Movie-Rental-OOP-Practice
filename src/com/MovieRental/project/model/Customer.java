package com.MovieRental.project.model;

import java.util.*;

public class Customer {
    private int customerID;
    private String customerFirstName;
    private String customerLastName;
    private boolean customerBanned;

    public Customer(int customerID, String firstName, String lastName, boolean customerBanned) {
        this.customerID = customerID;
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
        this.customerBanned = customerBanned;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public boolean isCustomerBanned() {
        return customerBanned;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setCustomerBanned(boolean customerBanned) {
        this.customerBanned = customerBanned;
    }
}

