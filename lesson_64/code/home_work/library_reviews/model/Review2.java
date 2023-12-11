package home_work.library_reviews.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Review2 implements Comparable<Review2> {

    private int id;
    private int rating; // рейтинг книги
    private String user;
    private int idBook;
    private String comment;
    private List <String> likedBy; // Список имен пользователей, поставивших лайк
    private LocalDate data;
    private Book book;

    public Review2(int id, String user, int idBook, String comment, LocalDate data) {
        this.id = id;
        this.user = user;
        this.idBook = idBook;
        this.comment = comment;
        this.likedBy = new ArrayList <>();
        this.data = data;

        // Установка случайного рейтинга при создании объекта
        this.rating = generateRandomRating();

        // Генерация случайных лайков
        generateRandomLikes();
    }

    // Конструктор для рендомного наполнения
    public Review2() {
        this.likedBy = new ArrayList<>();
        this.rating = generateRandomRating();
    }

    private int generateRandomRating() {
        return new Random().nextInt(5) + 1;
    }

    private void generateRandomLikes() {
        int numberOfLikes = new Random().nextInt(6); // случайное число лайков от 0 до 5
        for (int i = 0; i < numberOfLikes; i++) {
            likedBy.add(generateRandomUserName());
        }
    }

    private String generateRandomUserName() {
        return "User" + (new Random().nextInt(5) + 1); // случайное имя пользователя от User1 до User5
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getUser() {
        return user;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getComment() {
        return comment;
    }

    public List<String> getLikedBy() {
        return likedBy != null ? likedBy : new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public void setBook(Book book) {
        this.book = book;
        if (book != null) {
            book.incrementReviewCount();
        }
    }

//    public void addLike(String userName) {
//        likedBy.add(userName);
//    }
//
//    public void removeLike(String userName) {
//        likedBy.remove(userName);
//    }

    public int getLikeCount() {
        return likedBy.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review2 review2 = (Review2) o;
        return id == review2.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Review2{" +
                "id=" + id +
                ", rating=" + rating +
                ", user='" + user + '\'' +
                ", book=" + book +
                ", comment='" + comment + '\'' +
                ", likedBy=" + likedBy +
                ", data=" + data +
                '}';
    }

    @Override
    public int compareTo(Review2 o) {
        return Integer.compare(this.id, o.id);
    }
}
