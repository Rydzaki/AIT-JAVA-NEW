package homeWork_30.book.tests;

import homeWork_30.book.dao.Library;
import homeWork_30.book.dao.LibraryImpl;
import homeWork_30.book.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        book = new  Book[4];
        book[0] = new Book(101, "Michael Brooks", "World War Z", 2006);
        book[1] = new Book(102, "Karl Heinrich Marx", "Das Kapital", 1867);
        book[2] = new Book(103, "Kathy Sierra", "Head First Java", 2003);
        book[3] = new Book(104, "Friedrich Hegel", "Wissenschaft der Logik", 1812);
    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null)); // не можем добавить null
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(105, "Lev Tolstoy", "War and peace", 1865);
        assertTrue(library.addBook(book1)); // добавляю новую книгу
        assertEquals(5, library.quantity());
        Book book2 = new Book(106, "Johann Andreas Schmeller", "Carmina Burana", 1847);
        assertFalse(library.addBook(book2)); // не можем записать свыше копасити
    }

    @Test
    void removeBook() {
        assertEquals(book[1], library.removeBook(102));
        assertEquals(3, library.quantity()); // уменьшаем колличесиво книг
        assertNull(library.removeBook(102)); // не даст удалить дважды
        assertNull(library.findBook(102)); // вернет null если нет книги
    }
    @Test
    void findBook() {
        assertEquals(book[1], library.findBook(102)); //поиск по isbn
        assertNull(library.findBook(105)); // поиск не существующего объекта - вернется null
    }
    @Test
    void quantity() {
        assertEquals(4, library.quantity());
    }
    @Test
    void printAllBooks() {
        int bookCount = library.quantity();;
        for (int i = 0; i < bookCount; i++) {
            Book book = library.findBook(i);
            System.out.println(book);

        }
    }
}