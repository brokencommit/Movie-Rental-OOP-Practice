// calculation
package com.MovieRental.project.controller;
import com.MovieRental.project.model.Customer;

import java.util.*;

public class CustomerController {
    private static List<Customer> customersList = new ArrayList<>();

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

    public static List<Customer> getCustomersList() {
        return customersList;
    }

    public static Customer loginInCustomer(String firstName, String lastName){
        for (Customer c : getCustomersList()) {
            if (c.getCustomerFirstName().equals(firstName) && c.getCustomerLastName().equals(lastName)) {
                return c;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public static void printAllCustomer(){
        for (Customer c : getCustomersList()) {
            System.out.println(c.getCustomerID() + " " + c.getCustomerFirstName() + " " + c.getCustomerLastName() + " " + c.isCustomerBanned());
        }
    }

    public static void editCustomer(int customerID, String firstName, String lastName, boolean customerBanned) {
        for (Customer c : getCustomersList()) {
            if (c.getCustomerID() == customerID) {
                c.setCustomerID(customerID);
                c.setCustomerFirstName(firstName);
                c.setCustomerLastName(lastName);
                c.setCustomerBanned(customerBanned);
            }
        }
    }
}
