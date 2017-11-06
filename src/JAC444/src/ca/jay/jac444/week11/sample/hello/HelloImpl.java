package ca.jay.jac444.week11.sample.hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/************************************************************************
 *  Compilation:  javac HelloImpl.java
 *
 *  Example of developing RMI Implementation
 *
 * @author Jordan Anastasiade
 * @version 1.0, 2 Sept 2001
 ************************************************************************/
public class HelloImpl extends UnicastRemoteObject implements Hello {

    /**
     * Default constructor
     * @throws RemoteException
     */
    public HelloImpl() throws RemoteException {
        super();
    }

    /**
     * Implementation of the interface method - returns the greetings
     *
     * @param time integer to 1..3
     * @return the greeting value
     * @throws RemoteException
     */
    public String sayHello(int time) throws RemoteException {

        switch (time) {
            case 1:
                return "Good morning!";
            case 2:
                return "Good afternoon!";
            case 3:
                return "Good evening!";
            default:
                return "Good day!";
        }
    }

}
