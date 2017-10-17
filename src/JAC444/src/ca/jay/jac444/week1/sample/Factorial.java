package ca.jay.jac444.week1.sample;

/************************************************************************
 *  Compilation:  javac Factorial.java
 *  Execution:    java Factorial
 *
 *  The Factorial program explains how
 *  to write recursive method
 *
 *  Output:
 *  interative 3628800
 *  recursive 3628800
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2014-07-18
 *
 ************************************************************************/

public class Factorial {
    /**
     * Calculates factorial of a number using iteration
     * @param n the integer to calculate factorial of n
     * @return the integer value of n!
     */
    public static int iterativeFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    /**
     * Calculates factorial of a number using recursion
     * @param n the integer to calculate factorial of n
     * @return the integer value of n!
     */
    public static int recursiveFactorial(int n) {

        if (n == 0)
            return 1;
        else
            return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("interative " + iterativeFactorial(10));
        System.out.println("recursive " + recursiveFactorial(10));
    }

}
