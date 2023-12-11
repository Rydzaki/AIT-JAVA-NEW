package home_work.library_reviews.dao;

import home_work.library_reviews.model.Book;
import home_work.library_reviews.model.Review2;
import practice.reviews.model.Review;

import java.util.*;

public class LibraryReviewImpl implements LibraryReview {

    Collection <Book> books;

    public LibraryReviewImpl() {
        this.books = new ArrayList<>();
    }

    @Override
    public boolean addBook(Book book) {
        if (books.stream().anyMatch(r -> r.getId() == book.getId())) {
            return false;
        }
        this.books.add(book);
        return true;
    }

    @Override
    public boolean addReview(Review2 review) {
        Book book = getBookId(review.getIdBook());
        if (book != null) {
            book.addReview(review);
            return true;
        }
        return false;
    }

    @Override
    public Iterable<Book> getBookByRating() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparingDouble(book -> {
            double averageRating = book.getReview2s().stream()
                    .mapToInt(Review2::getRating)
                    .average()
                    .orElse(0.0);
            return -averageRating; // отрицательное значение для убывающего порядка
        }));
        sortedBooks.forEach(book -> System.out.println(book + " Rating: " + calculateAverageRating(book)));
        return sortedBooks;
    }

    private double calculateAverageRating(Book book) {
        return book.getReview2s().stream()
                .mapToInt(Review2::getRating)
                .average()
                .orElse(0.0);
    }

    @Override
    public Iterable<Book> getBookByCountReviews() {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparingInt(Book::getReviewCount));
        sortedBooks.forEach(book -> System.out.println(book + " Review Count: " + book.getReviewCount()));
        return sortedBooks;
    }

    @Override
    public Iterable<Book> getAuthorsByLikeCount() {
        List<Book> sortedBooks = new ArrayList<>(books);

        sortedBooks.sort(Comparator.comparingInt(book ->
                book.getReview2s().stream()
                        .mapToInt(Review2::getLikeCount)
                        .sum()
        ));

        sortedBooks.forEach(book -> System.out.println(book + " Like Count: " + calculateTotalLikeCount(book)));
        return sortedBooks;
    }

    private int calculateTotalLikeCount(Book book) {
        return book.getReview2s().stream()
                .mapToInt(Review2::getLikeCount)
                .sum();
    }

    @Override
    public Book getBookId(int idBook) {
        return books.stream()
                .filter(book -> book.getId() == idBook)
                .findFirst()
                .orElse(null);
    }
}