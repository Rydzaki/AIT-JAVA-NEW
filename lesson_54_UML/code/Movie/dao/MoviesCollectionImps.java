package Movie.dao;

import Movie.model.Movie;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class MoviesCollectionImps implements MoviesCollection {
    private Collection<Movie> movies;

    public MoviesCollectionImps() {
        movies = new ArrayList<>();
    }

    public MoviesCollectionImps(List<Movie> arr) {
        this(); // вызывает пустого конструктора
        movies.addAll(arr);
    }

    @Override
    public boolean addMovie(Movie movie) {
        if(movie == null){
            return false;
        }
        int index = Collections.binarySearch(movies, movie);
        if(index >= 0){
            int point = -index-1;
            movies.add(point, movie);
            return true;

        }
        return false;
    }

    @Override
    public boolean removeMovie(long imdb) {
        Movie vic = findById(imdb);
        if(vic == null){
            return false;
        }
        movies.remove(vic);
        return true;
    }

    @Override
    public Movie findById(long imdb) {
        Movie pattern = new Movie(imdb, null, null, null, null);
        int index = Collections.binarySearch (movies, pattern);
        return index < 0 ? null :
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        return movies;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        return movies;
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        int res = ((int) ChronoUnit.YEARS.between(from, to));
        return res;
    }

    @Override
    public int totalQuantity() {
        return movies.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return null;
    }
}
