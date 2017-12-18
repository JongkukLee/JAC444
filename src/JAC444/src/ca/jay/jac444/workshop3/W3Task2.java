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

// This class is the test program for task2 of workshop3
public class W3Task2 {
    public static void main(String[] args) 
    {
    	try
    	{
    		new LotteryGame().startLotteryGame();
    	}
    	catch(Workshop3Exception we)
    	{
    		System.out.println(we.getMessage());
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();    		
    	}
    }
}