public class Student{
	static String  universityName = "GLA University";
	static int totalStudents = 0;
	final int rollNumber;

	String name;
	String grade;

	//cons
	public Student(String name , int rollNumber, String grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}

	public static void displayTotalStudents(){
		System.out.println("total students enrolled: " + totalStudents);
	}


	public void displayStudentDetails(){
		System.out.println("student name: " + name);
		System.out.println("roll number: " + rollNumber);
		System.out.println("grade: " + grade);
	}


	public void updateGrade(Object obj, String newGrade){
		if(obj instanceof Student){
			this.grade = newGrade;
			System.out.println("invalid operation");
		}
	}
}
