package Library;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library.addBook(new Book("Пригоди Тома Сойєра", "Марк Твен"));
        Library.addBook(new Book("Кобзар", "Тарас Шевченко"));
        Library.addBook(new Book("1984", "Джордж Орвелл"));

        User u1 = new User("Іван");
        User u2 = new User("Марія");
        Librarian librarian = new Librarian("Олена");

        u1.borrowBook(Library.books.get(1), librarian);
        u2.borrowBook(Arrays.asList(Library.books.get(0), Library.books.get(2)), librarian);

        System.out.println("\n--- Інформація про користувачів ---");
        System.out.println(u1);
        System.out.println(u2);

        Library.showAllBooks();
    }
}

