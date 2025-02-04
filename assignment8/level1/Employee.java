public class Employee{
	private static String companyName = "capgemini";
	private static int totalEmployees = 0;

	private String name;
	private final int id;
	private String designation;


	//cons
	public Employee(String name, int id , String designation){
		this.name = name;
		this.id  = id;
		this.designation = designation;
		
		totalEmployees++;
	}

	public static void displayTotalEmployees(){
		System.out.println("total employees : " + totalEmployees);
	}


	public void displayEmployeeDetails(){
		if (this instanceof Employee){
			System.out.println("company name: " + companyName); 
			System.out.println("employee name: " + name); 
			System.out.println("employee id: " + id); 
			System.out.println("designation: " + designation);
		}
		else{
			System.out.println("invalid employee");
		}
	}
}
