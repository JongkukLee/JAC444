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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// This class defines the functions to play Hangman Game 
public class W3TaskUtil implements W3TaskIF
{
	// read file and return ArrayList with contents
	public static String[] getWordLines(String filename) 
					throws FileNotFoundException, IOException
	{
		String[] words = null;
        try (
        	FileReader fr = new FileReader(filename);
        	BufferedReader inputBuffer = new BufferedReader(fr);	
        )
        {
        	String line;
        	if ((line = inputBuffer.readLine()) != null)
        		words = line.split(DELIMITE_CHARS);
        	
            return words;
        } 
	}
}