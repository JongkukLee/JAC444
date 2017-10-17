package ca.jay.jac444.week3.lecture;

public class B extends A {    
	// overrides m in the A class    
	public void m() {        
		super.m();        
		System.out.println("In Subclass");    
	}    
	public static void main(String[] args) {        
		A x = new B();        
		x.m(); // what does it print?       
	}
}
