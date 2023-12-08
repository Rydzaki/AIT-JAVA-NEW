package practice.reviews;

import practice.reviews.dao.RatingImpl;
import practice.reviews.dao.Ratings;
import practice.reviews.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReviewsAppl {
    public static void main(String[] args) {
         //Создаем объект для хранения отзывов и рейтингов
        Ratings ratings = new RatingImpl(List.of(
                new Review(2, "User111", "Phone1", "Bad"),
                new Review(3, "User222", "Phone2", "Ok"),
                new Review(4, "User333", "Phone2", "Not bad"),
                new Review(1, "User111", "Phone1", "Bad"),
                new Review(5, "User333", "Phone2", "Good")
        ));

        double avgRating = ratings.getAvgRatingByProduct("Phone1");
        String product = "Phone1";
        System.out.println("\t"+"Средний рейтинг по продукту " + product+ ": " + avgRating);
        System.out.println("===================================================");
        System.out.println("\t"+"Поиск по автору: ");
        ratings.getReviewsByAuthor("User333").forEach(System.out::println);
        System.out.println("===================================================");
        System.out.println("\t"+"Все отзывы (отсортированные по рейтингу):");
        ratings.getAllReviews();
        System.out.println("===================================================");
        System.out.println("\t"+"Все отзывы (отсортированные по автору):");
        ratings.getAllProd();
        System.out.println("===================================================");
        System.out.println("\t"+"по количеству отзывов:");
        ratings.getAllProdMaxRev();
        System.out.println("===================================================");



//
    }
}
