/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-1
**********************************************/
package ca.jay.jac444.workshop1;

//This class implements the question1 of Workshop1
public class W1Question1 {

	// non recusive function
	public void sumSeries()
	{
		double sum = 0.0d;
		for(int i = 99; i > 2; i -= 2 )
			sum += (double)(i-2)/i;

		System.out.println(sum);		
	}
	public static void main(String[] args) {
		W1Question1 q1 = new W1Question1();
		q1.sumSeries();
	}
}
