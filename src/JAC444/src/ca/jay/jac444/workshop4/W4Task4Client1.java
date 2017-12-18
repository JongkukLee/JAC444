//package ca.jay.jac444.workshop4;

import java.net.*;  
import java.io.*; 

// cd \myproject\JAC444\src\JAC444\src\ca\jay\jac444\workshop4

public class W4Task4Client1 
{
	public static void main(String args[])throws Exception
	{  
		Socket s=new Socket("localhost",3330);  

		DataInputStream din=new DataInputStream(s.getInputStream());  
	
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";  
		while(!str.equals("stop"))
		{ 
			System.out.print("Write your message to server: "); 
			str=br.readLine();  
			dout.writeUTF(str);  
			dout.flush();  
	
			System.out.println("Waiting message from server...(stop to close connection)  "); 
	
			str2=din.readUTF();  
			System.out.println("Server says: "+str2);  
		}  
	  
		dout.close();  
		s.close();  
	}
}