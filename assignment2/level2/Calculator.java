import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        double first, second;
        String op;

       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next();

      
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
               
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
              
                System.out.println("Invalid Operator. Please use +, -, *, or /.");
                break;
        }

        
    }
}
