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

public class TriangleBusinessRule<T extends Number> implements BusinessRuleIF<T> {

	
	// check rule
	// In a triangle, the sum of any two sides is greater than the other side. 
	// The Triangle class must adhere to this rule. 	
	public void ruleCheck(Vector<T> valList) throws IllegalTriangleException
	{
		Double s1 = valList.get(0).doubleValue();		
		Double s2 = valList.get(1).doubleValue();		
		Double s3 = valList.get(2).doubleValue();		
		
		if(!(s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2))
		{
			String message = MSG1_TRIANGLE;
			throw new IllegalTriangleException(message, s1, s2, s3);
		}		
	}
}
