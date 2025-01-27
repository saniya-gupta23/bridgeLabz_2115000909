import java.util.Scanner;

public class discountCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the student fee (in INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (fee * discountPercent) / 100;

        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and the final discounted fee is INR %.2f%n", discount, finalFee);

        
    }
}
