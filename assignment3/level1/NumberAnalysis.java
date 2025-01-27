import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
      
        int[] numbers = new int[5];

       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

       
        for (int num : numbers) {
            if (num > 0) {
                
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("\nComparison of the first and last elements:");
        if (first == last) {
            System.out.println("The first element (" + first + ") and last element (" + last + ") are equal.");
        } else if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        }

        
        scanner.close();
    }
}
