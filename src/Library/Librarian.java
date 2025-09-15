package Library;

public class Librarian extends Person {

    public Librarian(String name) {
        super(name);
    }

    public void registerBookBorrow(User user, Book book) {
        if (!book.isTaken()) {
            book.setTaken(true);
            user.addBook(book);
            System.out.println("Бібліотекар " + name +
                    " зареєстрував: " + user.name +
                    " взяв книгу \"" + book + "\"");
        } else {
            System.out.println("Книга вже зайнята: " + book);
        }
    }
}

