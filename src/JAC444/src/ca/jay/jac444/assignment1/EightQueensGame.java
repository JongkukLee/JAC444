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

class EightQueensGame {
    private int numOfCols;
    
    private int [] cols;

    // one parameter constructor    
	EightQueensGame (int num)
    {
    	this.numOfCols = num;
    	this.cols = new int[numOfCols];
    }
	
	// apply the game rule by calling inner class method
	public void applyRule() throws Exception
	{
		this.new GameRule().makeEightQueen();
	}

	// return the column array
	public int[] getCols()
	{
		return this.cols;
	}
    
    /*
     * 1.If the remainder from dividing n by 6 is 2 or 3
     * 2.write separate lists of even and odd numbers (i. e. 2, 4, 6, 8 — 1, 3, 5, 7).
     * 3.If the remainder is 2, swap 1 and 3 in odd list and move 5 to the end (i. e. 3, 1, 7, 5).
     * Reference site: https://en.wikipedia.org/wiki/Eight_queens_puzzle 
	 */
    
    public class GameRule 
    {
    	// apply the game rule to output array
		public void makeEightQueen() throws Exception
    	{
    		// if remainder is not 2, exception 
        	if (EightQueensGame.this.numOfCols % 6 != 2)
        	{
        		throw new Exception("the remainder from dividing n by 6 must be 2.");
        	}
        	
        	// divide even number and odd number 
        	int [] evens= new int[EightQueensGame.this.numOfCols/2];
        	int [] odds = new int[EightQueensGame.this.numOfCols/2];
        	
        	for(int i = 1, j = 0, k = 0; i <= EightQueensGame.this.numOfCols; i++)
        	{
        		if(i % 2 == 0) evens[j++] = i;
        		else odds[k++] = i;
        	}
        	// swap index1 and index3 in odd list and move index5 to the end
        	// and input them to columns array
        	
        	EightQueensGame.this.cols[0] = evens[0];
        	EightQueensGame.this.cols[1] = evens[1];
        	EightQueensGame.this.cols[2] = evens[2];
        	EightQueensGame.this.cols[3] = evens[3];
        	EightQueensGame.this.cols[4] = odds[1];
        	EightQueensGame.this.cols[5] = odds[0];
        	EightQueensGame.this.cols[6] = odds[3];        	
        	EightQueensGame.this.cols[7] = odds[2];    		
    	}
    }

    // test the eight queens game
    public static void main(String []args){
    	final int COLSNUMS = 8;
    	
    	try
    	{
	    	EightQueensGame eqg = new EightQueensGame(COLSNUMS);
	    	eqg.applyRule(); // apply the rule
	    	
	    	int [] answerArray = eqg.getCols(); // call the array that applied rule
	    	
	    	// display the row of each column
	        for(int row:answerArray)
	        {
	        	System.out.println(row);
	        }
	        
	        System.out.println("");
	        
	        // draw the answer of game on screen
	        for(int i = 0; i < COLSNUMS; i++)
	        {
	        	int queenCol = answerArray[i];
	        	for(int j = 0; j < COLSNUMS; j++)
	        	{
	        		if(queenCol == j + 1) System.out.print("|Q");
	        		else System.out.print("| ");
	        	}
	            System.out.println("|");            	
	        }    	
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.toString());
    		e.printStackTrace();
    	}
    }
}
