package ca.jay.jac444.week10.sample.server;

import java.io.*;
import java.net.*;
/************************************************************************
 *  Compilation:  javac EchoServer.java
 *  Execution:    java EchoServer
 *
 *  Example of a simple server application: Echo
 *  SERVER program sends back the string received with Echo in front of it
 *
 *  As a client use Telnet running on localhost at port 7777
 *
 *  Output:
 *  EchoServer started.
 *
 * @author Jordan Anastasiade
 * @version 1.0, 04 Feb 2000
 * @version 1.1, 20 Aug 2017
 ************************************************************************/
class EchoServer {

    public static void main(String[] args) {

        System.out.println("EchoServer started.");

        try {
            ServerSocket s = new ServerSocket(7777);
            Socket clientSocket = s.accept();

            System.out.println("Connected to: " + clientSocket.getInetAddress()
                    + " at port: " + clientSocket.getLocalPort());

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(
                    clientSocket.getOutputStream()));

            out.println("Hello! This is Java EchoServer. Enter BYE to exit.");
            out.flush();

            for (; ; ) {
                String str = in.readLine();

                if (str == null) {
                    break;
                } else {
                    // write (send) back to the client whatever was received
                    // with Echo string in front of it
                    out.println("Echo: " + str);
                    out.flush();
                    System.out.println("Received from Client: " + str);

                    if (str.trim().equals("BYE"))
                        break;
                }
            }

            clientSocket.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("EchoServer stopped.");
    }
}

