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

import java.util.Vector;

// This class implements Task1 of Workshop2.

public class Triangle extends GeometricObject 
{
	// Three double data fields named side1, side2, and side3 with default 
	// values 1.0 to denote three sides of the triangle.
	private double side1 = 1.0d;
	private double side2 = 1.0d;
	private double side3 = 1.0d;	
	
	// A no-arg constructor that creates a default triangle.
	Triangle() { }
	
	// A constructor that creates a triangle with the specified side1, side2, and side3.
	Triangle(double side1, double side2, double side3) throws Exception 
	{
		// In a triangle, the sum of any two sides is greater than the other side. 
		// The Triangle class must adhere to this rule. 
		BusinessRuleIF<Double> br = new TriangleBusinessRule<Double>();
		Vector<Double> v = new Vector<Double>();
		v.add(side1);
		v.add(side2);
		v.add(side3);		
		br.ruleCheck(v);
	
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// The accessor methods for all three data fields. 
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
	
	// A method named getArea() that returns the area of this triangle.
	public double getArea()
	{
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));		
	}
	
	// A method named getPerimeter() that returns the perimeter of this triangle.
	public double getPerimeter()
	{
		return this.side1 + this.side2 + this.side3;
	}	
	
	// A method named toString() that returns a string description for the triangle. 
	@Override
	public String toString()
	{
		return new StringBuffer()
				.append("Triangle: side1 = ").append(this.side1)
				.append(" side2 = ").append(this.side2)
				.append(" side3 = ").append(this.side3).append("\n")
				.append(" Area = ").append(this.getArea()).append("\n")
				.append(" Perimeter = ").append(this.getPerimeter()).append("\n")
				.append(" Color = ").append(this.getColor()).append("\n")
				.append(" Filled = ").append(this.isFilled())				
				.toString();
	}
}
