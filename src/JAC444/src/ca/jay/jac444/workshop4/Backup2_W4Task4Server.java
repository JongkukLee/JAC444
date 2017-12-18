package ca.jay.jac444.workshop4;

import java.net.*;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

import java.io.*;  


// cd myproject\JAC444\src\JAC444\bin\ca\jay\jac444\workshop4



public class W4Task4Server {
	public static void main(String args[])throws Exception{  
		ServerSocket ss=new ServerSocket(3330);  
		System.out.println("Server is listening for the connections... ");
		Socket s=ss.accept();  

		//DataInputStream din=new DataInputStream(s.getInputStream());  
		//DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str="",str2="";  
		//while(!str.equals("stop"))
		while(true)
		{  
			System.out.println("Waiting message from clinet...:");
			
	        Thread t1 = new Thread(new Runnable() {
	        	//Socket ts=s;
	            @Override
	            public void run() 
	            {
	            	
	        		DataInputStream din=null;  
	        		DataOutputStream dout=null;  
	        		BufferedReader br=null;	            	
	            	
	            	try {
	            		String str="",str2="";	            	
		        			            	
		        		din=new DataInputStream(s.getInputStream());  
		        		dout=new DataOutputStream(s.getOutputStream());  
		        		br=new BufferedReader(new InputStreamReader(System.in));	 
		    			str=din.readUTF();  
		    			System.out.println("client says: "+str);  
		    			System.out.println("Write message back to client (stop to close connection): ");
		    	
		    			str2=br.readLine();  
		    			dout.writeUTF(str2);  
		    			dout.flush();
	            	}
	            	catch(Exception e)
	            	{
	            		e.printStackTrace();
	            	}
	            	finally
	            	{
		    			try {
		    				if(din != null) din.close();
		    				if(s != null) s.close();  
		    				if(ss != null) ss.close();								
						} catch (IOException e) {
							e.printStackTrace();
						}  
	            	}
	            }
	        });			
	        t1.start();
		}
	}	
}