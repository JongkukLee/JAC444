package ca.jay.jac444.week1.homework_solution;

/************************************************************************
 *  Compilation:  GreatestCommonDivisor.java
 *  Execution:    java GreatestCommonDivisor number1, number2
 *
 *  Calculates the greatest common divisor of two integer using recursion
 *  and the Euclid's algorithm
 *
 *  Exercises 8  Lab 1
 *
 * java GreatestCommonDivisor 625 150

 *  Output:
 *  25
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2003-01-12
 ************************************************************************/
public class GreatestCommonDivisor {

    /**
     * Calculates the greatest common divisor
     *
     * @param a the first number
     * @param b the second number
     * @return integer as gcd of a and b
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Two integers are necessary");
            System.exit(1);
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println(gcd(x, y));
    }
}