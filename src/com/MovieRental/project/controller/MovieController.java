package com.MovieRental.project.controller;

import com.MovieRental.project.model.Movie;
import com.MovieRental.project.model.MovieFactory;

import java.util.ArrayList;
import java.util.List;

public class MovieController {
    /**
     * a list of movies to simulate a data base
     */
    private static List<Movie> movieList = new ArrayList<>();

    /**
     * generates a list of movies to simulate a data base
     */
    public static void createHardCodeMovie() {
        Movie h1 = MovieFactory.generateMovieType(1, "Scary Movie_Slave 1", 2011, "Really scary movie", "1:45:17", "horror");
        Movie h2 = MovieFactory.generateMovieType(2, "Scary Movie_Slave 2", 2012, "Not that scary of a movie", "1:35:54", "horror");
        Movie c1 = MovieFactory.generateMovieType(3, "Dogs Life", 2009, "The adventures of a dog", "2:41:19", "comedy");
        Movie a1 = MovieFactory.generateMovieType(4, "The Fast & Furious", 2015, "R.I.P Paul Walker", "1:59:59", "action");

        movieList.add(h1);
        movieList.add(h2);
        movieList.add(c1);
        movieList.add(a1);
    }

    /**
     * @return movieList    a list of movies available - getter
     */
    public static List<Movie> getMovieList() {
        return movieList;
    }

    /**
     * @param m     a movie we are adding to the list
     */
    public static void addToMovieList(Movie m) {
        List<Movie> newMovieList = getMovieList();
        newMovieList.add(m);
    }

    public static Movie displayMovie() {
        for (Movie m : getMovieList()) {
            System.out.println("ID: " + m.getMovieID() + "\nTitle: " + m.getMovieName() + "\nYear: " + m.getMovieYear() + "\nDescription: " + m.getMovieDescription() + "\nLength: " + m.getMovieLength() + "\nGenre: " + m.getMovieGenre() + "\n");
        }
        return null;
    }

    /**
     * @param id    the id of the movie being removed
     */
    public static void removeFromMovieList(int id) {
        for (Movie m : getMovieList()) {
            if (id == m.getMovieID()) {
                movieList.remove(m);
            }
        }
    }

    /**
     * @param id   the id of the movie being selected
     * @return m    the movie being selected
     */
    public static Movie selectMovie(int id) {
        for (Movie m : getMovieList()) {
            if (id == m.getMovieID()) {
                return m;
            }
        }
        return null;
    }
}
