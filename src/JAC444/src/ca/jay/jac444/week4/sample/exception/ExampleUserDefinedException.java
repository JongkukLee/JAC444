package ca.jay.jac444.week4.sample.exception;

/**
 * Creates a user defined exception called
 * BooleanValueException
 *
 * It inherits from Exception class
 */

class BooleanValueException extends Exception {
    // default constructor
    public BooleanValueException() {
    }
    // constructor with of param of type String
    public BooleanValueException(String msg) {
        super(msg);
    }
}

/************************************************************************
 *  Compilation:  javac ExampleUserDefinedException.java
 *  Execution:    java ExampleUserDefinedException
 *
 *  Explains the exception handler using an
 *  UserDefinedException
 *  (the same structure as ExampleException)
 *
 *  Output:
 *  first statement of the try block from methodTwo
 *  start methodOne
 *  Inside catch block: BooleanValueException: We cannot accept false values
 *  Inside finally block
 *  Done - Out of exception handler: try-catch-finally
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Aug 2017
 ************************************************************************/

public class ExampleUserDefinedException {

    public static void main(String[] args) {
        new ExampleUserDefinedException().methodTwo();
    }

    /**
     * methodOne creates an exception of type
     * BooleanValueException and throws it
     *
     * @param b input boolean value
     * @throws BooleanValueException
     */

    public void methodOne(boolean b) throws BooleanValueException {

        System.out.println("start methodOne");

        if (b == false)
            throw new BooleanValueException("We cannot accept false values");

        System.out.println("end methodOne");
        return;
    }

    /**
     * methodTwo calls methodOne. It must deal with the Exception
     * It implements the exception handler try-catch-finally
     */

    public void methodTwo() {

        boolean val = false;
        try {

            System.out.println("first statement of the try block from methodTwo");
            methodOne(val);
            System.out.println("last statement of the try block from methodTwo");

        } catch (Exception ex) {
            System.out.println("Inside catch block: caught " + ex);
        } finally {
            System.out.println("Inside finally block ");
        }
        System.out.println("Done - Out of exception handler: try-catch-finally");
    }
}
