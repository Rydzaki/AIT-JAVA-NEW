package homeWork_30.book.dao;

import homeWork_30.book.model.Book;

public class LibraryImpl implements Library {

    private Book[] book;
    private int total; // всего книг в библиотеке

    public LibraryImpl (int capacity){
        book = new Book[capacity]; // макс книг в библиотеке
    }

    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public Book removeBook(int isbn) {
        return null;
    }

    @Override
    public Book findBook(int isbn) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printAllBooks(Object object) {
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }

    }

}
