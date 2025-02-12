class Book {
    String title, author, genre;
    int bookID;
    boolean isAvailable;
    Book next, prev;

    public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.next = this.prev = null;
    }
}

class Library {
    Book head, tail;
    int count;

    public void addBook(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else if (position <= 0) {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        } else {
            Book temp = head;
            int index = 0;
            while (temp.next != null && index < position - 1) {
                temp = temp.next;
                index++;
            }
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) temp.next.prev = newBook;
            temp.next = newBook;
            if (newBook.next == null) tail = newBook;
        }
        count++;
    }

    public void removeBook(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        count--;
    }

    public Book searchBook(String key) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) || temp.author.equalsIgnoreCase(key)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailability(int bookID, boolean status) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) temp = temp.next;
        if (temp != null) temp.isAvailable = status;
    }

    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookID + " | " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookID + " | " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    public int countBooks() {
        return count;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book1", "Author1", "Fiction", 101, true, 0);
        library.addBook("Book2", "Author2", "Science", 102, false, 1);
        library.addBook("Book3", "Author3", "History", 103, true, 2);
        library.displayBooksForward();
        System.out.println("Total Books: " + library.countBooks());
        library.removeBook(102);
        library.displayBooksForward();
        System.out.println("Total Books: " + library.countBooks());
        library.updateAvailability(103, false);
        library.displayBooksReverse();
    }
}
