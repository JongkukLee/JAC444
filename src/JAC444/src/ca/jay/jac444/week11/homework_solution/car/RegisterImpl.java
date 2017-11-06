package ca.jay.jac444.week11.homework_solution.car;

/************************************************************************
 *  Compilation:  javac RegisterImpl.java
 *
 *  Solution Lab 11 exercise 3
 *  The implementation class
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class RegisterImpl
        extends java.rmi.server.UnicastRemoteObject
        implements Register {

    public RegisterImpl() throws java.rmi.RemoteException {
        super();
    }

    /**
     * Car before and after registration
     *
     * @param c the car for registration
     * @return the car after registration
     */
    public Car register(Car c) {

        Integer val = c.hashCode();
        c.getRegistered(val);

        return c;
    }
}
