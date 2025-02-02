import java.util.*;
public class BookAccess {
    public String ISBN;
    protected String title;
    private String author;

    public BookAccess(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends BookAccess {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

