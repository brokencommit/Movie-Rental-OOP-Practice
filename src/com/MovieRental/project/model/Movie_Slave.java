package com.MovieRental.project.model;

public interface Movie_Slave {
    Movie GetMovie();
}

class HorrorMovie implements Movie_Slave {
    private Movie m;

    public HorrorMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "horror");
    }

    @Override
    public Movie GetMovie() {
        return m;
    }
}

class ComedyMovie implements Movie_Slave {
    private Movie m;

    public ComedyMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "comedy");
    }

    @Override
    public Movie GetMovie() {
        return m;
    }
}

class ActionMovie implements Movie_Slave {
    private Movie m;


    public ActionMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "action");
    }

    @Override
    public Movie GetMovie() {
        return m;
    }
}

