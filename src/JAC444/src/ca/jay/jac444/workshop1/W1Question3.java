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

import java.util.InputMismatchException;
import java.util.Scanner;

//This class implements the question3 of Workshop1
public class W1Question3 {
	
	// Use the Account class created in Exercise 2 (above) to simulate an ATM machine. 
	// Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. 
	// The system prompts the user to enter an id. If the id is entered incorrectly, 
	// ask the user to enter a correct id. Once an id is accepted, the main menu 
	// is displayed as shown in the sample run. You can enter a choice 1 for viewing the 
	// current balance, 2 for withdrawing money, 3 for depositing money, and 4 for exiting 
	// the main menu. Once you exit, the system will prompt for an id again. Thus, once the 
	// system starts, it will not stop. 
	public static void menu()
	{
		Scanner sc = null;
		int inputId = 0;		

		while(true)
		{
			System.out.println("Enter an id: ");
			sc = new Scanner(System.in);
			try
			{
				inputId = sc.nextInt();
				// If the id is entered incorrectly, ask the user to enter a correct id
				if(0 <= inputId && inputId <= 9)
					break;
				else
					System.out.println("Please input the correct ID");					
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please input the correct ID");
			}
		}
		// create account
		Account ac = new Account(inputId, 100);
		
		int inputMenu = 0;
		do
		{
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println("Enter a choice: ");	
	
			sc = new Scanner(System.in);
			inputMenu = sc.nextInt();
			switch(inputMenu)
			{
				case 1: System.out.println("The balance is " + ac.getBalance()); 
				        break;
				case 2: System.out.println("Enter an amount to withdraw: "); 
				        sc = new Scanner(System.in);
				        double withdraw = sc.nextDouble();
				        ac.withdraw(withdraw);
				        break;
				case 3: System.out.println("Enter an amount to deposit: "); 
		        		sc = new Scanner(System.in);
		        		double deposit = sc.nextDouble();
		        		ac.deposit(deposit);
		        		break;
				case 4: inputMenu = 4; 			
			}
			
			System.out.println(); 	
		}
		while(inputMenu != 4);
		
		System.out.println("Good-Bye!!!"); 
		
		sc.close();			
	}
	
	
	public static void main(String[] args) {
		
		
		try
		{
			W1Question3.menu();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
/*
Sample Run: 

Enter an id: 4 
Main menu 
1: check balance 
2: withdraw 
3: deposit 
4: exit 
Enter a choice: 1 
The balance is 100.0 
 
Main menu 
1: check balance 
2: withdraw 
3: deposit 
4: exit 
Enter a choice: 2 
Enter an amount to withdraw: 3 
 
Main menu 
1: check balance 
2: withdraw 
3: deposit 
4: exit 
Enter a choice: 1 
The balance is 97.0
*/
}
