package ca.jay.jac444.week6.homework;

import java.io.*;
public class Lab6Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			FileOutputStream out = new FileOutputStream("Exercise_01.txt", true);
			for(int i = 1; i <= 100; i++)
			{
				out.write(i);
				out.write(' ');				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		

	}

}
