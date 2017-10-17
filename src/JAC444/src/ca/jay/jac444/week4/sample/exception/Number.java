package ca.jay.jac444.week4.sample.exception;
/**
 * Let us suppose that we want to work only 
 * with positive byte values;
 * We develop ByteNegativeException as an
 * user defined exception for negative values
 */

class ByteNegativeException extends Exception {

    public ByteNegativeException(String msg) {
        super(msg);
    }
}

/**
 * Let us suppose that we want to work only 
 * with odd byte values;
 * We develop a ByteEvenException as an
 * user defined exception for even values
 */
class ByteEvenException extends Exception {

    public ByteEvenException(String msg) {
        super(msg);
    }
}


/************************************************************************
 *  Compilation:  javac Number.java
 *  Execution:    java Number -5
 *
 *  Explains how you can define multiple catch clauses
 *  since java 7
 *
 *  Output:
 *  The input value is not correct; either negative or even
 *  negative value
 *
 *  @author Jordan Anastasiade
 *  @version 1.0, 05 Aug 2017
 ************************************************************************/

public class Number {

    public static void main(String[] args) {

        byte value = Byte.parseByte(args[0]);

        try {
            if (value < 0)
                throw new ByteNegativeException("negative value");
            if (value % 2 == 0)
                throw new ByteEvenException("even value");

        } catch (ByteNegativeException | ByteEvenException e) {

            System.out.println("The input value is not correct; either negative or even");
            System.out.println(e.getMessage());
        }
    }
}