import java.util.Scanner;

public class distanceConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the distance (in feet): ");
        double distanceInFeet = scanner.nextDouble();

        
        double distanceInYards = distanceInFeet / 3;

        
        double distanceInMiles = distanceInYards / 1760;

       
        System.out.printf("The distance is %.2f feet, %.2f yards, and %.4f miles.%n", distanceInFeet, distanceInYards, distanceInMiles);

      
    }
}
