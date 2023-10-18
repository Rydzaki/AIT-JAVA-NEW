package homeWork.book.metod;

public class Dictionary extends Book{

    private String language; // TODO изменит на словари
    private String genre;

    public Dictionary(String title, String author, int year, int ISBN, String language, String genre) {
        super(title, author, year, ISBN);
        this.language = language;
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void toDisplay (){
        super.toDisplay();
        System.out.println("Language " + language + " Genre "+ genre);
    }
}
