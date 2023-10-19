package homeWork_31.book.dao;

import homeWork_31.book.model.Book;

import java.util.Arrays;

public class LibraryImpl implements Library {

    private Book[] books;
    private int totalSize; // всего книг в библиотеке

    public LibraryImpl(int capacity) {
        books = new Book[capacity]; // макс книг в библиотеке
    }


    @Override
    public boolean addBook(Book book) {
        if (book == null || totalSize == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
        books[totalSize] = book;
        totalSize++;

        return true;
    }

    @Override
    public Book removeBook(int isbn) {
        for (int i = 0; i < totalSize; i++) {
            if (books[i].getIsbn() == isbn) {
                Book vic = books[i]; // убрали найденный элемент в переменную
                books[i] = books[totalSize - 1]; //поставили на место найденого элемента последний
                books[totalSize - 1] = null; // затерли дубля последнего элемента
                totalSize--;
                return vic;
            }
        }
        return null;
    }


    @Override
    public Book findBook(int isbn) {
        for (int i = 0; i < totalSize; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }

        return null;
    }

    @Override
    public int quantity() {
        return totalSize;
    }

    @Override
    public void printAllBooks() {
        for (int i = 0; i < totalSize; i++) {
            System.out.println(books[i]);
        }

    }

    @Override
    public Book[] findAuthor(String author) {
        int count = 0;
        for (int i = 0; i < totalSize; i++) {
            if (books[i].getAuthor().equals(author)) {
                count++;
            }
        }
        Book[] res = new Book[count];
        for  (int i = 0, j = 0; j < res.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                res[j++] = books[i];
                }
            }
        Arrays.asList(res).forEach(System.out::println); // !!! печатает каждый элемент массива с новой строки
//        System.out.println(Arrays.toString(res));
            return res;
        }

    }

