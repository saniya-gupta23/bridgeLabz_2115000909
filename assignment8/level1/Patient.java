public class Patient{
	static String hospitalName = "city hospital";
	static int totalPatients = 0;
	final int patientID;

	String name;
	int age;
	String ailment;


	//cons
	public Patient(String name, int age, String ailment, int patientID){
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}

	public static void getTotalPatients(){
		System.out.println("total patients admitted: " + totalPatients);
	}


	public void displayPatientDetails(){
		System.out.println("Hospital Name: " + hospitalName);
        	System.out.println("Patient ID: " + patientID);
        	System.out.println("Name: " + name);
        	System.out.println("Age: " + age);
        	System.out.println("ailment: " + ailment);
	}

	public void checkAndDisplay(Object obj){
		if (obj instanceof Patient){
			displayPatientDetails();
		}
		else{
			System.out.println("the object is not a patient");
		}
	}
}
	
	

