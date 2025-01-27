import java.util.Scanner;

public class triangleAreaCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the base of the triangle (in inches): ");
        double baseInInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double heightInInches = scanner.nextDouble();

        
        double areaInInches = 0.5 * baseInInches * heightInInches;

       
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        double areaInCm = 0.5 * baseInCm * heightInCm;

        
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n", areaInInches, areaInCm);

        scanner.close();
    }
}
