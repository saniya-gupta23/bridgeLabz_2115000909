public class ProductMain{
	public static void main(String args[]){
		Product prod1 = new Product("laptop" , 101 ,50000,5);
		Product prod2 = new Product("mobile phone", 105, 25000,10);


		prod1.displayProductDetails();
		prod2.displayProductDetails();


		Product.updateDiscount(15.0);


		prod1.displayProductDetails();
		prod2.displayProductDetails();
	}
}		
