package ca.jay.jac444.workshop4;

import java.net.*;  
import java.io.*;  


// cd myproject\JAC444\src\JAC444\bin\ca\jay\jac444\workshop4



public class W4Task4Server {
	public static void main(String args[])throws Exception{  
		ServerSocket ss=new ServerSocket(3331);  
		System.out.println("Server is listening for the connections... ");
		Socket s=ss.accept();  

		DataInputStream din=new DataInputStream(s.getInputStream());  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";  
		while(!str.equals("stop")){  
			System.out.println("Waiting message from clinet...:");
			str=din.readUTF();  
			System.out.println("client says: "+str);  
			System.out.println("Write message back to client (stop to close connection): ");
	
			str2=br.readLine();  
			dout.writeUTF(str2);  
			dout.flush();  
			}  
		din.close();  
		s.close();  
		ss.close();  
	}	
}


//package ca.jay.jac444.workshop4;

import java.net.*;  
import java.io.*; 

// cd \myproject\JAC444\src\JAC444\src\ca\jay\jac444\workshop4

public class W4Task4Client1 
{
	public static void main(String args[])throws Exception
	{  
		Socket s=new Socket("localhost",3331);  

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
