package ca.jay.jac444.week11.sample.squarematrix;

import java.rmi.Naming;

/************************************************************************
 *  Compilation:  javac QuerySquareMatrixServer.java
 *  Execution:    java QuerySquareMatrixServer
 *                rmiregistry 1100 &
 *  ps -aef | grep registry to kill previous registry running
 *
 *  Example of developing an RMI Server to determine if a matrix is magic
 *
 *  Output:
 *  Query Square Matrix Server is running
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2027
 ************************************************************************/
public class QuerySquareMatrixServer {

    //constructor
    public QuerySquareMatrixServer() {
        try {
            //build the service object qsm
            QuerySquareMatrix qsm = new QuerySquareMatrixImpl();
            //register the object qsm to local registry
            Naming.rebind("rmi://localhost:1100/QuerySquareMatrixService", qsm);
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String[] args) {
        //build object of server type
        new QuerySquareMatrixServer();
        System.out.println("Query Square Matrix Server is running");
    }
}
