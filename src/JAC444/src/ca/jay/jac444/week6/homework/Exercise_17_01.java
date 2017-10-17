package ca.jay.jac444.week6.homework;

import java.io.*;

public class Exercise_17_01 {
  public static void main(String[] args) {

    try (
      PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Exercise_01.txt"), true));
    ) {
      for (int i = 1; i <= 100; i++) {
        pw.print(i);
        pw.print(' ');        
      }
      pw.print('\n');      
    } 
    catch (FileNotFoundException fnfe) {
      System.out.println("Cannot create the file.");
      fnfe.printStackTrace();
    }
  }
}