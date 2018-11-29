package com.MovieRental.project.model;

public interface Movie_Slave {
    Movie GetMovie();
}

class HorrorMovie implements Movie_Slave {
    private Movie m;

    /**
     * @param id            the id for the movie - constructor for horror movie factory
     * @param name          the name for the movie
     * @param year          the year for the movie
     * @param description   the description for the movie
     * @param length        the length for the movie
     */
    public HorrorMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "horror");
    }

    /**
     * @return m    the horror movie - override the getter
     */
    @Override
    public Movie GetMovie() {
        return m;
    }
}

class ComedyMovie implements Movie_Slave {
    private Movie m;

    /**
     * @param id            the id for the movie - constructor for comedy movie factory
     * @param name          the name for the movie
     * @param year          the year for the movie
     * @param description   the description for the movie
     * @param length        the length for the movie
     */
    public ComedyMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "comedy");
    }

    /**
     * @return m    the comedy - override the getter
     */
    @Override
    public Movie GetMovie() {
        return m;
    }
}

class ActionMovie implements Movie_Slave {
    private Movie m;

    /**
     * @param id            the id for the movie - constructor for action movie factory
     * @param name          the name for the movie
     * @param year          the year for the movie
     * @param description   the description for the movie
     * @param length        the length for the movie
     */
    public ActionMovie(int id, String name, int year, String description, String length) {
        this.m = new Movie(id, name, year, description, length, "action");
    }

    /**
     * @return m    the action movie - override the getter
     */
    @Override
    public Movie GetMovie() {
        return m;
    }
}

