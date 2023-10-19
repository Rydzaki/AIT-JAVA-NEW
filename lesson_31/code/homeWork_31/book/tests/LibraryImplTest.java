package homeWork_31.book.tests;

import homeWork_31.book.dao.Library;
import homeWork_31.book.dao.LibraryImpl;
import homeWork_31.book.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] b;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        b = new Book[5];
        b[0] = new Book(101, "Michael Brooks", "World War Z", 2006);
        b[1] = new Book(102, "Karl Heinrich Marx", "Das Kapital", 1867);
        b[2] = new Book(103, "Kathy Sierra", "Head First Java", 2003);
        b[3] = new Book(104, "Friedrich Hegel", "Wissenschaft der Logik", 1812);
        for (int i = 0; i < b.length; i++) {
            library.addBook(b[i]);
        }
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null)); // не можем добавить null
        assertFalse(library.addBook(b[1]));
        Book book1 = new Book(105, "Lev Tolstoy", "War and peace", 1865);
        assertTrue(library.addBook(book1)); // добавляю новую книгу
        assertEquals(5, library.quantity());
        Book book2 = new Book(106, "Johann Andreas Schmeller", "Carmina Burana", 1847);
        assertFalse(library.addBook(book2)); // не можем записать свыше копасити
    }

    @Test
    void removeBook() {
        assertEquals(b[1], library.removeBook(102));
        assertEquals(3, library.quantity()); // уменьшаем колличесиво книг
        assertNull(library.removeBook(102)); // не даст удалить дважды
        assertNull(library.findBook(102)); // вернет null если нет книги
    }
    @Test
    void findBook() {
        assertEquals(b[1], library.findBook(102)); //поиск по isbn
        assertNull(library.findBook(105)); // поиск не существующего объекта - вернется null
    }
    @Test
    void quantity() {
        assertEquals(4, library.quantity());
    }
    @Test
    void printAllBooks() {
        library.printAllBooks();
    }

    @Test
    void findAuthorTest(){
        Book book3 = new Book(107, "Friedrich Hegel", "Encyclopedia of Philosophical Sciences", 1817);
        library.addBook(book3);
        Book[] actual = library.findAuthor("Friedrich Hegel");
        Book[] expected = {b[3], b[4]};
    }
}