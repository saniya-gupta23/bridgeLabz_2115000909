class Vehicle{
	static double registrationFee = 500.0;
	

	public static void updateRegistrationFee(double newFee){
		registrationFee = newFee;
		System.out.println("updated registration fee:" + registrationFee);
	}

	final String registrationNumber;
	
	String ownerName;
	String vehicleType;

	//cons
	public Vehicle(String ownerName , String vehicleType , String registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}




	public void displayRegistrationDetails(){
		
	System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
	}

	public void checkAndDisplay(Object obj){
		if (obj instanceof Vehicle){
			displayRegistrationDetails();
		}
		else{
			System.out.println("the object is not a vehicle");
		}
	}
}
