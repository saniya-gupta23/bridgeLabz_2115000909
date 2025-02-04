public class PatientMain{
	 public static void main(String args[]){
		Patient p1 = new Patient("shyam" , 30 , "fever" ,101);
		Patient p2 = new Patient("ravi" , 25 , "flu" , 123);

		Patient.getTotalPatients();
		p1.checkAndDisplay(p1);
		p2.checkAndDisplay(p2);

		String invalidObject = "not a patient";
		p1.checkAndDisplay(invalidObject);
	}

}
