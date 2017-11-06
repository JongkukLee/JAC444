package ca.jay.jac444.week11.homework_solution.grep;

/************************************************************************
 *  Compilation:  javac Grep.java
 *
 *
 *  Solution Lab 11 exercise 2
 *  Remote Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public interface Grep extends java.rmi.Remote {
    /**
     *
     * @param file text file
     * @param s string to look for in the file
     * @return the lines where the string was found
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public java.util.Vector find(String file, String s)
            throws java.rmi.RemoteException, java.io.FileNotFoundException;
}
