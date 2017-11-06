package ca.jay.jac444.week11.sample.squarematrix;

import java.io.Serializable;

/************************************************************************
 *  Compilation:  javac SquareMatrix.java
 *  Execution:    java SquareMatrix
 *
 *  Example of developing an serializable object
 *  Output:
 *  8 1 6
 *  3 5 7
 *  4 9 2
 *  is magic: false
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/


public class SquareMatrix implements Serializable {

    public int[][] matrix;
    public int dim;
    //important flag - set to true only when the matrix is magic
    public boolean isMagic;

    public SquareMatrix(int dimension, int[][] m) {
        dim = dimension;
        matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++)
                matrix[i][j] = m[i][j];
        }
    }

    public String toString() {
        String mstring = "";

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++)
                mstring += " " + matrix[i][j];

            mstring += "\n";
        }
        return "Matrix: \n " + mstring + " is magic: " + isMagic;
    }

    public void setIsMagic(boolean b) {
        isMagic = b;
    }

    public static void main(String[] args) {

        int[][] m = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};

        SquareMatrix sm = new SquareMatrix(3, m);
        System.out.println(sm);
    }
}