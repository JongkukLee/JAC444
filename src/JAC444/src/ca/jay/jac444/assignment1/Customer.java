/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-10-15
**********************************************/
package ca.jay.jac444.assignment1;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;

	public static final String PREMIUM = "PREMIUM";
	public static final String GOLD    = "GOLD";
	public static final String SILVER  = "SILVER";	
	public static final String NONE  = "NONE";	
	
	public Customer(String name)
	{
		// default initialization
		this.name = name;
		this.member = false;
		this.memberType = "";
	}

	// return member's name
	public String getName()
	{
		return this.name;		
	}
	// return true or false according to a member type
	public boolean isMember()
	{
		return this.member;		
	}
	
	// set true or false if a customer has a membership
	public void setMember(boolean member)
	{
		this.member = member;
	}
	
	// return a member type
	public String getMemberType()
	{
		return this.memberType;
	}
   
	// set a member type
	public void setMemberType(String type) throws Exception
	{
		if(!PREMIUM.equals(type) && 
		   !GOLD.equals(type) &&
		   !SILVER.equals(type) &&
		   !NONE.equals(type))
		{
			throw new Exception("Member Type must be one of PREMIUM, GOLD, SILVER, NONE");
			
		}
		this.memberType = new String(type);
	}	
	
	// get customer information including a customer's name, a member type
    @Override
	public String toString ()
	{
		StringBuffer b = new StringBuffer();
		return b.append("Customer Name: " + this.getName() + " (")
			  .append("Member Type: " + (this.isMember()?this.getMemberType():"") + ")")
			  .toString();
	}
}
