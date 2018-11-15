package com.MovieRental.project.model;

public class MovieFactory {
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