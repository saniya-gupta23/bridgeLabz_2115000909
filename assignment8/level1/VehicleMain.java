public class VehicleMain{
	public static void main(String args[]){
		Vehicle ve1 = new Vehicle("saniya", "scooty", "UP20564");
		Vehicle ve2 = new Vehicle("samiksha", "car" , "MP45697");

		ve1.checkAndDisplay(ve1);
		ve2.checkAndDisplay(ve2);

		Vehicle.updateRegistrationFee(600.0);


		ve1.checkAndDisplay(ve1);
		ve2.checkAndDisplay(ve2);


		String invalidObject = "not a vehicle ";
		ve1.checkAndDisplay(invalidObject);
	}
}
