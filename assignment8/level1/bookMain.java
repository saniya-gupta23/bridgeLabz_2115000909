public class bookMain{
	public static void main(String args[]){
		book book1 = new book("the epic shit" , " ankur warikoo" , "456321897" );
		book book2 = new book("the great gatsby" , "scott fitzgerald", "45697123");

		book.displayLibraryName();

		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
