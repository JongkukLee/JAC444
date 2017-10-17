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

import java.util.Date;
import java.util.GregorianCalendar;;

public class TestAssinment1Task1 {
	
	public static void main(String[] args) {
		try
		{
			Visit[] visits = { 
					new Visit ("Lee",  new GregorianCalendar(2017, 8, 11).getTime()),
					new Visit ("Hong", new GregorianCalendar(2017, 8, 12).getTime()),	
					new Visit ("KIm",  new GregorianCalendar(2017, 8, 16).getTime()),
					new Visit ("Jung", new GregorianCalendar(2017, 8, 25).getTime()),
					new Visit ("Lee",  new GregorianCalendar(2017, 9, 1).getTime())
			};
			visits[0].customer.setMember(true);
			visits[0].customer.setMemberType(Customer.PREMIUM);
			visits[0].setServiceExpense(123.00d);
			visits[0].setProductExpense(234.00d);			
			
			visits[1].customer.setMember(true);
			visits[1].customer.setMemberType(Customer.GOLD);
			visits[1].setServiceExpense(123.00d);
			visits[1].setProductExpense(234.00d);			
			
			visits[2].customer.setMember(true);
			visits[2].customer.setMemberType(Customer.SILVER);
			visits[2].setServiceExpense(123.00d);
			visits[2].setProductExpense(234.00d);			
			
			visits[3].customer.setMember(false);
			visits[3].customer.setMemberType(Customer.NONE);
			visits[3].setServiceExpense(123.00d);
			visits[3].setProductExpense(234.00d);
			
			visits[4].customer.setMember(true);
			visits[4].customer.setMemberType(Customer.PREMIUM);
			visits[4].setServiceExpense(321.00d);
			visits[4].setProductExpense(432.00d);			
			
			for(Visit e: visits)
			{
				System.out.println(e);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
