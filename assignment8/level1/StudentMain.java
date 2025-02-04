public class StudentMain{
	public static void main(String args[]){
		Student stu1 = new Student("saniya", 102 ,"A");
		Student stu2 = new Student("Samiksha", 105, "B");
		
		Student.displayTotalStudents();

		stu1.displayStudentDetails();
		stu2.displayStudentDetails();


		stu1.updateGrade(stu1 , "A+");

		String invalidObj = "not a student";
		stu1.updateGrade(invalidObj , "B+");
	}
}
