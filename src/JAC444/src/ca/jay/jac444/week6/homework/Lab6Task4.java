package ca.jay.jac444.week6.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab6Task4 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
		Lab6Task2 loan = null;
    	double totalAmount = 0.0d;  
        try (
        	FileInputStream fis = new FileInputStream(new File("Exercise_01.txt"));
        	ObjectInputStream ois = new ObjectInputStream(fis);
            ) 
        {
      	
        	while ((loan = (Lab6Task2) ois.readObject()) != null)
        	{
                System.out.println(loan.loanDate + " monthly payment is " + loan.getMonthlyPayment());
                System.out.println(loan.loanDate + " total payment is " + loan.getTotalPayment());                
        		totalAmount += loan.getTotalPayment();
        	}
            System.out.println("Total Amount: " + totalAmount);
        } catch (EOFException ex) {

            System.out.println("Total loan amount = " + totalAmount);
        }

		
	}
	
}
