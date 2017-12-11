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

//This class implements the question4 of Workshop1
public class W1Question4 
{
	// 4.	In Programming Exercise 2, the Account class was defined to model a bank account. 
	// An account has the properties account number, balance, annual interest rate, and date 
	// created, and methods to deposit and withdraw funds. Create two subclasses for checking 
	// and saving accounts. A checking account has an overdraft limit, but a savings account 
	// cannot be overdrawn. 
	// Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount 
	// and invokes their toString() methods. 
	
	public static void main(String[] args) 
	{

		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println("----- Account -----");
		System.out.println(ac);
		System.out.println();		

		Account cac = new CheckingAccount(1122, 20000);
		cac.setAnnualInterestRate(4.5);
		cac.withdraw(2500);
		cac.deposit(3000);
		
		System.out.println(cac);		
		System.out.println();
		
		Account sac = new SavingAccount(1122, 20000);
		sac.setAnnualInterestRate(4.5);
		sac.withdraw(2500);
		sac.deposit(3000);
		
		System.out.println(sac);		
	}
}
