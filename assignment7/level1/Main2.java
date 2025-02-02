public class Main2 {
    public static void main(String[] args) {
        BookAccess book1 = new BookAccess("978-3-16-148410-0", "Java Programming", "Saniya");
        book1.displayBookDetails();

        book1.setAuthor("Sanu");
        System.out.println("Updated Author: " + book1.getAuthor());

        EBook ebook1 = new EBook("978-1-23-456789-0", "Advanced Java", "Tarun");
        ebook1.displayEBookDetails();
    }
}
