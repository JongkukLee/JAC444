package ca.jay.jac444.week11.sample.squarematrix;

/************************************************************************
 *  Compilation:  javac QuerySquareMatrix.java
 *
 *  Example of developing QuerySquareMatrix RMI Interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/

public interface QuerySquareMatrix extends java.rmi.Remote {
    /**
     * Determines if a matrix is magic
     *
     * @param sm a square matrix
     * @return the same object, but with the flag set to true if
     *          the matrix is magic
     * @throws java.rmi.RemoteException
     */
    SquareMatrix studyMatrix(SquareMatrix sm) throws java.rmi.RemoteException;
}