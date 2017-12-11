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

//This class implements the information of Saving Account for worshop1 in JAC444 class
public class SavingAccount extends Account {

	// A no-arg constructor
	public SavingAccount() 
	{
		super();
	}
	
	//A constructor
	public SavingAccount(int id, double balance)  
	{
		super(id, balance);
	}		
	
	// override toString method for SavingAccount
    @Override
	public String toString ()
	{
		StringBuffer b = new StringBuffer();
		return b.append("----- Saveing Account-----\n")
				.append("Balance: " + this.getBalance() + "\n")	
				.append("Monthly interest: " + this.getMonthlyInterest() + "\n")
				.append("Date: " + this.getDateCreated())				
			    .toString();
	}    
	
    // Write a test program that creates objects of Account, 
    // SavingsAccount, and CheckingAccount and invokes their toString() methods. 
	public static void main(String[] args) 
	{
		Account ac = new SavingAccount(1122, 20000);
		
		ac.setAnnualInterestRate(4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println(ac);
	}
	
}
