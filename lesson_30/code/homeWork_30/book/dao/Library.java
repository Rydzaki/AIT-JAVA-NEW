package homeWork_30.book.dao;

import homeWork_30.book.model.Book;

public interface Library {

    boolean addBook (Book book);
    Book removeBook (int isbn);
    Book findBook (int isbn);
    int quantity();
    void printAllBooks (Object object);

}
