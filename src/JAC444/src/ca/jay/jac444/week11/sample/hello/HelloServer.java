package ca.jay.jac444.week11.sample.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/************************************************************************
 *  Compilation:  javac HelloServer.java
 *  Execution:    java HelloServer
 *                rmiregistry &
 *
 *  Example of developing an RMI Server
 *
 *  Output:
 *  HelloServer bound in registry
 *
 * @author Jordan Anastasiade
 * @version 1.0, 2 Sept 2001
 ************************************************************************/
public class HelloServer {

    public static void main(String args[]) {

        try {
            // Create the object of type Hello using implementation
            Hello obj = new HelloImpl();

            // Bind this object instance to the name "HelloServer"
            Naming.rebind("rmi://localhost:1099/HelloServer", obj);
            System.out.println("HelloServer bound in registry");

        } catch (Exception e) {
            System.out.println("HelloServer err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
