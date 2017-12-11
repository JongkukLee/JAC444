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

import java.util.Date;

abstract class GeometricObject 
{
	// color of shape
	private String color;
	// check if filled color
	private boolean filled; 
	// created date
	private Date dateCreated;  
	 
	// no-arg constructor 
	GeometricObject() { }
	// constructor that creates with the specified color, fill or not. 
	GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	// getters and setters
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean isFilled()
	{
		return this.filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public java.util.Date getDateCreated()
	{
		return this.dateCreated;
	}
	// override toString method
	@Override
	public String toString()
	{
		return new StringBuffer().append("Color: ").append(this.getColor())
				                 .append("Filled: ").append(this.isFilled()).toString();
	}
	// abstract classes
	abstract double getArea();
	abstract double getPerimeter();
}
