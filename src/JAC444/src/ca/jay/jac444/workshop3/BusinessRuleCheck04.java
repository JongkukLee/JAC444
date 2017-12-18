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

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleCheck04 implements BusinessRuleCheckIF {

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
	    
	    List<String> lotteryList = new ArrayList<>();
	    lotteryList.add(new Integer(lotteryDigit1).toString());
	    lotteryList.add(new Integer(lotteryDigit2).toString());
	    lotteryList.add(new Integer(lotteryDigit3).toString());
	    
	    List<String> guessList = new ArrayList<>();
	    guessList.add(new Integer(guessDigit1).toString());
	    guessList.add(new Integer(guessDigit2).toString());
	    guessList.add(new Integer(guessDigit3).toString());
	    
	    int matchCnt = (int)guessList.stream().filter(e -> lotteryList.contains(e)).count();	
	    
	    if(target != source && matNum == 1 && matchCnt == 1)
	    	return true;
	    else if(target != source && matNum == 2 && matchCnt == 2)
	    	return true;	    
	    else if(target != source && matNum == 3 && matchCnt == 3)
	    	return true;
	    
	    return false;
	}
}