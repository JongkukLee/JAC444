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

//This class implements the task1 of WorkWhop3
public class W3Task1 {
	// write test program
	public static void main(String[] args) throws Exception
	{
		try
		{
			// The text file name is passed as a command-line argument
			// check command-line argument count
			if(args != null && args.length == 0)
				throw new IllegalArgumentException(W3TaskIF.ERR1_MSG);

			// crate new object 
			CountOccurrenceOfWords w3 = new CountOccurrenceOfWords(); 
			
			// get TreeMap consisting of a word and its count
			// get all entries with Lambda Expression and display
			// display the output in alphabetical order of words because of TreeMap
			w3.getCountOccrenceOfWords(args[0])
			.forEach((k, v) -> System.out.println(v + "\t" + k));
		}
		catch(Workshop3Exception we)
		{
			System.out.println(we.getMessage());
		}		
		catch(IllegalArgumentException ie)
		{
			System.out.println(ie.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

