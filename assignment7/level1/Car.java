import java.util.*;
public class Car{
	private String customerName;
	private String carModel;
	private int rentalDays;
	private static final double DAILY_RATE = 50.0;


	//Default cons
	public Car(){
		this.customerName = "unknown";
		this.carModel = "standard";
		this.rentalDays = 1 ;
	}

	public Car(String customerName , String carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}

	public Car(Car otherRental){
		this.customerName = otherRental.customerName;
		this.carModel = otherRental.carModel;
		this.rentalDays = otherRental.rentalDays;
	}


	public double calculateTotalCost(){
		return rentalDays * DAILY_RATE;
	}


	public void displayRentalDetails(){
		System.out.println("Customer: " + customerName + 
                           ", Car Model: " + carModel + ", Rental Days: " + rentalDays + ", Total Cost: Rs" + calculateTotalCost());
    	}

	public static void main(String args[]){
		Car defaultRental = new Car();
		Car customRental = new Car("Saniya","Tesla Model3", 5);

		Car copiedRental = new Car(customRental);

		 defaultRental.displayRentalDetails();
        	 customRental.displayRentalDetails();
	         copiedRental.displayRentalDetails();
	}
}
