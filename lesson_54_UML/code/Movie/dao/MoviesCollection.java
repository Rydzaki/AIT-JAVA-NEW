package Movie.dao;

import Movie.model.Movie;

import java.time.LocalDate;

public interface MoviesCollection<Movie> extends Iterable<Movie> {
    boolean addMovie(Movie movie);

    boolean addMovie(Movie.model.Movie movie);

    boolean removeMovie(long imdb);
    Movie findById(long imdb);
    Iterable<Movie> findByGenre(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to);
    int totalQuantity();

}
