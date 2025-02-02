import java.util.Objects;
public class book{
	//attributes
	private String title;
	private String author;
	private double price;

	//default constructor
	public book(){
		this("title z" , "author xyz", 0.0);
	}

	//parameterized constructor
	public book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}


	//getter provides read only access to pvt attributes 
	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getPrice(){
		return price;
	}

	 @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }

	

	@Override
	public boolean equals(Object o){
		if (this== o )return true;
		if (o == null || getClass() != o.getClass()) return false;
		book booko= (book) o;
		return Double.compare(booko.price, price)==0 &&
		Objects.equals(title, booko.title) &&
		Objects.equals(author, booko.author);
}


    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
	public static void main(String args[]){
		book defaultBook = new book();
		book myBook = new book("the epic shit","ankur wariko", 249);

	System.out.println(defaultBook);
	System.out.println(myBook);
	}
}


