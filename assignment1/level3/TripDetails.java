import java.util.Scanner;

public class TripDetails {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling to: ");
        String toCity = scanner.nextLine();

       
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

      
        System.out.print("Enter the time taken for the first part of the journey (from " + fromCity + " to " + viaCity + ") in hours: ");
        double timeForFirstPart = scanner.nextDouble();

        System.out.print("Enter the time taken for the second part of the journey (from " + viaCity + " to " + toCity + ") in hours: ");
        double timeForSecondPart = scanner.nextDouble();

        
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeForFirstPart + timeForSecondPart;

        
        System.out.println("\nTrip Details:");
        System.out.println("Traveler: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " hours");

       
    }
}
