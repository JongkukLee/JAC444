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
public interface W3TaskIF {

	public static final String DELIMITE_CHARS = "[ \n\t\r.,;:!?(){}]"; 
	
	public static final String MSG1_ASK_ENTER = "(Guess) Enter a letter in word ";
	public static final String MSG2_CHK_VALUE = "\t%s is already in the word\n";
	public static final String MSG3_CHK_VALUE = "\t%s is not in the word\n";
	public static final String MSG4_DSP_RESUT = "The word is program. You missed %d time";
	public static final String MSG5_ASK_AGAIN = "Do you want to guess another word? Enter y or n> ";
}
