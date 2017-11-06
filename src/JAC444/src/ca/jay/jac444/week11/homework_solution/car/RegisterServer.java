package ca.jay.jac444.week11.homework_solution.car;

/************************************************************************
 *  Compilation:  javac RegisterServer.java
 *
 *
 *  Solution Lab 11 exercise 3
 *  RMI Server
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class RegisterServer {

    public RegisterServer() {

        try {

            Register r = new RegisterImpl();

            java.rmi.Naming.rebind("Wonderful", r);

        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new RegisterServer();
    }
}
