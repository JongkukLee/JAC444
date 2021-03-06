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
package ca.jay.jac444.workshop2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// This class defines the functions to play Hangman Game 
public class HangmanGameUtil implements HangmanGameIF
{
	// read file and return ArrayList with contents
	public static String[] getGameWordLines() 
					throws FileNotFoundException, IOException
	{
		String[] lines = null;
        try (
        	FileReader fr = new FileReader(FILE_NAME);
        	BufferedReader inputBuffer = new BufferedReader(fr);	
        )
        {
        	String line;
        	if ((line = inputBuffer.readLine()) != null)
        		lines = line.split(" ");
        	
            return lines;
        } 
	}
	
    // display current state of the game
    public static void printArray(char[] array)
    {
    	for(int i = 0; i < array.length; i++)
    		System.out.print(array[i]);
    	
    }	

    // ask user to guess and enter a letter
    public static char askUserToGuess(char[] array)
    {
    	Scanner scanner = new Scanner(System.in);
		System.out.print(MSG1_ASK_ENTER);
		// display the all letter guessed
		HangmanGameUtil.printArray(array);
		System.out.print(PROMPT + " ");
		// assign the value entered by user
		char input = scanner.nextLine().charAt(0);
			

		return input;

		/*
		// Why is it not working!!!
    	try (Scanner scanner = new Scanner(System.in))
    	{
		    System.out.print(MSG1_ASK_ENTER);
			// display the all letter guessed
			HangmanGameUtil.printArray(array);
			System.out.print(PROMPT + " ");
			// assign the value entered by user
			char input = scanner.nextLine().charAt(0);
			
			return input;
    	}
    	*/
    }
    
    // check if input letter is already in the word array 
    public static boolean isalreadyInput(char[] array, char input)
    {
    	boolean isExist = false;
    	
    	for(int i = 0; i < array.length; i++)
    		if(array[i] == input) isExist = true;
    	
    	if(isExist)
    		System.out.printf(MSG2_CHK_VALUE, input);
    	return isExist;
    }
    
    // check if input letter is in the array 
    public static int isExistInArray(char[] array, char input, int missCnt)
    {
    	boolean matchLetter = false;
    	for(int i = 0; !matchLetter && i < array.length; i++)
    	{
			if(array[i] == input) 
				matchLetter = true;
    	}
		if(!matchLetter)
		{
			System.out.printf(MSG3_CHK_VALUE, input);
			missCnt++;	
		}

		return missCnt;
	}
	// return the game word line that is picked randomly
	public static char[] getGameWords(String[] lines)
	{
		// Generate random number
        int randomLineNumber = (int) (Math.random() * lines.length);
        
        // Create an array to store letters of random line
        char[] guessLine = lines[randomLineNumber].toCharArray();
		
        return guessLine;
	}
	
	
	// convert the line to char array to compare with user input
	public static char[] getInitPlayerGuessWords(int amountOfGuess)
	{
		char[] playerGuesses = new char[amountOfGuess];
		for(int i = 0; i < playerGuesses.length; i++)
			playerGuesses[i] = GUESS_LETTER;
	
		return playerGuesses;
	}
	
	// function replace the matching words to player array
	public static char[] getMatchPlayerGuessWords(char[] randomWordGuess, char[] playerGuesses, char input)
	{
		for(int i = 0; i < randomWordGuess.length; i++)
		{
			if(randomWordGuess[i] == input)
				playerGuesses[i] = input;
		}  

		return playerGuesses;
	}
	
	// check if the game is finished
	public static boolean isHangmanGameFinished(int amountOfGuess, int tries)
	{
		return amountOfGuess - tries == 0;
	}
	
    // check all letters are correctly guessed.
    public static boolean isTheWordGuessed(char[] array, int missCnt)
    {
    	for(int i  = 0; i < array.length; i++)
    		if(array[i] == GUESS_LETTER) return false;

		System.out.printf(MSG4_DSP_RESUT, missCnt);
		System.out.println();    	
    	
    	return true;
    }	
	
	// if the number tries by user is the same to question word
	// then stop the ask user enter and display next instruction
	public static boolean areYouPlayingAgain()
	{
		// ask user if want to play again
		System.out.print (MSG5_ASK_AGAIN);
		Scanner scanner = new Scanner(System.in);
		char continueGame = scanner.nextLine().charAt(0);
		
		// if user enter 'N' or 'n', then game is over
		if(continueGame == ANS_N1 || continueGame == ANS_N2)
			return false;
		
		return true;		
		/*
		// Why is it not working?
		try (Scanner scanner = new Scanner(System.in))
		{
			char continueGame = scanner.nextLine().charAt(0);
			
			// if user enter 'N' or 'n', then game is over
			if(continueGame == ANS_N1 || continueGame == ANS_N2)
				return false;
			
			return true;
		}
		*/
	}
	
	// then stop the ask user enter and display next instruction
	public static void displayEndGame()
	{
	    System.out.println("Game Over!");		
	}
}