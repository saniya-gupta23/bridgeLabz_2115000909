import java.util.Scanner;

public class BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Height must be positive. Re-enter height: ");
                personData[i][0] = scanner.nextDouble();
            }
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Weight must be positive. Re-enter weight: ");
                personData[i][1] = scanner.nextDouble();
            }
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
