package ca.jay.jac444.week11.homework_solution.file;

/************************************************************************
 *  Compilation:  javac DisplayFileServer.java
 *
 *
 *  Solution Lab 11 exercise 1
 *  RMI Server
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class DisplayFileServer {

    //default ctr
    public DisplayFileServer() {

        try {

            //build the obj of interface type
            DisplayFile df = new DisplayFileImpl();
            //bind it to registry
            java.rmi.Naming.rebind("FileRMIServer", df);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        //start the server
        new DisplayFileServer();
    }
}
