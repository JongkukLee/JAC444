package ca.jay.jac444.week11.sample.squarematrix;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/************************************************************************
 *  Compilation:  javac QuerySquareMatrixClient.java
 *  Execution:    java QuerySquareMatrixClient
 *
 *  Example of developing an RMI Client to find out if the matrix
 *  {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}
 *  is magic
 *
 *  Output:
 *  Is the SQUARE MATRIX MAGIC? Answer: true
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/
public class QuerySquareMatrixClient {

    public static void main(String[] args) {
        QuerySquareMatrixClient brc = new QuerySquareMatrixClient();

        int[][] m = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};

        SquareMatrix sm = new SquareMatrix(3, m);

        try {
            QuerySquareMatrix qsm =
                    (QuerySquareMatrix) Naming.lookup("rmi://localhost:1100/QuerySquareMatrixService");
            //invoke the studyMatrix method on remote object
            sm = qsm.studyMatrix(sm);
            //print the result from remote object
            System.out.println("Is the SQUARE MATRIX MAGIC? Answer: " + sm.isMagic);

        } catch (MalformedURLException murle) {
            System.out.println("MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re) {
            System.out.println("RemoteException");
            System.out.println(re);
        } catch (NotBoundException nbe) {
            System.out.println("NotBoundException");
            System.out.println(nbe);
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException");
            System.out.println(ae);
        }
    }
}
