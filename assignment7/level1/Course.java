public class Course {
    private String courseName;
    private int duration; 
    private double fee;   
    private static String instituteName = "GLA University"; 

    
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " days, Fee: $" + fee + ", Institute: " + instituteName);
    }

   
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName; 
    }

   
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 30, 299.99);
        Course course2 = new Course("Web Development", 45, 399.99);

       
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        
        Course.updateInstituteName("Gupta Academy");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
