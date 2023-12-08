package practice.reviews.dao;

import home_work.citizens.model.Person;
import practice.reviews.model.Review;

import java.util.*;
import java.util.stream.Collectors;

public class RatingImpl implements Ratings {
    Collection<Review> reviews;

    // Конструктор класса, принимающий коллекцию отзывов при создании объекта.
    public RatingImpl(List<Review> reviews) {
        this.reviews = reviews;
    }

    // Метод для добавления отзыва в коллекцию.
    @Override
    public boolean add(Review review) {
        // Проверяем, есть ли отзыв с таким же идентификатором.
        if (reviews.stream().anyMatch(r -> r.getId() == review.getId())) {
            return false;  // Если есть, возвращаем false, т.к. отзыв уже существует.
        }
        this.reviews.add(review);  // Добавляем отзыв в коллекцию.
        return true;  // Возвращаем true, если отзыв успешно добавлен.
    }

    // Метод для удаления отзыва по идентификатору.
    @Override
    public boolean remove(long id) {
        Review review = getReviewById(id);  // Получаем отзыв по идентификатору.
        if (review != null) {
            reviews.remove(review);  // Если отзыв найден, удаляем его из коллекции.
            return true;  // Возвращаем true, если отзыв успешно удален.
        }
        return false;  // Возвращаем false, если отзыв не найден.
    }

    // Метод для обновления рейтинга отзыва по идентификатору.
    @Override
    public boolean update(long id, int newRating) {
        Review review = getReviewById(id);  // Получаем отзыв по идентификатору.
        if (review != null) {
            review.setRating(newRating);  // Если отзыв найден, обновляем его рейтинг.
            return true;  // Возвращаем true, если рейтинг успешно обновлен.
        }
        return false;  // Возвращаем false, если отзыв не найден.
    }

    // Метод для получения отзывов по заданному продукту.
    @Override
    public Iterable<Review> getReviewsByProduct(String product) {
        return reviews.stream()
                .filter(r -> r.getProduct().equals(product))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        // Возвращаем неизменяемый список отзывов по указанному продукту.
    }

    // Метод для получения отзывов по заданному автору.
    @Override
    public Iterable<Review> getReviewsByAuthor(String author) {
        return reviews.stream().filter(r -> r.getAuthor().equals(author)).collect(Collectors.toList());
        // Возвращаем список отзывов по указанному автору.
    }

    // Метод для получения среднего рейтинга по заданному продукту.
    @Override
    public double getAvgRatingByProduct(String product) {
        List<Review> productReviews = (List<Review>) getReviewsByProduct(product);  // Получаем список отзывов по продукту.
        int numberOfReviews = productReviews.size();  // Получаем количество отзывов.
        if (numberOfReviews > 0) {
            double totalRating = productReviews.stream().mapToDouble(Review::getRating).sum();
            return totalRating / numberOfReviews;  // Возвращаем средний рейтинг, если есть отзывы.
        }
        return 0.0;  // Возвращаем 0.0, если нет отзывов.
    }

    // Метод для получения отзывов с максимальным количеством лайков.
    @Override
    public Iterable<Review> getReviewsMaxLikes() {
        int maxLikes = reviews.stream().mapToInt(Review::getLikes).max().orElse(0);  // Находим максимальное количество лайков.
        return reviews.stream().filter(review -> review.getLikes() == maxLikes).collect(Collectors.toList());
        // Возвращаем список отзывов с максимальным количеством лайков.
    }

    @Override
    public Iterable <Review> getAllReviews() {
        Collections.unmodifiableCollection(reviews).stream()
                .sorted(Comparator.comparing(Review::getRating))
                .forEach(System.out::println);
        return reviews;
    } @Override
    public Iterable <Review> getAllProd() {
        Collections.unmodifiableCollection(reviews).stream()
                .sorted(Comparator.comparing(Review::getProduct))
                .forEach(System.out::println);
        return reviews;
    }
    @Override
    public Iterable<Review> getAllProdMaxRev() {
        // Группируем отзывы по продукту
        Map<String, List<Review>> reviewsByProduct = reviews.stream()
                .collect(Collectors.groupingBy(Review::getProduct));

        // Находим максимальное количество отзывов
        int maxReviews = reviewsByProduct.values().stream()
                .mapToInt(List::size)
                .max()
                .orElse(0);

        // Фильтруем продукты с максимальным количеством отзывов
        List<String> productsWithMaxReviews = reviewsByProduct.entrySet().stream()
                .filter(entry -> entry.getValue().size() == maxReviews)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Выводим список продуктов с максимальным количеством отзывов
        productsWithMaxReviews.forEach(System.out::println);

        // Возвращаем все отзывы (можно изменить на возврат списка продуктов)
        return reviews;
    }

    // Вспомогательный метод для получения отзыва по идентификатору.
    private Review getReviewById(long id) {
        return reviews.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
        // Возвращаем первый найденный отзыв по идентификатору или null, если отзыв не найден.
    }



}
