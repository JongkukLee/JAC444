package ca.jay.jac444.week6.homework;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monthlyRate = 2.5d;
		double loanAmount = 1000.0d;
		int termInMonths = 5;
		

	      double monthlyPayment = 
	    	         (loanAmount*monthlyRate) / 
	    	            (1-Math.pow(1+monthlyRate, -termInMonths));
	      
	      System.out.println(monthlyPayment);
		
	}

}