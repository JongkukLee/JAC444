//package ca.jay.jac444.workshop4;

import java.net.*;
import java.io.*;
import java.lang.*;

public class ClientWorker implements Runnable {

	private Socket client;

	public ClientWorker(Socket client){
		this.client = client;
	}

	public void run()
	{
		String line;
		BufferedReader in = null;
		PrintWriter out = null;
		//DataInputStream din = null;
		//DataOutputStream dout = null;
	
		try
		{
    		//din=new DataInputStream(client.getInputStream());  
    		//dout=new DataOutputStream(client.getOutputStream());
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);
			
			//String str=din.readUTF();  
			//System.out.println("client says: "+str);			
		}
		catch (IOException e)
		{
			System.out.println("in or out failed");
			System.exit(-1);
		}
	
		while(true)
		{
			try
			{
				line = in.readLine();
				System.out.println(line);
				out.println(line);			
			}
			catch (IOException e)
			{
				System.out.println("Read failed");
				System.exit(-1);
			}
		}
	}
	public static void main(String args[])throws Exception
	{

	}
}