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

import java.util.Scanner;
import java.util.ArrayList;

//This class implements the question6 of Workshop1
public class W1Question6 {

	// removes the duplicate elements from an array list of integers
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		int[] temp = new int[10];
		
		// array index to add element
		int idx = 0;
		
		// Compare the element of ArrayList and the element of temp array
		// If there is no duplicate value in temp array, add the value to the temp array.
		for(Integer e:list)
		{
			boolean duplicate = false;
			for(int i = 0; i < 10; i++)
				if(e.intValue() == temp[i]) duplicate = true;
			// if there is no duplicate element in temp array
			// add data to temp array
			if(!duplicate)
				temp[idx++] = e.intValue();
		}
		
		// Now all elements are not duplicated in the temp array, 
		// so remove all element of ArrayList 
		// then insert the elements of temp array to ArrayList.
		list.removeAll(list);
		
		for(Integer v:temp)
			if(v != 0) list.add(new Integer(v));
	}
	
	// Write a test program that prompts the user to enter 10 integers 
	// to a list and displays the distinct integers separated by exactly one space.
	//
	// Here is a sample run:
 	// Enter 10 Integers: 34 5 3 5 6 4 33 2 2 4 
 	// The district integers are: 34 5 3 6 4 33 2 
	public static void main(String[] args) 
	{
		// Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 10 integers
		System.out.print("Enter 10 Integers: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
		
		// Remove the deplicated numbers by calling removeDuplicate function
		removeDuplicate(list);
		
		// displays the distinct integers separated by exactly one space
		System.out.print("The district integers are: ");
		for(Integer e:list)
			System.out.print(e + " ");		
	}
}
