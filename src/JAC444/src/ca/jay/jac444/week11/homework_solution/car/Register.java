package ca.jay.jac444.week11.homework_solution.car;

/************************************************************************
 *  Compilation:  javac Register.java
 *
 *
 *  Solution Lab 11 exercise 3
 *  Remote Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public interface Register extends java.rmi.Remote {
    /**
     *
     * @param c the car for registration
     * @return the same care with the registration
     * @throws java.rmi.RemoteException
     */
    public Car register(Car c) throws java.rmi.RemoteException;

}
