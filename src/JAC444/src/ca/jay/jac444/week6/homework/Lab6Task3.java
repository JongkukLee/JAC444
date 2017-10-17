package ca.jay.jac444.week6.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
 
@SuppressWarnings("serial")
public class Lab6Task3 implements Serializable {
 
  public static void main(String[] args) {

	  
	  
      try (FileOutputStream fis = new FileOutputStream(new File("Exercise_01.txt"));
              ObjectOutputStream oos = new ObjectOutputStream(fis)) {

          for (int i = 0; i < 5; i++) {
        	  oos.writeObject(new Lab6Task2(0.6, 5, 1000));
          }
          oos.flush();

      } catch (IOException e) {
          e.printStackTrace();
      }
      System.out.println("Loan stored!!!");      
  }
}