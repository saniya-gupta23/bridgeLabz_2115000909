import java.util.*;
public class Product {
	private String productName;
	private double price;
	private static int totalProducts=0;


	public Product(String productName , double price){
		this.productName = productName ;
		this.price = price;
		totalProducts++;
	}

	public void displayProductDetails(){
		System.out.println("Product name:" + productName + ", price: Rs" + price );
	}

	public static void displayTotalProducts(){
		System.out.println("total products created:" + totalProducts);
	}

	public static void main(String args[]){
		Product p1 = new Product ("laptop", 60000.00);
		Product p2 = new Product ("mobile phone", 23500.20);
		Product p3 = new Product ("earphones" , 750.00);


		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();

		Product.displayTotalProducts();
	}
}
