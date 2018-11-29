package com.MovieRental.project.controller;
import com.MovieRental.project.model.Admin;

import java.util.*;

public class AdminController {

    public static List<Admin> adminList = new ArrayList<>();


    public static List<Admin> createHardCodeAdmin() {
        Admin a1 = new Admin(1234);
        Admin a2 = new Admin(4448);

        adminList.add(a1);
        adminList.add(a2);

        return adminList;
    }
    /**
     * @param adminId   the id of the admin
     * @return a        the admin that logged in
     */
    public static Admin loginAdmin(int adminId){
        List<Admin> adminList = createHardCodeAdmin();
        for (Admin a : adminList) {
            if (a.getAdminId() == adminId){
                return a;
            }
        }
        System.out.println("Admin not found");
        return null;
    }
}
