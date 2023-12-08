package practice.reviews.dao;

import practice.reviews.model.Review;

public interface Ratings {
    boolean add(Review review);
    boolean remove(long id);
    boolean update(long id, int newRating);
    Iterable<Review> getReviewsByProduct(String product);
    Iterable<Review> getReviewsByAuthor(String author);
    double getAvgRatingByProduct(String product);
    Iterable<Review> getReviewsMaxLikes();
    Iterable<Review> getAllReviews();
    public Iterable <Review> getAllProd();
    public Iterable <Review> getAllProdMaxRev();
}
