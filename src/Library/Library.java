package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<Book> books = new ArrayList<>();

    public static void addBook(Book book) {
        books.add(book);
    }

    public static void showAllBooks() {
        System.out.println("\n--- Усі книги в бібліотеці ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
