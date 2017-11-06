package ca.jay.jac444.week11.sample.calc;

/************************************************************************
 *  Compilation:  javac Calculator.java
 *
 *  Example of developing RMI Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Sept 2001
 ************************************************************************/

public interface Calculator
        extends java.rmi.Remote {
    /**
     * arithmetic add operation
     *
     * @param a first operand
     * @param b second operand
     * @return value of adding two numbers
     * @throws java.rmi.RemoteException
     */
    public long add(long a, long b)
            throws java.rmi.RemoteException;

    public long sub(long a, long b)
            throws java.rmi.RemoteException;

    public long mul(long a, long b)
            throws java.rmi.RemoteException;

    public long div(long a, long b)
            throws java.rmi.RemoteException;
}
