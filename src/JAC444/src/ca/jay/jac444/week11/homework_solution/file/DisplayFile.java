package ca.jay.jac444.week11.homework_solution.file;

/************************************************************************
 *  Compilation:  javac DisplayFile.java
 *
 *
 *  Solution Lab 11 exercise 1
 *  Remote Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/

public interface DisplayFile extends java.rmi.Remote {
    /**
     * Reads a file. Each line is stored in a vector
     * @param fileName the filename
     * @return vector containing the file lines
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public java.util.Vector display(String fileName)
            throws java.rmi.RemoteException, java.io.FileNotFoundException;
}
