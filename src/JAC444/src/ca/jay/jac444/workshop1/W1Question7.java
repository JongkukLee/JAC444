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

//This class implements the question7 of Workshop1
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class W1Question7 
{
	// shuffle the elements from an array list of integers
    public static void shuffle(ArrayList<Number> list) 
    {
        for (int i = 0; i < list.size(); i++) 
        {
            int random = (int) (Math.random() * list.size());
            Number tmp = list.get(random);
            list.set(random, list.get(i));
            list.set(i, tmp);
        }
    }	
	
    // Test method for shuffle fucntion
	public static void main(String[] args) 
	{
		// Create an ArrayList
		ArrayList<Number> list = new ArrayList<Number>();

		// Prompt the user to enter 10 integers
		System.out.print("Enter 10 Integers: ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			list.add(sc.nextInt());
		}
		
		// Shuffle numbers by calling shuffle function
		shuffle(list);
		
		// displays the shuffed result list
		System.out.print("The shuffled integers are: ");
		for(Number e:list)
			System.out.print(e + " ");				

		sc.close();
	}
}
