package ca.jay.jac444.week11.sample.calc;

/************************************************************************
 *  Compilation:  javac CalculatorImpl.java
 *
 *  Example of developing RMI Implementation
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Sept 2001
 ************************************************************************/
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject
        implements Calculator {

    // Implementations must have an explicit constructor
    // in order to declare the RemoteException exception
    public CalculatorImpl() throws java.rmi.RemoteException {
        super();
    }

    /**
     * arithmetic add operation
     *
     * @param a first operand
     * @param b second operand
     * @return value of adding two numbers
     * @throws java.rmi.RemoteException
     */
    public long add(long a, long b) throws java.rmi.RemoteException {
        return a + b;
    }

    public long sub(long a, long b) throws java.rmi.RemoteException {
        return a - b;
    }

    public long mul(long a, long b) throws java.rmi.RemoteException {
        return a * b;
    }

    public long div(long a, long b) throws java.rmi.RemoteException {
        return a / b;
    }
}
