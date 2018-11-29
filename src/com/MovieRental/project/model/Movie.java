package com.MovieRental.project.model;

public class Movie {
    private int movieID;
    private String movieName;
    private int movieYear;
    private String movieGenre;
    private String movieDescription;
    private String movieLength;

    /**
     * @param id            the id for the movie - constructor
     * @param name          the name for the movie
     * @param year          the year for the movie
     * @param description   the description for the movie
     * @param length        the length for the movie
     * @param genre         the genre for the movie
     */
    public Movie(int id, String name, int year, String description, String length, String genre) {
        this.movieID = id;
        this.movieName = name;
        this.movieYear = year;
        this.movieDescription = description;
        this.movieLength = length;
        this.movieGenre = genre;
    }

    /**
     * @return movieID  the id for the movie - getter
     */
    public int getMovieID() {
        return movieID;
    }

    /**
     * @return movieName    the name for the movie - getter
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @return movieYear    the year for the movie - getter
     */
    public int getMovieYear() {
        return movieYear;
    }

    /**
     * @return movieGenre   the genre for the movie - getter
     */
    public String getMovieGenre() {
        return movieGenre;
    }

    /**
     * @return movieDescription     the description for the movie - getter
     */
    public String getMovieDescription() {
        return movieDescription;
    }

    /**
     * @return movieLength      the length for the movie - getter
     */
    public String getMovieLength() {
        return movieLength;
    }
}