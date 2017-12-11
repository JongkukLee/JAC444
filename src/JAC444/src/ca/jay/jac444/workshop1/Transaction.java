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

//This class implements the information of transaction for worshop1 in JAC444 class
public class Transaction {

	// The date of this transaction. 
	Date date = new Date();
	// The type of transaction, such as ¡®W¡¯ for withdrawal,  ¡®D¡¯ for deposit. 
	 char type = '\u0000'; 
	// The amount of the transaction. 
	double amount = 0.0d; 
	// The new balance after transaction. 
	double balance = 0.0d;
	// The description of this transaction.
	String description = null; 
	
	// constructor 
	Transaction(char type, double amount, double balance, String description)
	{
		 this.type = type;
		 this.amount = amount;
		 this.balance = balance;
		 this.description = description;
	}
	
	// override toString method for displaying transaction history
	@Override
	public String toString()
	{
		return new StringBuffer()
				.append("Type: " + this.type + ", ")
				.append("Amount: " + this.amount + ", ")
				.append("Balance: " + this.balance + ", ")
				.append("Description: " + this.description)				
				.toString();
	}
}
