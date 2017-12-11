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

//This class implements the information of Checking Account for worshop1 in JAC444 class
public class CheckingAccount extends Account {

	// overdraft limit
	private double overdraftLimit = 0.0d;
	
	// A no-arg constructor
	public CheckingAccount() 
	{
		super();
	}
	
	//A constructor
	public CheckingAccount(int id, double balance)  
	{
		super(id, balance);
	}	
	
	// Has an overdraft limit
	@Override
	public void withdraw(double money)
	{
		double withdrawLimit = this.getBalance() + this.overdraftLimit;
		if(withdrawLimit - money < 0)
			System.out.println("You might try to withdraw beyond the limit.");
		else
			super.withdraw(money);
	}
	
    // Set overdraft limit information
    public void setOverdraftLimit(double money)
    {
    	this.overdraftLimit = money;
    }

	// override toString method for SavingAccount
    @Override
	public String toString ()
	{
		StringBuffer b = new StringBuffer();
		return b.append("----- Checking Account-----\n")
				.append("Balance: " + this.getBalance() + "\n")	
				.append("Monthly interest: " + this.getMonthlyInterest() + "\n")
				.append("Date: " + this.getDateCreated())				
			    .toString();
	}    
	
    // Write a test program that creates objects of Account, 
    // SavingsAccount, and CheckingAccount and invokes their toString() methods.    
	public static void main(String[] args) 
	{
		Account ac = new CheckingAccount(1122, 20000);
		
		ac.setAnnualInterestRate(4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println(ac);
	}

}
