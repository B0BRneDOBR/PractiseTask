package Library;

public class Book {
    private String title;
    private String author;
    private boolean isTaken;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isTaken = false;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    @Override
    public String toString() {
        return "Книга: \"" + title + "\" автор: " + author +
                (isTaken ? " (Взята)" : " (Вільна)");
    }
}

