package homeWork_31.book.model;

public class Book {

    private int isbn;
    private String author;
    private String title;
    private int age;

    public Book(int isbn, String author, String title, int age) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.age = age;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;

        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }
}
