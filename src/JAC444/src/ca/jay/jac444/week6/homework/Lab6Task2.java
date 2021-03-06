package ca.jay.jac444.week6.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
 
@SuppressWarnings("serial")
public class Lab6Task2 implements Serializable {
 
  double annualInterestRate = 2.5d;
  int termInYears = 1;
  double loanAmount = 1000.0d;
  Date loanDate;
  double monthlyPayment = 0.0d;

  Lab6Task2() {
	  this.loanDate = new Date();
  };
  Lab6Task2(double annualInterestRate, int termInYears, double loanAmount) 
  {
	  this();	  
	  this.annualInterestRate = annualInterestRate;
	  this.termInYears = termInYears;
	  this.loanAmount = loanAmount;
  };  

  public double getAnnualInterestRate()
  {
	  return this.annualInterestRate;
  }

  public int getTermInYears()
  {
	return this.termInYears;  
  }
  
  public double getLoanAmount()
  {
	return this.loanAmount;  
  }

  public void setAnnualInterestRate(double annualInterestRate)
  {
	  this.annualInterestRate = annualInterestRate;
  }

  public void setTermInYears(int termInYears)
  {
	this.termInYears = termInYears;  
  }
  
  public void setLoanAmount(double loanAmount)
  {
	this.loanAmount = loanAmount;  
  }
  
  public double getMonthlyPayment()
  {
      this.annualInterestRate /= 100.0;
      double monthlyRate = this.annualInterestRate / 12.0;
      int termInMonths = this.termInYears * 12;
      this.monthlyPayment = 
         (loanAmount*monthlyRate) / 
            (1-Math.pow(1+monthlyRate, -termInMonths));
    
	return this.monthlyPayment;  
  }  
  public double getTotalPayment()
  {
	  return this.monthlyPayment * this.termInYears * 12;  
  }

  public static void main(String[] args) {
       
      // Scanner is a great class for getting 
      // console input from the user
       
      @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
 
      // Prompt user for details of loan
       
      System.out.print("Enter annual interest rate, for example, 8.25 = ");
      double interestRate = scanner.nextDouble();      
       
      System.out.print("Enter number of years as an integer = ");
      int termInYears = scanner.nextInt();
       
      System.out.print("Enter loan amount, for example, 12000.95 = ");
      int loanAmount = scanner.nextInt();
      
      Lab6Task2 loan = new Lab6Task2(interestRate, termInYears, loanAmount);
      
      // NumberFormat is useful for formatting numbers
      // In our case we'll use it for 
      // formatting currency and percentage values
       
      NumberFormat currencyFormat = 
         NumberFormat.getCurrencyInstance();
//      NumberFormat interestFormat = 
//         NumberFormat.getPercentInstance();
 
      // Display details of the loan
 
//      System.out.println("Loan Amount: "+
//         currencyFormat.format(loanAmount));
//      System.out.println("Loan Term: "+
//         termInYears+" years");
//      System.out.println("Interest Rate: "+
//         interestFormat.format(interestRate));
      System.out.println("The loan was created on " + loan.loanDate);
      System.out.println("Monthly Payment: "+
         currencyFormat.format(loan.getMonthlyPayment()));
      System.out.println("Monthly Payment: "+
    	         currencyFormat.format(loan.getTotalPayment()));  
  }
}