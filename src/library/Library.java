package library;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Pride and Prejudice", 1900, "Jane Austin" );
        System.out.println(book.showDetails());
        Magazine magazine = new Magazine("Vogue", 2024, 412);
        System.out.println(magazine.showDetails());
    }
}
