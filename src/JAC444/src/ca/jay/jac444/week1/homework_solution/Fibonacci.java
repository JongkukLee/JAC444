package ca.jay.jac444.week1.homework_solution;

/************************************************************************
 *  Compilation:  Fibonacci.java
 *  Execution:    java Fibonacci
 *
 *  Generates Fibonacci numbers iterativelly
 *  up to a limit defined in the class
 *
 *  Exercises 6 and 7 - Lab 1
 *
 *  Output for the first 10 Fibonacci numbers:
 *
 *  Iterative method
 *  0 1 2 3 5 8 13 21 34 55 89
 *  Recursive method
 *  0 1 2 3 5 8 13 21 34 55 89
 *  Done
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2001-03-11
 ************************************************************************/
public class Fibonacci {

    // define a constant static private integer as a limit
    private static final int LIMIT = 10;


    /**
     * Calculates a Fibonnaci number usint iteration
     *
     * @param n the integer number represents the nth
     *          position in the Fibonnaci sequence
     * @return the nth Fibonnaci number
     */
    public static int fibIterative(int n) {
        if (n == 0 || n == 1)
            return n;

        int x = 0, y = 1;
        for (int k = 2; k <= n; k++) {
            // new y is the sum of previous two terms
            y = x + y;
            // new x is the old y
            x = y - x;
        }
        return y;
    }

    /**
     * Calculates a Fibonnaci number using recursion
     *
     * @param n the integer number represents the nth
     *          position in the Fibonnaci sequence
     * @return the nth Fibonnaci number
     * this method is inefficient - performance bug
     * try to improve it!!!
     */
    public static int fibRecursive(int n) {
        if (n == 0 || n == 1)
            return n;

        int result = fibRecursive(n - 1) + fibRecursive(n - 2);
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Iterative method");
        for (int i = 0; i <= LIMIT; i++)
            System.out.printf("%d ", fibIterative(i));

        System.out.println("\nRecursive method");
        for (int i = 0; i <= LIMIT; i++)
            System.out.printf("%d ", fibIterative(i));

        System.out.println("\nDone");
    }
}
