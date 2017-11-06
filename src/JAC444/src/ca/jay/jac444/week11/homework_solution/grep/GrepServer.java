package ca.jay.jac444.week11.homework_solution.grep;

/************************************************************************
 *  Compilation:  javac GrepServer.java
 *
 *
 *  Solution Lab 11 exercise 2
 *  RMI Server
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class GrepServer {

    public GrepServer() {
        try {
            Grep g = new GrepImpl();
            java.rmi.Naming.rebind("Wonderful", g);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new GrepServer();
    }
}
