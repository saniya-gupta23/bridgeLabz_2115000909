import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        
        double[] numbers = new double[10];
        double total = 0.0; 
        int index = 0; 

      
        Scanner scanner = new Scanner(System.in);

       
        while (true) {
           
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            
            if (input <= 0) {
                break;
            }

            
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            
            numbers[index] = input;
            index++;
        }

        
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

    
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n\nTotal sum of numbers: " + total);

        
        scanner.close();
    }
}
