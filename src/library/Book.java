package library;

public class Book extends LibraryItem{
    private String author;

    public Book(String title, int yearPublished, String author) {
        super(title, yearPublished);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String showDetails(){
        return "Book title: " + getTitle() + ", year published: " + getYearPublished() + ", author: " + author;
    }
}
