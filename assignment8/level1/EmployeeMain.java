public class EmployeeMain{
	public static void main(String args[]){
		Employee emp1 = new Employee("saniya" , 101, "Software engineer intern");
		Employee emp2= new Employee("samiksha" , 102 , "web developer");


		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();


		Employee.displayTotalEmployees();

	}
}
