package ca.jay.jac444.week3.lecture;
class Shape {} 
class Circle extends Shape {} 
class Rectangle extends Shape {} 

public class Question {
	  public static void main(String[] args) { 
		  Circle[] myCircles = {new Circle(), new Circle()}; 
		  Shape[] myShapes = myCircles; 
		    
		      //myShapes[0] = new Rectangle(); // line 10 
		    } 
}
