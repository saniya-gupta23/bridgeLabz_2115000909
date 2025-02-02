
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", 8.5);
        student1.displayStudentDetails();
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Alice Smith", 9.8);
        pgStudent.displayPostgraduateDetails();
    }
}
