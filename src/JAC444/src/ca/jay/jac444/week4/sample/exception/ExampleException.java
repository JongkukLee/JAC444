package ca.jay.jac444.week4.sample.exception;

/************************************************************************
 *  Compilation:  javac ExampleException.java
 *  Execution:    java ExampleException
 *
 *  Explains the exception handler
 *
 *  Output:
 *  first statement of the try block from methodTwo
 *  start methodOne
 *  Inside catch block: caught java.lang.Exception
 *  Inside finally block
 *  Done - Out of exception handler: try-catch-finally
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Aug 2017
 ************************************************************************/

public class ExampleException {

    public static void main(String[] args) {
        new ExampleException().methodTwo();
    }

    /** methodOne creates an exception
     *  and throws an exception
     *
     * @param b input boolean value
     * @throws Exception
     */

    public void methodOne(boolean b) throws Exception {

        System.out.println("start methodOne");

        if (b == false)
            throw new Exception();

        System.out.println("end methodOne");
        return;
    }

    /** methodTwo calls methodOne. It must deal with the Exception
     *  It implements the exception handler try-catch-finally
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


