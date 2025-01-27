import java.util.Scanner;

public class handshakeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        
        System.out.printf("The maximum number of handshakes among %d students is %d.%n", numberOfStudents, maxHandshakes);

        
    }
}
