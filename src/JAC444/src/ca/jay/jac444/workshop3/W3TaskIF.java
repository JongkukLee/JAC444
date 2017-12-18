/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-8
**********************************************/
package ca.jay.jac444.workshop3;

//This interface declares constants to play Hangman Game 
public interface W3TaskIF 
{
	public static final int LOTTERY_NUM = 456;
	public static final String DELIMITE_CHARS = "[ \n\t\r.,;:!?(){}]"; 
	public static final String ERR1_MSG = "It needs a command-line argument for a file name";
	public static final String ERR2_MSG = "Please, enter a three-digit number";	
	public static final String MSG_0001 = "The words in the file must start with a letter.";	
	public static final String MSG_0002 = "Enter your lottery pick (three digits): ";
	public static final String MSG_0003 = "You win $";
	public static final String MSG_0004 = "Sorry, no match!!!";	
	public static final String MSG_0005 = "Please, start again!";
}
