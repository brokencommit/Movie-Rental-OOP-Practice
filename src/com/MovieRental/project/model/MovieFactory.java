package com.MovieRental.project.model;

public class MovieFactory {
    /**
     * @param id            the id for the movie - constructor movie factory
     * @param name          the name for the movie
     * @param year          the year for the movie
     * @param description   the description for the movie
     * @param length        the length for the movie
     * @param genre         the genre for the movie
     * @return ms           the movie being generated at the factory
     */
    public static Movie generateMovieType(int id, String name, int year, String description, String length, String genre) {
        Movie_Slave ms;
        switch (genre) {
            case "horror":
                ms = new HorrorMovie(id, name, year, description, length);
                return ms.GetMovie();
            case "comedy":
                ms = new ComedyMovie(id, name, year, description, length);
                return ms.GetMovie();
            case "action":
                ms = new ActionMovie(id, name, year, description, length);
                return ms.GetMovie();
            default:
                return null;
        }
    }
}