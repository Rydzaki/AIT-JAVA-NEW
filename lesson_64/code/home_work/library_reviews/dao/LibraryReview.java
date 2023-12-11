package home_work.library_reviews.dao;

import home_work.library_reviews.model.Book;
import home_work.library_reviews.model.Review2;

public interface LibraryReview {

    boolean addBook(Book book);

    boolean addReview(Review2 review);

    // список книг, отсортированных по рейтингу;
    Iterable <Book> getBookByRating();

    //список книг, отсортированных по количеству отзывов о них;
    Iterable <Book> getBookByCountReviews();

    //список читателей - авторов отзывов, отсортированных по количеству лайков под их отзывами.
    Iterable <Book> getAuthorsByLikeCount();

    Book getBookId(int idBook);
}
