package ca.jay.jac444.week11.sample.hello;

import java.rmi.Naming;
import java.io.*;

/************************************************************************
 *  Compilation:  javac HelloClient.java
 *  Execution:    java HelloClient
 *
 *  Example of developing an RMI Client
 *
 *  Output:
 *
 *
 * @author Jordan Anastasiade
 * @version 1.0, 2 Sept 2001
 ************************************************************************/
public class HelloClient {


    /**
     * "obj" is the identifier that we'll use to refer
     * to the remote object that implements the "Hello" interface
     */
    Hello obj = null;

    /**
     * @param i integer time of the day
     * @return the greeting string
     */
    public String action(int i) {
        String response = null;

        try {
            //look up for the Hello object in the registry
            obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");

            //invocation on RMI server
            response = obj.sayHello(i);

        } catch (Exception e) {
            System.out.println("HelloApplet exception: " + e);
        }
        return response;
    }

    public static void main(String[] args) throws IOException {

        HelloClient hc = new HelloClient();

        System.out.println("Enter a number between 1 and 4");
        int n = Integer.parseInt(System.console().readLine());

        while (n != -1) {
            if (n >= 1 && n <= 4) {

                System.out.println(" Server: " + hc.action(n));
                System.out.println("Enter a number between 1 and 4");
                n = Integer.parseInt(System.console().readLine());
            } else {
                System.out.println("Bye !!!");
                break;
            }

        }
    }
}
