package com.MovieRental.project.model;

public class Customer {
    private int customerID;
    private String customerFirstName;
    private String customerLastName;
    private boolean customerBanned;

    /**
     * @param customerID        the users id - constructor
     * @param firstName         the users first name - constructor
     * @param lastName          the users last name
     * @param customerBanned    the users banned status - boolean
     */
    public Customer(int customerID, String firstName, String lastName, boolean customerBanned) {
        this.customerID = customerID;
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
        this.customerBanned = customerBanned;
    }

    /**
     * @return customerID   the id for the customer - getter
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @return customerFirstName   the first name for the customer - getter
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * @return customerLastName   the last name for the customer - getter
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * @return customerBanned   the banned status for the customer - getter
     */
    public boolean isCustomerBanned() {
        return customerBanned;
    }

    /**
     * @param customerBanned    the banned status for the customer - setter
     */
    public void setCustomerBanned(boolean customerBanned) {
        this.customerBanned = customerBanned;
    }
}

