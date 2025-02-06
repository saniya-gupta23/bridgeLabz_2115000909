import java.util.*;

class Bank{
	private String name;
	private ArrayList<BankAccount> accounts;

	public Bank(String name){
		this.name  = name;
		this.accounts = new ArrayList<>();
	}


	//bankAccount is a new object and openAccount is method
	public BankAccount openAccount(Customer customer , double initialDeposit){
		BankAccount account = new BankAccount(this, customer, initialDeposit);
		accounts.add(account);
		customer.addAccount(account);
		return account;
	}
	public String getName(){
		return name;
	}
}


class BankAccount{
	private static int accountCounter =1000;
	private Bank bank;
	private int accountNumber;
	private Customer customer;
	private double balance;

	public BankAccount(Bank bank, Customer customer ,double initialDeposit){
		this.bank = bank ;
		this.customer = customer;
		this.balance = balance;
		this.accountNumber = accountNumber++;
	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	public void withdraw(double amount){
		if (amount <= balance){
			balance -= amount;
		}
		else{
			System.out.println("insufficient funds");
		}
	}

	@Override
	public String toString(){
		return "Account no.: " + accountNumber  + "bank:" + bank.getName() + ",balance: " + balance;
	}
}

class Customer{
	private String name;
	private ArrayList<BankAccount> accounts;

	public Customer(String name){
		this.name = name;
		this.accounts = new ArrayList<>();
		}

	public void addAccount(BankAccount account){
		accounts.add(account);
	}

	public void viewBalance(){
		System.out.println("customer: " + name);
		for(BankAccount account : accounts){
			System.out.println(account);
		}
	}
}


public class BankManagement{
	public static void main(String args[]){
		Bank bank1 = new Bank("HDFC bank");
		Bank bank2 = new Bank("Canara Bank");

		Customer customer1 = new Customer("saniya");
		Customer customer2 = new Customer("samiksha");

		bank1.openAccount(customer1 , 5000);
		bank1.openAccount(customer2 , 30000);
		bank2.openAccount(customer1 , 45000);


		customer1.viewBalance();
		System.out.println();
		customer2.viewBalance();
	}
}	














































 















