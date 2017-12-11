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

import java.io.FileNotFoundException;
import java.io.IOException;

// Write a hangman game that randomly generates a word and prompts the user 
// to guess one letter at a time, as shown in the sample run. Each letter in 
// the word is displayed as an asterisk. When the user makes a correct guess, 
// the actual letter is then displayed. When the user finishes a word, display 
// the number of misses and ask the user whether to continue to play with another 
// word. The program reads the words stored in a text file named hangman.txt. Words 
// are delimited by spaces. Also make sure you properly handle exceptions in the program 
// like ¡°FileNotFoundException¡±.
public class W2Task2{
	
	
    public static void main(String[] args) 
    {
    	try
    	{    	
    		hangMan();
    	}
    	catch(FileNotFoundException fe)
    	{
    		System.out.println(fe.getMessage());
    		fe.printStackTrace();
    	}
    	catch(IOException ie)
    	{
    		System.out.println(ie.getMessage());
    		ie.printStackTrace();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}     		
    		
    }
    // defines to play hangman
    public static void hangMan() throws Exception
    {
    	// choose one of word(line) from the file
		String[] lines = HangmanGameUtil.getGameWordLines();

		// if being continue 
		boolean weArePlaying = true;
        while(weArePlaying)
        {
        	// get a word line from a file
        	char[] randomWordGuess = HangmanGameUtil.getGameWords(lines);
        	int amountOfGuess = randomWordGuess.length;
        	
        	// convert the line to char array to compare with user input
        	char[] playerGuesses = HangmanGameUtil.getInitPlayerGuessWords(amountOfGuess);
        	
        	// to check if all letters are correctly guessed (game over)
        	boolean wordIsGuessed = false;

        	// to check how many times user tries
        	// int tries = 0; 
        	// miss count entered by user
        	
    		int missCnt = 0; 
        	// loop until all letters are correctly guessed.
        	while (!wordIsGuessed)
        	{
        		// assign the value entered by user
        		char input = HangmanGameUtil.askUserToGuess(playerGuesses);

        		// increase the number of input
        		// tries++;
        		
        		// check if input letter is already in the word array
        		HangmanGameUtil.isalreadyInput(playerGuesses, input);

        		// check if input letter is in the array 
        		missCnt = HangmanGameUtil.isExistInArray(randomWordGuess, input, missCnt);        	

       			// function replace the matching words to player array
    			playerGuesses = HangmanGameUtil.getMatchPlayerGuessWords(randomWordGuess, playerGuesses, input);

        		// if the number tries by user is the same to question word
        		// then stop the ask user enter and display next instruction
    			wordIsGuessed = HangmanGameUtil.isTheWordGuessed(playerGuesses, missCnt);

    			// if all letters are correctly guested, ask user to be continue game
    			if(wordIsGuessed)
    				weArePlaying = HangmanGameUtil.areYouPlayingAgain();
        		
        	}
        }
        // quit the game
        HangmanGameUtil.displayEndGame();
    }
}
