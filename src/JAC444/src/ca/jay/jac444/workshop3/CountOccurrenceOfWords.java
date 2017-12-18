/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-14
**********************************************/
package ca.jay.jac444.workshop3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//this class implements a program that counts the occurrences of words 
//in a text and displays the words and their occurrences in alphabetical 
//order of the words. 

public class CountOccurrenceOfWords implements W3TaskIF
{ 
	// In TreeMap, store an entry consisting of a word and its count. 
	// For each word, check whether it is already a key in the map. 
	// If not, add an entry to the map with the word as the key and value 1. 
	// Otherwise, increase the value for the word (key) by 1 in the map. 
	// Assume the words are case insensitive; e.g., Good is treated the same as good. 
	public Map<String, Integer> getCountOccrenceOfWords(String filename) throws Exception
	{
		// create a TreeMap to hold words as key and count as value
		// use TreeMap to display the output in alphabetical order of words,
		Map<String, Integer> map = new TreeMap<>();		
		
		// read the word lists from the file and store them in list		
		List<String> words = Arrays.asList(W3TaskUtil.getWordLines(filename));
		
		words.stream()
		.filter(k -> k.length() > 0)
		.map(m -> m.toLowerCase())
		.forEach(
			(k) -> {
				if (!map.containsKey(k)) 
					map.put(k, 1); 
				else 
					map.put(k, map.get(k) + 1);
			}
		);
 
		return map;
	}
 } 
