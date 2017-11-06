package ca.jay.jac444.week11.homework_solution.grep;

import java.util.Vector;
import java.io.*;

/************************************************************************
 *  Compilation:  javac GrepImpl.java
 *
 *
 *  Solution Lab 11 exercise 2
 *  The implementation class
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class GrepImpl
        extends java.rmi.server.UnicastRemoteObject
        implements Grep {

    public GrepImpl()
            throws java.rmi.RemoteException {
        super();
    }

    public Vector find(String file, String found)
            throws java.rmi.RemoteException, FileNotFoundException {

        Vector<String> v = new Vector<String>();
        String line = null;
        try {
            BufferedReader in
                    = new BufferedReader(new FileReader(file));

            while ((line = in.readLine()) != null) {
                if (line.indexOf(found) != -1)
                    v.add(line);
            }
        } catch (IOException e) {
            System.out.println("IO Exception file:" + file);
            return null;
        }
        return v;
    }

}
