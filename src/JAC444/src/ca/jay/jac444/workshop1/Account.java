/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-1
**********************************************/
package ca.jay.jac444.workshop1;

import java.util.Date;
import java.util.ArrayList;

// This class implements the information of Account for worshop1 in JAC444 class
public class Account {

	// A private int data field named id for the account (default 0). 
	private int id  = 0;
	// A private double data field named balance for the account (default 0).
	private double balance = 0.0d;
	// A private double data field named annualInterestRate that stores 
	// the current interest rate (default 0). Assume all accounts have 
	// the same interest rate.
	private double annualInterestRate = 0.0;
	// A private Date data field named dateCreated that stores the date 
	// when the account was created.
	private Date dateCreated = new Date();
	
	// For Question5, add a new data field name of the String type to store 
	// the name of the customer.
	private String name = null; 
	
	// For Question5, add a new data field named transactions whose type is 
	// ArrayList that stores the transaction for the accounts. 
	// Each transaction is an instance of the Transaction class. 
	private ArrayList<Transaction> transactions = null;

	// A no-arg constructor that creates a default account. 
	public Account() { }
	// A constructor that creates an account with the specified id and initial balance.
	public Account(int id, double balance) 
	{ 
		this.id = id;
		this.balance = balance;
		this.transactions = new ArrayList<Transaction>();		
	}
	// For Question5, add a new constructor that constructs an account 
	// with the specified name, id, and balance.	
	public Account(String name, int id, double balance) 
	{
		this(id, balance);		
		this.name = name;
	}
	// The mutator method for id
	public void setId(int id)
	{
		this.id = id;
	}
	// The mutator method for balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	// The mutator method for annualInterestRate.
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	// Add for Question5
	// The accessor method for name
	public String getName()
	{
		return this.name;
	}
	// Add for Question5
	// The accessor method for transactions
	public ArrayList<Transaction> getTransaction()
	{
		return this.transactions;
	}
	// The accessor method for id
	public int getId()
	{
		return this.id;
	}
	// The accessor method for balance	
	public double getBalance()
	{
		return this.balance;
	}
	// The accessor method for annualInterestRate.	
	public double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	// The accessor method for dateCreated. 
	public Date getDateCreated()
	{
		return this.dateCreated;
	}
	// A method named getMonthlyInterestRate() that returns 
	// the monthly interest rate.
	// monthlyInterestRate is annualInterestRate / 12
	public double getMonthlyInterestRate()
	{
		return this.annualInterestRate / 12;
	}
	// A method named getMonthlyInterest() that returns the monthly interest. 
	// Monthly interest is balance * monthlyInterestRate
	public double getMonthlyInterest()
	{
		return this.balance * (this.annualInterestRate / 12 / 100);
	}
	// A method named withdraw that withdraws a specified amount from the account.
	public void withdraw(double money)
	{
		this.balance -= money;
		// For Question5, modify the withdraw methods to add a transaction 
		// to the transactions array list.
		this.transactions.add(new Transaction('W', money, this.getBalance(), "Withdraw: " + new Date().toString()));
	}
	// A method named deposit that deposits a specified amount to the account. 
	public void deposit(double money)
	{
		this.balance += money;
		// For Question5, modify the deposit methods to add a transaction 
		// to the transactions array list.
		this.transactions.add(new Transaction('D', money, this.getBalance(), "Deposit:" + new Date().toString()));
	}
	
	// Write a test program that creates an Account object with an account 
	// ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. 
	// Use the withdraw method to withdraw $2,500, use the deposit method to 
	// deposit $3,000, and print the balance, the monthly interest, and the 
	// date when this account was created. 
	
	public static void main(String[] args) {

		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println("Balance: " + ac.getBalance());
		System.out.println("Monthly interest: " + ac.getMonthlyInterest());
		System.out.println("Date: " + ac.getDateCreated());		
	}
}
