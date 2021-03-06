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

import java.util.Scanner;

// This class implements the task1 of WorkWhop2
public class W2Task1 
{
	// Write a test program that prompts the user to enter three sides of 
	// the triangle, a color, and a Boolean value to indicate whether the 
	// triangle is filled. The program should create a Triangle object with 
	// these sides and set the color and filled properties using the input. 
	// The program should display the area, perimeter, color, and true or 
	// false to indicate whether it is filled or not. Also display a test 
	// scenario where the exception is thrown and user will be displayed 
	// appropriate message.
	
	public static void main(String[] args) 
	{
		System.out.println("Enter three sides of triangle: ");
		try (Scanner sc = new Scanner(System.in);)
		{
			// prompts the user to enter three sides of 
			// the triangle, a color, and a Boolean value
			double side1 = sc.nextDouble();
			double side2 = sc.nextDouble();
			double side3 = sc.nextDouble();		
			String color = sc.next();
			boolean filled = sc.nextBoolean();
			
			// Create object of Trangle;
			Triangle t1 = new Triangle(side1, side2, side3);
			t1.setColor(color);
			t1.setFilled(filled);
			
			System.out.println(t1);			
		}
		catch(IllegalTriangleException ex1)
		{
			System.out.println("Exception: " + ex1.getMessage());
			System.out.println("Side1: " + ex1.getSide1());			
			System.out.println("Side2: " + ex1.getSide2());
			System.out.println("Side3: " + ex1.getSide3());			
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();			
		}
	}
}
