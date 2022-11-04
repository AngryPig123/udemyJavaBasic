package DesignPatterns.AbstractFactoryPattern.challenge;

import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.MovieGenre;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.MoviePlace;

public class Movie {

    private MovieGenre movieGenre;
    private MoviePlace moviePlace;

    protected Movie(MovieGenre movieGenre, MoviePlace moviePlace) {
        this.movieGenre = movieGenre;
        this.moviePlace = moviePlace;
    }

    public void getInfo(){
        movieGenre.action();
        moviePlace.place();
    }

}
