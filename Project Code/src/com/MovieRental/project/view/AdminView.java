package com.MovieRental.project.view;
import com.MovieRental.project.controller.AdminController;
import com.MovieRental.project.model.Admin;

import java.util.*;

public class AdminView {
    public static void AdminPrompt() {
        System.out.println("*Logging in*");
        System.out.println("What is your AdminId:");
        Scanner adminId = new Scanner(System.in);
        int AdminIdInt = adminId.nextInt();

        Admin a = AdminController.loginAdmin(AdminIdInt);
        if (a != null) {
            System.out.println("Hello " + a.getAdminId());
            System.out.println("Lets catch those terms of user violators!!!!!");
        }
    }
}
