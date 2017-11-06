package ca.jay.jac444.week11.sample.squarematrix;

/************************************************************************
 *  Compilation:  javac QuerySquareMatrixImpl.java
 *
 *  Example of developing RMI Implementation
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/
public class QuerySquareMatrixImpl extends java.rmi.server.UnicastRemoteObject
        implements QuerySquareMatrix {

    private static final long serialVersionUID = 1L;

    public QuerySquareMatrixImpl() throws java.rmi.RemoteException {
        super();
    }

    /**
     * Determines if a matrix is magic
     *
     * @param sm a square matrix
     * @return the same object, but with the flag set to true if
     *         the matrix is magic
     * @throws java.rmi.RemoteException
     */
    public SquareMatrix studyMatrix(SquareMatrix sm) throws java.rmi.RemoteException {
        boolean magic = false;

        magic = isMagicSquare(sm.matrix);
        sm.setIsMagic(magic);
        return sm;
    }

    /**
     * Implementation details
     * @param arr a square matrix of integers
     * @return true if matrix is magic
     * taken from http://www.vinaysingh.info/magic-square-test/
     */
    private boolean isMagicSquare(int[][] arr) {
        final int n = arr.length;
        final int nSquare = n * n;
        final int M = (n * n * (n * n + 1) / 2) / n;
        int sumOfRow = 0, sumOfColoumns = 0, sumOfPrimaryDiagonal = 0, sumOfSecondaryDiagonal = 0;
        boolean[] flag = new boolean[n * n];
        for (int row = 0; row < n; row++) {
            sumOfRow = 0;
            sumOfColoumns = 0;
            for (int col = 0; col < n; col++) {
                if (arr[row][col] < 1 || arr[row][col] > nSquare) return false;
                if (flag[arr[row][col] - 1] == true) return false;
                flag[arr[row][col] - 1] = true;
                sumOfRow += arr[row][col];
                sumOfColoumns += arr[col][row];
            }
            sumOfPrimaryDiagonal += arr[row][row];
            sumOfSecondaryDiagonal += arr[row][n - row - 1];
            if (sumOfRow != M || sumOfColoumns != M) return false;
        }
        if (sumOfPrimaryDiagonal != M || sumOfSecondaryDiagonal != M) return false;
        return true;
    }
}
