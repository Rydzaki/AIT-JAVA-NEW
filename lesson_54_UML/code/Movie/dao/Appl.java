package Movie.dao;

import Movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        MoviesCollection moviesCollection;

        moviesCollection = new MoviesCollectionImps(List.of(
                new Movie(1, "A", "A", "A", LocalDate.now().minusYears(1)),
                new Movie(2, "B", "B", "B", LocalDate.now().minusYears(2)),
                new Movie(3, "C", "C", "C", LocalDate.now().minusYears(3)),
                new Movie(4, "D", "D", "D", LocalDate.now().minusYears(4)),
                new Movie(5, "E", "E", "E", LocalDate.now().minusYears(5))
        ));

        LocalDate fromDate = LocalDate.now().minusYears(4);
        LocalDate toDate = LocalDate.now().minusYears(0);

        Iterable<Movie> moviesBetweenDates = moviesCollection.findMoviesCreatedBetweenDates(fromDate, toDate);

        System.out.println("Movies created between " + fromDate + " and " + toDate + ":");
        for (Movie movie : moviesBetweenDates) {
            System.out.println(movie);
        }
    }

    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
        List<Movie> fromToDates = new ArrayList<>();
        fromToDates.add(new Movie(1, "A", "A", "A", LocalDate.now().minusYears(1)));
        fromToDates.add(new Movie(2, "B", "B", "B", LocalDate.now().minusYears(2)));
        fromToDates.add(new Movie(3, "C", "C", "C", LocalDate.now().minusYears(3)));

        List<Movie> fromToDates2 = new ArrayList<>();
        for (Movie m : fromToDates) {
            LocalDate d = m.getDate();
            if (d.isAfter(from) && d.isBefore(to)) {
                fromToDates2.add(m);
            }
        }
        return fromToDates2;
    }
}
