import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;  
        }

       
        int formulaSum = n * (n + 1) / 2;

        
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);

      
        if (formulaSum == loopSum) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("There seems to be an error in the computation.");
        }

       
    }
}
