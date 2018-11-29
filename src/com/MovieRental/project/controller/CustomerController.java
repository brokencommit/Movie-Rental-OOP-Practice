// calculation
package com.MovieRental.project.controller;
import com.MovieRental.project.model.Customer;

import java.util.*;

public class CustomerController {
    /**
     * a list of customers to simulate a data base
     */
    private static List<Customer> customersList = new ArrayList<>();

    /**
     * generates a list of customers to simulate a data base
     */
    public static void createHardCodeCustomers() {
        Customer c1 = new Customer(1, "Jake", "Tran", false);
        Customer c2 = new Customer(2, "David", "Weber", true);
        Customer c3 = new Customer(3, "James", "CodeALot", false);
        Customer c4 = new Customer(4, "Blake", "DoesntCodeAlot", false);

        customersList.add(c1);
        customersList.add(c2);
        customersList.add(c3);
        customersList.add(c4);
    }

    /**
     * @return customersList    a list of all customers stored in the system
     */
    public static List<Customer> getCustomersList() {
        return customersList;
    }

    /**
     * @param firstName     the users first name
     * @param lastName      the users last name
     * @return c            the customer associated with
     */
    public static Customer loginInCustomer(String firstName, String lastName){
        for (Customer c : getCustomersList()) {
            if (c.getCustomerFirstName().equals(firstName) && c.getCustomerLastName().equals(lastName)) {
                return c;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    /**
     * @param firstName     the users first name
     * @param lastName      the users last name
     * @return c            a new customer
     */
    public static Customer SignUp(String firstName, String lastName) {
        Customer c = new Customer(customersList.size()+1, firstName, lastName, false);
        customersList.add(c);
        return c;
    }

    /**
     * prints out all customers
     */
    public static void printAllCustomer(){
        for (Customer c : getCustomersList()) {
            System.out.println(c.getCustomerID() + " " + c.getCustomerFirstName() + " " + c.getCustomerLastName() + " " + c.isCustomerBanned());
        }
    }
}
