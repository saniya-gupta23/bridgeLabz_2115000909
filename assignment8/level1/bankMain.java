public class bankMain{
	public static void main(String args[]){
		BankAccount acc1 = new BankAccount("saniya" , 103, 2895.0);
		BankAccount acc2 = new BankAccount("samiksha" , 104, 5210);

		acc1.displayAccountDetails();
		acc2.displayAccountDetails();


		acc1.deposit(1500.0);
		acc2.withdraw(1200.0);

		BankAccount.getTotalAccounts();
	}
}
