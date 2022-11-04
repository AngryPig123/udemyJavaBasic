package DesignPatterns.AbstractFactoryPattern.challenge;

import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.type.MovieGenreType;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.type.MoviePlaceType;

import static DesignPatterns.AbstractFactoryPattern.challenge.MovieFactory.*;

public class Client {
    public static void main(String[] args) {

        getMovie(MovieGenreType.COMEDY, MoviePlaceType.HOLLYWOOD).getInfo();

    }
}
