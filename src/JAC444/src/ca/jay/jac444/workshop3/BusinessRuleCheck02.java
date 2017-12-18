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

public class BusinessRuleCheck02 implements BusinessRuleCheckIF {

    /** 
     * check if the three numbers match in the exact order 
     * 
     * @param index 0 of list : target numbers, 1 : source numbers      
     * @return boolean according to matching: match - true; otherwise; false 
     */ 
	public boolean check(List<String> args)
	{
	    int target = new Integer(args.get(0));
	    int source = new Integer(args.get(1));

	    return target == source;
	}
}
