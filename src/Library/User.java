package Library;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        super(name);
    }

    public void borrowBook(Book book, Librarian librarian) {
        librarian.registerBookBorrow(this, book);
    }

    public void borrowBook(List<Book> books, Librarian librarian) {
        for (Book b : books) {
            librarian.registerBookBorrow(this, b);
        }
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return "Користувач: " + name + ", Взяті книги: " + borrowedBooks.size();
    }
}

