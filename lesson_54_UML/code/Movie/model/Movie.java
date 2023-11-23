package Movie.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Objects;

public class Movie implements Comparable<Movie> {
    private long imdb;
    private String title;
    private String director;
    private String genre;
    private LocalDate date;

    public Movie(long imdb, String title, String direcor, String genre, LocalDate date) {
        this.imdb = imdb;
        this.title = title;
        this.director = direcor;
        this.genre = genre;
        this.date = date;
    }

    public long getImdb() {
        return imdb;
    }

    public String getTitle() {
        return title;
    }

    public String getDirecor() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "imdb=" + imdb +
                ", title='" + title + '\'' +
                ", direcor='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return imdb == movie.imdb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imdb);
    }

    @Override
    public int compareTo(Movie o) {
        return Long.compare(this.imdb, o.getImdb());
    }
}
