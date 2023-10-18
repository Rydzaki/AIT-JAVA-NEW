package homeWork_31.book.dao;

import homeWork_31.book.model.Book;

public interface Library {

    boolean addBook (Book book);
    Book removeBook (int isbn);
    Book findBook (int isbn);
    int quantity();
    void printAllBooks ();

//    void printAllBooks();
}
