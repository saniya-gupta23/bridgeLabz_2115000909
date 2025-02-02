public class Main3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 1000.0);
        account1.displayAccountDetails();

        account1.setBalance(1500.0);
        System.out.println("Updated Balance: " + account1.getBalance());

        SavingsAccount savingsAccount1 = new SavingsAccount("9876543210", "Alice Smith", 2000.0);
        savingsAccount1.displaySavingsAccountDetails();
    }
}
