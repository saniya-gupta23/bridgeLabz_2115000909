import java.util.*;
public class Library{
	private String title;
	private String author;
	private double price;
	private boolean isAvailable;

	public Library(){
		this.title = "unknown";
		this.author = "unknown";
		this.price = 0.0 ;
		this.isAvailable = true;
	}

	public Library(String title, String author , double price){
		this.title = title;
		this.author = author;
		this.price = price;
		this.isAvailable = true;
	}

	public void borrowBook(){
		if (isAvailable){
			isAvailable = false;
			System.out.println("you have successfully borrowed" + title);
		}
		else{
			System.out.println("Sorry, '" + title + "is currently unavailable");
		}
	}


	public void returnBook(){
		if(!isAvailable){
			isAvailable= true;
			System.out.println("'" + title + "'was not borrowed");
		}	
	}

	public void displayBookInfo(){
		System.out.println("Title:" + title + ",author:" + author + ",price:Rs" + price + ",available:" + (isAvailable ? "yes" : "no"));
	}

	public static void main(String args[]){
		Library book1 = new Library("java", "saniya", 459);

		book1.displayBookInfo();
		book1.borrowBook();
	
		
		//after borrowing
		book1.displayBookInfo();

		book1.borrowBook();
		book1.returnBook();
		book1.displayBookInfo();

	}	
}

