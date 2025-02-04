import java.util.*;
class BankAccount{
	//static variable shared 
	private static String bankName = "Canara Bank";
	private static int totalAccounts = 0;
	

	//instancee variable
	private String accountHolderName;
	private final int accountNumber;
	private double balance;

	
	//constructor
	public BankAccount(String accountHolderName , int accountNumber , double balance ){
		this.accountHolderName = accountHolderName ; 
		this.accountNumber = accountNumber ;
		this.balance = balance ;
		
		totalAccounts++;
	}

	//static method for getting total accounts
	public static void getTotalAccounts(){
		System.out.println("total no. of accounts: " + totalAccounts );
	}

	
	public void displayAccountDetails(){
		//use instanceOf
		if(this instanceof BankAccount ){
			System.out.println("bank name: " + bankName);
			System.out.println("account holder name: " + accountHolderName );
			System.out.println("account number: " + accountNumber);
			System.out.println("balance: " + balance);
		}
		else{
			System.out.println("invalid account number");
		}
	}



	//methodd to deposit money
	public void deposit(double amount){ 
		if (amount > 0){
			balance += amount;
			System.out.println("deposited: " + amount + ", new balance : " + balance);
		}
		else{
			System.out.println("invalid deposit amount");
		}
	}

	//method to withdraw amount
	public void withdraw(double amount){
		if (amount > 0 && amount <= balance){
			balance -= amount;
			System.out.println("withdraw: " + amount + ",remaining balance : " + balance);
		}
		else{
			System.out.println("invalid withdraw amount or insufficient balance");
		}	
	}
} 






















