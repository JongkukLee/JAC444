package ca.jay.jac444.week11.sample.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;
/************************************************************************
 *  Compilation:  javac Hello.java
 *
 *  Example of developing RMI Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 2 Sept 2001
 ************************************************************************/

public interface Hello extends Remote {
    /**
     * Return the greetings
     * @param timeOfDay integer to 1..4
     * @return the greeting value
     * @throws RemoteException
     */
    String sayHello(int timeOfDay) throws RemoteException;
}
