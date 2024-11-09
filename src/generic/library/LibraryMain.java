package generic.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Book Title");
        Library<Book> bookItem = new Library<>(book);
        bookItem.printName(book.getTitle());

        Newspaper newspaper = new Newspaper();
        newspaper.setName("Newspaper");
        Library<Newspaper> newspaperItem = new Library<>(newspaper);
        newspaperItem.printName(newspaper.getName());


        List<Library> libraries = new ArrayList<>();
        libraries.add(bookItem);
        libraries.add(newspaperItem);
        System.out.println(libraries);
    }
}
