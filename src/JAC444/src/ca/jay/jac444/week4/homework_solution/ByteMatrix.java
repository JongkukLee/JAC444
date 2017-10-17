package ca.jay.jac444.week4.homework_solution;

import java.util.Arrays;

/************************************************************************
 *  Compilation:  javac ByteMatrix.java
 *  Execution:    java ByteMatrix
 *
 *  Exercise 1 Homework 4
 *  Develop a class that represents a matrix of bytes
 *
 *  Output:
 *  (1, Test)
 *  (Test, 1)
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Sept 2017
 ************************************************************************/

public class ByteMatrix {

    private byte[][] values; //matrix values
    private int nrows, ncols; //number of rows and number of columns


    /**
     * Constructor takes the matrix dimensions
     *
     * @param nrows  number of rows
     * @param ncols  number of columns
     */
    public ByteMatrix(int nrows, int ncols) {
        this.nrows = nrows;
        this.ncols = ncols;
        values = new byte[nrows][ncols];
    }

    /**
     * Copy constructor
     *
     * @param source a ByteMatrix
     */
    public ByteMatrix(ByteMatrix source) {
        values = source.values;
        nrows = source.nrows;
        ncols = source.ncols;
    }

    /**
     * Constructs a matrix from an array of array
     *
     * @param b an array of array of bytes
     */
    public ByteMatrix(byte[][] b) {
        values = b;
        nrows = b.length;
        ncols = b[0].length;
    }


    /**
     * Adds the given matrix to the current one
     *
     * @param second
     * @return a matrix
     * @throws IllegalMatrixDimensionException
     */
    public ByteMatrix add(ByteMatrix second) throws IllegalMatrixDimensionException {
        if (second.ncols != ncols || second.nrows != nrows)
            throw new IllegalMatrixDimensionException("Different dimensions or values");

        ByteMatrix result = new ByteMatrix(nrows, ncols);
        for (int i = 0; i < nrows; i++)
            for (int j = 0; j < nrows; j++)
                // check if result.values is a byte; if not throw an exception
                result.values[i][j] = (byte)(second.values[i][j] + values[i][j]);

        return result;
    }


    /**
     * Gets the value of this matrix at row r and column c
     *
     * @param r row value
     * @param c column value
     * @return the matrix element at row r and column c
     * @throws OutOfRangeMatrixIndexException
     */
    public byte val(int r, int c) throws OutOfRangeMatrixIndexException {
        //lab work
        return 0;
    }

    //set the element value val at row r and column c

    /**
     * Sets the element value val at row r and column c
     *
     * @param val byte value to be assigned to matrix element
     *            at row r and column c
     * @param r   row
     * @param c   column
     * @throws OutOfRangeMatrixIndexException
     */
    public void setElement(byte val, int r, int c) throws OutOfRangeMatrixIndexException {
        //lab work
    }

    /**
     * Compares two matrices
     *
     * @param o object of type Object
     * @return boolean value - true if matrices are equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ByteMatrix that = (ByteMatrix) o;

        if (nrows != that.nrows) return false;
        if (ncols != that.ncols) return false;
        return Arrays.deepEquals(values, that.values);
    }

    /**
     * Calculates the hashcode value
     *
     * @return int the hash value
     */
    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(values);
        result = 31 * result + nrows;
        result = 31 * result + ncols;
        return result;
    }

    /**
     * Prints the matrix
     *
     * @return a string representation of matrix
     */

    @Override
    public String toString() {
        return "Matrix {" +
                "values=" + Arrays.toString(values) +
                ", nrows=" + nrows +
                ", ncols=" + ncols +
                '}';
    }

    //returns

    /**
     * Calculates the maximum vaule of a matrix
     *
     * @return the maximum value of this matrix
     */
    public byte max() {//lab work
        return 0;
    }

    /**
     * Class entry point
     * @param args
     */
    public static void main(String[] args) {
        //lab work - test your class
    }
}

/**
 *  IllegalMatrixDimensionException exception
 */

class IllegalMatrixDimensionException extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public IllegalMatrixDimensionException() {
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public IllegalMatrixDimensionException(String message) {
        super(message);
    }
}

/**
 *  OutOfRangeMatrixIndexException exception
 */

class OutOfRangeMatrixIndexException extends Exception {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public OutOfRangeMatrixIndexException() {
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public OutOfRangeMatrixIndexException(String message) {
        super(message);
    }
}
