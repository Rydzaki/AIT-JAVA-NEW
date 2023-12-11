package home_work.library_reviews.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private String author;
    private List<Review2> review2s;
    int reviewCount; // для хранения общего количества отзывов по книге

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.review2s = new ArrayList<>();
        this.reviewCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List <Review2> getReview2s() {
        return new ArrayList<>(review2s);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review2s=" + review2s +
                ", reviewCount=" + reviewCount +
                '}';
    }

    public void addReview(Review2 review) {
        this.review2s.add(review);
        this.reviewCount = this.review2s.size();
    }

    public void incrementReviewCount() {
        reviewCount++;
    }

    public int getReviewCount() {
        return reviewCount;
    }

}
