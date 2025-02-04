class Product{
	private static double discount = 10.0;

	private String productName;
	private final int productID;
	private double price;
	private int quantity;


	//cons
	public Product(String productName , int productID , double price, int quantity){
		 this.productName = productName;
	         this.productID = productID;
       		 this.price = price;
    		 this.quantity = quantity;	
	}


	public static void updateDiscount(double newDiscount){
		discount =newDiscount;
		System.out.println("discount updated to  " + discount   + "%");
	}

	public void displayProductDetails(){
		if (this instanceof Product){
			double discountedPrice = price - (price * discount / 100);
			System.out.println("Product ID: " + productID);
	        	System.out.println("Product Name: " + productName);
        		System.out.println("Original Price: Rs." + price);
        		System.out.println("Discounted Price: Rs." + discountedPrice);
        		System.out.println("Quantity Available: " + quantity);
		}
		else{
			System.out.println("invalid");
		}
}
}
