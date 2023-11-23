package Movie.tests;

import Movie.dao.MoviesCollection;
import Movie.dao.MoviesCollectionImps;
import Movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImpsTest {

    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImps(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2, "B", "B", "B", now.minusYears(4)),
                new Movie(3, "C", "C", "C", now.minusYears(1)),
                new Movie(4, "D", "D", "D", now.minusYears(2)),
                new Movie(5, "E", "E", "E", now.minusYears(7))
        ));
    }

    @Test
    void addMovie() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(1, "A", "A", "A", now.minusYears(3))));
        assertEquals(5, moviesCollection.totalQuantity());
        assertTrue(moviesCollection.addMovie(new Movie(6, "F", "F", "F", now.minusYears(5))));
        assertEquals(6, moviesCollection.totalQuantity());
    }

    @Test
    void removeMovie() {
        assertFalse(moviesCollection.removeMovie(6));
        assertEquals(5, moviesCollection.totalQuantity());
        assertTrue(moviesCollection.removeMovie(5));
        assertEquals(4, moviesCollection.totalQuantity());

    }

    @Test
    void findById() {
        Movie movie = moviesCollection.findById(1);
        assertEquals(1, movie.getImdb());
        assertEquals("A", movie.getDirecor());
        assertEquals("A", movie.getGenre());
        assertEquals(3, movie.getDate());
    }

    @Test
    void findByGenre() {
        Iterable<Movie> movies = moviesCollection.findByGenre("X");
        String genre = "";
        int count = 0;
        for (Movie movie : movies) {
            count++;
            assertTrue(movie.getGenre().compareTo(genre) >= 0);
            genre = movie.getGenre();
        }
        assertEquals(count, moviesCollection.totalQuantity());
    }


    @Test
    void findByDirector() {
        Iterable<Movie> movies = moviesCollection.findByDirector("X");
        String direc = "";
        int count = 0;
        for (Movie movie : movies) {
            count++;
            assertTrue(movie.getDirecor().compareTo(direc) >= 0);
            direc = movie.getDirecor();
        }
        assertEquals(count, moviesCollection.totalQuantity());
    }

    @Test
    void findMoviesCreatedBetweenDates() {

    }

    @Test
    void totalQuantity() {
    }
}