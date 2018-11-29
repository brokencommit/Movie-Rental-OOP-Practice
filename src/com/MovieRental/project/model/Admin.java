package com.MovieRental.project.model;

public class Admin {
    private int adminId;

    /**
     * @param adminID   the id for the admin - constructor
     */
    public Admin(int adminID) {
        this.adminId = adminID;
    }

    /**
     * @return adminID  the id for the admin - getter
     */
    public int getAdminId() {
        return adminId;
    }
}
