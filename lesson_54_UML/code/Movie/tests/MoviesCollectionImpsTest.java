package Movie.tests;

import Movie.dao.MoviesCollection;
import Movie.dao.MoviesCollectionImps;
import Movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImpsTest {

    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImps<>(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(1)),
                new Movie(2, "B", "B", "B", now.minusYears(2)),
                new Movie(3, "C", "C", "C", now.minusYears(3)),
                new Movie(4, "D", "D", "D", now.minusYears(4)),
                new Movie(5, "E", "E", "E", now.minusYears(5))
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
        assertEquals(new Movie(1, "A", "A", "A", now.minusYears(3)), moviesCollection.removeMovie(1));
        assertEquals(4, moviesCollection.totalQuantity());
        System.out.println(moviesCollection.toString());
    }

    @Test
    void findById() {
        Movie movie = moviesCollection.findById(1);
        assertEquals(1, movie.getImdb());
        assertEquals("A", movie.getDirecor());
        assertEquals("A", movie.getGenre());
        assertEquals(now.minusYears(1), movie.getDate());
    }

    @Test
    void findByGenre() {
        Iterable<Movie> movies = moviesCollection.findByGenre("X");
        List<Movie> exp = new ArrayList<>();
        String genre = "";
        int count = 0;
        for (Movie m : movies) {
            count++;
            assertTrue(m.getGenre().compareTo(genre) >= 0);
            genre = m.getGenre();
            exp.add(m);
        }
        assertEquals(exp, movies);
    }


    @Test
    void findByDirector() {
        Iterable <Movie> movies = moviesCollection.findByDirector("A");
        List<Movie> exp = new ArrayList<>();
        String director = "";
        int count = 0;
        for (Movie movie : movies) {
            count++;
            assertTrue(movie.getDirecor().compareTo(director) >= 0);
            director = movie.getDirecor();
            exp.add(movie);
        }
        assertEquals(exp, movies);
        System.out.println(count);
    }

    @Test
    void findMoviesCreatedBetweenDates() {
 //        вызвать метод и получить список
        Iterable<Movie> exp = moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(4), now.minusYears(0));
        System.out.print(exp.toString());
        List<Movie> act = new ArrayList<>();
        act.add(new Movie(1, "A", "A", "A", LocalDate.now().minusYears(1)));
        act.add(new Movie(2, "B", "B", "B", LocalDate.now().minusYears(2)));
        act.add(new Movie(3, "C", "C", "C", LocalDate.now().minusYears(3)));

        assertIterableEquals(exp, act);

//        List<Movie> list = new ArrayList<>();
//        act.add(new Movie(7, "A", "A", "A", null));
//        assertFalse(moviesCollection.findMoviesCreatedBetweenDates(now.minusYears()));
    }

    @Test
    void totalQuantity() {
        assertEquals(5, moviesCollection.totalQuantity());
    }

}