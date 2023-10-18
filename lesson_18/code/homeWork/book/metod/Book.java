package homeWork.book.metod;

public class Book {

    private String title;
    private String author;
    private int year;
    private int ISBN;

    public Book(String title, String author, int year, int ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void toDisplay (){
        System.out.println("Title "+ getTitle()+ " Author "+ getAuthor()+
                " Year "+ year + " ISBN "+ ISBN); //можно через гетер можно по имени
    }
}
