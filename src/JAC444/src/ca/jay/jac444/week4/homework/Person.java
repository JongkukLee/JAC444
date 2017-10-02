package ca.jay.jac444.week4.homework;

public abstract class Person
{
	private String name;
	private String l_name;
	private String email;
	
	public Person(String name, String l_name, String email)
	{
		this.name = name;
		this.l_name = l_name;
		this.email = email;
		
		
	}
	
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	public void setLN_name(String l_name)
	{
		this.l_name = l_name;
	}
	
	public void setLEmail(String email)
	{
		this.email = email;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	public String getL_name()
	{
		return this.l_name;
	}
	
	public String getLEmail()
	{
		return this.email;
	}
	
	public abstract void doing();

}