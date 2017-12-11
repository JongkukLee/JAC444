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

// This class implements the question2 of Workshop1
public class W1Question2 {
	
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
