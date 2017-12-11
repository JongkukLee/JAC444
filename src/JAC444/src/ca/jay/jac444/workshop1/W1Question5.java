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

//This class implements the question5 of Workshop1
public class W1Question5 {
	
	// Write a test program that creates an Account with annual 
	// interest rate 1.5%, balance 1000, id 1122, and name George. 
	// Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 
	// from the account. Print an account summary that shows account holder name, 
	// interest rate, balance, and all transactions. 
	public static void main(String[] args) {

		Account ac = new Account("George", 1122, 1000);
		ac.setAnnualInterestRate(1.5);
		ac.deposit(30);
		ac.deposit(40);		
		ac.deposit(50);		
		ac.withdraw(5);
		ac.withdraw(4);
		ac.withdraw(2);

		System.out.println("-----------------------------------------");		
		System.out.println("Account holder name: " + ac.getName());
		System.out.println("Interest rate: " + ac.getMonthlyInterest());		
		System.out.println("Balance: " + ac.getBalance());
		System.out.println("-----------------------------------------");

		for(Transaction e:ac.getTransaction())
			System.out.println(e);

		
	}
}
