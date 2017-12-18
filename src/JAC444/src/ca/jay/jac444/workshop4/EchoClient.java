//package ca.jay.jac444.workshop4;

import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) throws Exception
	{
		InetAddress addr = InetAddress.getLocalHost();
		String hostName = addr.getHostName();
		int portNumber = Integer.parseInt(args[0]);
		try (
		
			Socket echoSocket = new Socket(hostName, portNumber);
			
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			BufferedReader stdIn = 
					new BufferedReader(new InputStreamReader(System.in));
			
		)
	
		{
			String userInput;
			
			while((userInput = stdIn.readLine()) != null)
			{
				out.println(userInput);
				System.out.println("echo1: " + in.readLine());
				System.out.println("echo2: " + in.readLine());			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
				
		}
	}
}
