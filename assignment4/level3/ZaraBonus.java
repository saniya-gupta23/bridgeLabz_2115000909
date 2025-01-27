import java.util.Random;

public class ZaraBonus {

    public static void main(String[] args) {
        int[][] employeeData = new int[10][2];  // 2D Array to store salary and years of service for 10 employees

        // Generate random salary and years of service for 10 employees
        generateEmployeeData(employeeData);

        // Calculate new salary and bonus for each employee
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display the sum of old salary, new salary, and total bonus
        calculateAndDisplayTotals(employeeData, updatedData);
    }

    // Method to generate salary and years of service using Math.random()
    public static void generateEmployeeData(int[][] employeeData) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            // Generating random 5-digit salary (between 10000 and 99999)
            employeeData[i][0] = random.nextInt(90000) + 10000;
            // Generating random years of service (between 1 and 30)
            employeeData[i][1] = random.nextInt(30) + 1;
        }
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedData = new double[10][3];  // 2D array to store the new salary and bonus

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = oldSalary;  // Old Salary
            updatedData[i][1] = newSalary;  // New Salary
            updatedData[i][2] = bonusAmount;  // Bonus
        }
        return updatedData;
    }

    // Method to calculate and display totals of old salary, new salary, and bonus
    public static void calculateAndDisplayTotals(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Bonus Details:");
        System.out.println("---------------------------------------------------");
        System.out.println("Emp No | Old Salary | New Salary | Bonus");
        System.out.println("---------------------------------------------------");

        // Display details for each employee and calculate totals
        for (int i = 0; i < 10; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];

            System.out.printf("%7d | %10d | %10.2f | %.2f%n", (i + 1), employeeData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Total   | %10.2f | %10.2f | %.2f%n", totalOldSalary, totalNewSalary, totalBonus);
    }
}
