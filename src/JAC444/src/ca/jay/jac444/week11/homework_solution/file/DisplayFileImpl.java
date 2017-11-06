package ca.jay.jac444.week11.homework_solution.file;

import java.util.Vector;
import java.io.*;

/************************************************************************
 *  Compilation:  javac DisplayFileImpl.java
 *
 *
 *  Solution Lab 11 exercise 1
 *  The implementation class
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class DisplayFileImpl extends java.rmi.server.UnicastRemoteObject
        implements DisplayFile {

    //default ctr.
    public DisplayFileImpl() throws java.rmi.RemoteException {
        super();
    }

    /**
     * Reads a file. Each line is stored in a vector
     * @param s the file name
     * @return vector containing the file lines
     *         or null if file does not exist
     * @throws java.rmi.RemoteException
     * @throws java.io.FileNotFoundException
     */
    public Vector display(String s) throws java.rmi.RemoteException,
            FileNotFoundException {

        Vector<String> v = new Vector<String>();
        String line = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader(s));

            while ((line = in.readLine()) != null)
                v.add(line);
        } catch (IOException e) {
            System.out.println("IO Exception file:" + s);
            return null;
        }
        return v;
    }
}
