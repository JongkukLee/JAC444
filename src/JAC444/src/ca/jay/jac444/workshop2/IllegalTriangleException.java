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

public class IllegalTriangleException extends Exception {
	
	private double side1 = 0.0d;
	private double side2 = 0.0d;
	private double side3 = 0.0d;	
	
	// default constructor
	IllegalTriangleException()
	{
		super();
	}
	
	// constructor that receive message:String parameter
	IllegalTriangleException(String message)
	{
		super(message);
	}
	
	// constructor that receive message:String, three triangle sides parameter
	IllegalTriangleException(String message, double side1, double side2, double side3)
	{
		super(message);
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// accessor method for side1, 2, 3
	public double getSide1()
	{
		return this.side1;
	}
	public double getSide2()
	{
		return this.side2;
	}	
	public double getSide3()
	{
		return this.side3;
	}	
}
