package ca.jay.jac444.workshop3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class W3Task2 {
    public static void main(String[] args) 
    {
	    int lottery = 456;
	
	// Prompt the user to enter a guess
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your lottery pick (three digits): ");
	    int guess = input.nextInt();
	
	// Get digits from lottery
	    int lotteryDigit1 = lottery / 100;
	    int lotteryDigit2 = (lottery % 100) / 10;
	    int lotteryDigit3 = lottery % 10;
	
	// Get digits from guess
	    int guessDigit1 = guess / 100;
	    int guessDigit2 = (guess % 100) / 10;
	    int guessDigit3 = guess % 10;
	
	    System.out.println("The lottery number is " + lottery);
	    System.out.println("The guess number is " + guess);
	    
	// Sum up both sets of digits to compare for 3 inconsecutive matches
	    int guessSum = guessDigit1 + guessDigit2 + guessDigit3;
	    int lotterySum = lotteryDigit1 + lotteryDigit2 + lotteryDigit3;

	    List<Integer> lotteryList = new ArrayList<>();
	    lotteryList.add(lotteryDigit1);
	    lotteryList.add(lotteryDigit2);
	    lotteryList.add(lotteryDigit3);
	    
	    List<Integer> guessList = new ArrayList<>();
	    guessList.add(guessDigit1);
	    guessList.add(guessDigit2);
	    guessList.add(guessDigit3);
	    
	    int correctCnt = (int)guessList.stream().filter(e -> lotteryList.contains(e)).count();	    
	    
	// RULE1 Check the guess
	    if (guess == lottery)
	        System.out.println("Exact match: you win $10,000");
	// RULE2   
	    else if ((guessDigit1 == lotteryDigit1
	        || guessDigit1 == lotteryDigit2 
	        || guessDigit1 == lotteryDigit3)
	        && (guessDigit2 == lotteryDigit1
	        || guessDigit2 == lotteryDigit2
	        || guessDigit2 == lotteryDigit3)
	        && (guessDigit3 == lotteryDigit1
	        || guessDigit3 == lotteryDigit2
	        || guessDigit3 == lotteryDigit3)
	        && guessSum == lotterySum)      
	        System.out.println("Match all digits: you win $3,000");
	// ADD RULE
	    else if(correctCnt == 2)
	    {
	        System.out.println("Match two digits: you win $2,000");	    	
	    }
	    
	//RULE3
	    else if ((guessDigit1 == lotteryDigit1
	        || guessDigit1 == lotteryDigit2
	        || guessDigit1 == lotteryDigit3)
	        || (guessDigit2 == lotteryDigit1
	        || guessDigit2 == lotteryDigit2
	        || guessDigit2 == lotteryDigit3)
	        || (guessDigit3 == lotteryDigit1
	        || guessDigit3 == lotteryDigit2
	        || guessDigit3 == lotteryDigit3))   
	        System.out.println("Match one digit: you win $1,000");
	
	    else
	        System.out.println("Sorry, no match");
	    

	    
	    System.out.println(correctCnt);
	    
        System.out.println(guessList.stream().filter(e -> lotteryList.contains(e)).collect(Collectors.toList()).size());
	    
    }
}