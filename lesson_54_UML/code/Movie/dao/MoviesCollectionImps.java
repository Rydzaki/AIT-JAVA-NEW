package Movie.dao;

import Movie.model.Movie;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.locks.Lock;

public class MoviesCollectionImps implements MoviesCollection {
    private List <Movie> moviesList;

    public MoviesCollectionImps() {
        moviesList = new ArrayList<>();
    }

    public MoviesCollectionImps(List<Movie> movies) {
        this(); // вызывает пустого конструктора
        for(Movie m : movies){
            moviesList.add(m);
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        if(movie == null){
            return false;
        }
        if(moviesList.contains(movie)){
            return false;
        }
        moviesList.add(movie);
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie vic = findById(imdb);
        if(vic != null){
            moviesList.remove(vic);
            return vic;
        }
       return null;
    }

    @Override
    public Movie findById(long imdb) {
        for(Movie m : moviesList){
            if(m.getImdb() == imdb){
                return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for(Movie m : moviesList){
            if(m.getGenre().equals(genre)){
                foundByGenre.add(m);
            }
        }
        return foundByGenre;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        List<Movie> foundByDirector = new ArrayList<>();
        for(Movie m : moviesList){
            if(m.getDirecor().equals(director)){
                foundByDirector.add(m);
            }
        }
        return foundByDirector;
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        List<Movie> fromToDates = new ArrayList<>();
        for (Movie m: moviesList) {
            LocalDate d = m.getDate();
            if(d.isAfter(from) && d.isBefore(to)){ // && d != null
                fromToDates.add(m);
            }
        }
        return fromToDates;

//        отобрать в список те фильмы у которых дата больше минДате но меньше МаксДате
    }

    @Override
    public int totalQuantity() {
        return moviesList.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return moviesList.iterator();

    }
}
