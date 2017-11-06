package ca.jay.jac444.week11.homework_solution.grep;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.Vector;
import java.io.*;
/************************************************************************
 *  Compilation:  javac GrepClient.java fileName string
 *
 *  Solution Lab 11 exercise 2
 *  RMI Client
 *
 *  ps -aef |grep rmiregistry (if 1099 is taken, kill the process)
 *
 *  Output:
 *  the lines containing the string
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class GrepClient {

    public static void main(String[] args) {
        if (args.length != 2)
            System.exit(1);

        try {
            Grep g = (Grep)
                    Naming.lookup("Wonderful");

            Vector v = g.find(args[0], args[1]);
            for (int i = 0; i < v.size(); i++)
                System.out.println("line: " + i + ": " + (String) v.get(i));

        } catch (MalformedURLException murle) {
            System.out.println("MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re) {
            System.out.println("RemoteException");
            System.out.println(re);
        } catch (NotBoundException nbe) {
            System.out.println("NotBoundException");
            System.out.println(nbe);
        } catch (FileNotFoundException ae) {
            System.out.println("java.io.FileNotFoundException");
            System.out.println("File Not Found " + args[0]);
        }
    }
}
