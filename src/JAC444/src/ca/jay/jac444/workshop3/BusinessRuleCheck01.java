/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-14
**********************************************/
package ca.jay.jac444.workshop3;

import java.util.List;

public class BusinessRuleCheck01 implements BusinessRuleCheckIF {

	public boolean check(List<String> args)
	{
    	// check if the words must start with a letter. 
    	for(String e: args)
    		if(e.length() > 0 && Character.isDigit(e.charAt(0)))
    			return false;
    	
    	return true;
	}
}
