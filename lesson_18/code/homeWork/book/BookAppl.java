package homeWork.book;

import homeWork.book.metod.Book;
import homeWork.book.metod.Dictionary;

public class BookAppl {

    public static void main(String[] args) {

        Dictionary book1 = new Dictionary("Pride and Prejudice", "Jane Austen", 1813, 12233, "English", "Novel");
        Dictionary book2 = new Dictionary("World War Z", "Michael Brooks", 2006, 12321, "English", "Post-apocalyptic");


        book1.toDisplay();
        System.out.println("---------------------------");
        book2.toDisplay();

    }
}
