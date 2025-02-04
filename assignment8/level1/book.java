import java.util.*;
public class book{
	private static String libraryName = "central library";

	//instance var
	private String title ;
	private String author;
	private final String isbn;

	//constructor
	public book(String title , String author , String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}


	//methods 
	public static void displayLibraryName(){
		System.out.println("Library name : " + libraryName );
	}

	public void displayBookDetails(){
		if (this instanceof book){
			System.out.println("Library name: " + libraryName);
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("ISBN: " + isbn);
		}
		else{
			System.out.println("invalid book");
		}

	}
}
