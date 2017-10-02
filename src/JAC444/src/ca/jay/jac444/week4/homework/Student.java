package ca.jay.jac444.week4.homework;

public class Student extends Person implements Talkable {

	private String program;
	
	public Student(String name, String l_name, String email, String program)
	{
		super(name, l_name, email);
		this.program = program;
		
	}
	
	//@override
	public void doing()
	{
		System.out.println("Studying as Student");
	}
	
	//@override
	public void say() 
	{
		System.out.println("Hello!, My name is " + super.getName() + " " + super.getL_name() + " and" + this.program);
	}
	
	
}
