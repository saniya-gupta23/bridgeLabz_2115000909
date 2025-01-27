import java.util.Scanner;

public class SumOfNaturalLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

      
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;  // Exit if the number is not a natural number
        }

        
        int formulaSum = n * (n + 1) / 2;

       
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

       
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);

        
        if (formulaSum == loopSum) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("There seems to be an error in the computation.");
        }

        
    }
}
