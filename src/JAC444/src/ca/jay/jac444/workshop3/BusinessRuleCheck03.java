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

public class BusinessRuleCheck03 implements BusinessRuleCheckIF {

    /** 
     * check if all digits in the user input match all digits in the lottery number 
	 * check if one digit in the user input matches a digit in the lottery number 
     * 
     * @param index 0 of list: target numbers 
     *        index 1 of list: source numbers
     *        index 2 of list: the matching number      
     * @return boolean according to the matching number 
     */ 
	public boolean check(List<String> args)
	{
	    int target = new Integer(args.get(0));
	    int source = new Integer(args.get(1));
	    int matNum = new Integer(args.get(2));

		// Get digits from lottery
	    int lotteryDigit1 = target / 100;
	    int lotteryDigit2 = target % 100 / 10;
	    int lotteryDigit3 = target % 10;
	
	    // Get digits from guess
	    int guessDigit1 = source / 100;
	    int guessDigit2 = source % 100 / 10;
	    int guessDigit3 = source % 10;	    
	    
	    int matchCnt = 0;
	    
	    if(guessDigit1 == lotteryDigit1 || 
	       guessDigit1 == lotteryDigit2 ||
	       guessDigit1 == lotteryDigit3
	    ) ++matchCnt;
	    
	    if(guessDigit2 == lotteryDigit1 || 
	 	   guessDigit2 == lotteryDigit2 ||
	 	   guessDigit2 == lotteryDigit3
	 	) ++matchCnt;	    
	    
	    if(guessDigit3 == lotteryDigit1 || 
	 	   guessDigit3 == lotteryDigit2 ||
	 	   guessDigit3 == lotteryDigit3
	 	) ++matchCnt;	    
	    
	    
	    //System.out.println("BR:::: " + matNum + ", " + matchCnt);
	    
	    if(target != source && matNum == 1 && matchCnt == 1)
	    	return true;
	    else if(target != source && matNum == 2 && matchCnt == 2)
	    	return true;	    
	    else if(target != source && matNum == 3 && matchCnt == 3)
	    	return true;
	    
	    return false;
	}
}
