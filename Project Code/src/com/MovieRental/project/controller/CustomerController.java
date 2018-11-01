// calculation
package com.MovieRental.project.controller;
import com.MovieRental.project.model.Customer;

import java.util.*;

public class CustomerController {
    public static List<Customer> customersList;

    public static List<Customer> createHardCodeCustomers() {
        Customer c1 = new Customer(1, "Jake", "Tran", false);
        Customer c2 = new Customer(2, "David", "Weber", true);
        Customer c3 = new Customer(3, "James", "CodeALot", false);
        Customer c4 = new Customer(4, "Blake", "DoesntCodeAlot", false);

        customersList = new ArrayList<Customer>();
        customersList.add(c1);
        customersList.add(c2);
        customersList.add(c3);
        customersList.add(c4);

        return customersList;
    }

    public static Customer loginInCustomer(String firstName, String lastName){
        List<Customer> customerList = createHardCodeCustomers();
        for (Customer c : customerList) {
            if (c.getCustomerFirstName().equals(firstName) && c.getCustomerLastName().equals(lastName)) {
                return c;
            }
        }
        System.out.println("Customer not found");
        return null;
    }


    public static List<Customer> deleteCustomer(int customerID) {
        List<Customer> customerList = createHardCodeCustomers();
        for (Customer c : customerList) {
            if (c.getCustomerID() == customerID) {
                customerList.remove(c);
            }
        }
        return customerList;
    }

    public static List<Customer> editCustomer(int customerID, String firstName, String lastName, boolean customerBanned) {
        List<Customer> customerList = createHardCodeCustomers();
        for (Customer c : customerList) {
            if (c.getCustomerID() == customerID) {
                c.setCustomerID(customerID);
                c.setCustomerFirstName(firstName);
                c.setCustomerLastName(lastName);
                c.setCustomerBanned(customerBanned);
            }
        }
        return customerList;
    }
}
