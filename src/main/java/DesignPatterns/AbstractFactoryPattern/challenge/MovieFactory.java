package DesignPatterns.AbstractFactoryPattern.challenge;

import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.ActionGenre;
import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.ComicGenre;
import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.MovieGenre;
import DesignPatterns.AbstractFactoryPattern.challenge.MovieGenre.type.MovieGenreType;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.BollyWoodPlace;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.HollyWoodPlace;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.MoviePlace;
import DesignPatterns.AbstractFactoryPattern.challenge.MoviePlace.type.MoviePlaceType;

public class MovieFactory {

    /**
     * @param movieGenreType MovieGenreType
     * @param moviePlaceType MoviePlaceType
     * @return get Movie!!
     */
    public static Movie getMovie(MovieGenreType movieGenreType, MoviePlaceType moviePlaceType) {
        return new Movie(getMovieGenre(movieGenreType), getMoviePlace(moviePlaceType));
    }

    private static MovieGenre getMovieGenre(MovieGenreType movieGenreType) {
        switch (movieGenreType) {
            case COMEDY:
                return new ComicGenre();
            case ACTION:
                return new ActionGenre();
            default:
                throw new IllegalStateException("Unexpected value: " + movieGenreType);
        }
    }

    private static MoviePlace getMoviePlace(MoviePlaceType moviePlaceType) {
        switch (moviePlaceType) {
            case HOLLYWOOD:
                return new HollyWoodPlace();
            case BOLLYWOOD:
                return new BollyWoodPlace();
            default:
                throw new IllegalStateException("Unexpected value: " + moviePlaceType);
        }
    }
}
