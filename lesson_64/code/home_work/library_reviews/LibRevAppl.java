package home_work.library_reviews;

import home_work.library_reviews.dao.LibraryReview;
import home_work.library_reviews.dao.LibraryReviewImpl;
import home_work.library_reviews.model.Book;
import home_work.library_reviews.model.Review2;

import java.time.LocalDate;


public class LibRevAppl {
    public static void main(String[] args) {
        LibraryReview listReviews = new LibraryReviewImpl();


        listReviews.addBook(new Book(1, "Book1", "Author1"));
        listReviews.addBook(new Book(2, "Book2", "Author2"));
        listReviews.addBook(new Book(3, "Book3", "Author3"));
        listReviews.addBook(new Book(4, "Book4", "Author4"));
        listReviews.addBook(new Book(5, "Book5", "Author5"));
        listReviews.addBook(new Book(6, "Book6", "Author6"));

        listReviews.addReview(new Review2(1, "User1", 1, "good book", LocalDate.of(2023, 10, 12)));
        listReviews.addReview(new Review2(2, "User2", 2, "good book", LocalDate.of(2023, 10, 12)));
        listReviews.addReview(new Review2(3, "User3", 3, "good book", LocalDate.of(2023, 10, 12)));
        listReviews.addReview(new Review2(4, "User4", 1, "good book", LocalDate.of(2023, 10, 12)));
        listReviews.addReview(new Review2(5, "User5", 1, "good book", LocalDate.of(2023, 10, 12)));
        listReviews.addReview(new Review2(6, "User1", 3, "good book", LocalDate.of(2023, 10, 12)));

        System.out.println("\t Books by rating:");
        listReviews.getBookByRating();

        System.out.println("\t Books by count of reviews:");
        listReviews.getBookByCountReviews();

        System.out.println("\t Authors by like count:");
        listReviews.getAuthorsByLikeCount();

        //todo сделать enum and menu


    }
}


