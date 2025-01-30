import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate resultDate = date
                .plusDays(7)         // Add 7 days
                .plusMonths(1)       // Add 1 month
                .plusYears(2)        // Add 2 years
                .minusWeeks(3);      // Subtract 3 weeks

        System.out.println("Resulting date: " + resultDate);
    }
}
