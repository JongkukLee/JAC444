package ca.jay.jac444.week8.sample.intro;

/************************************************************************
 *  Compilation:  javac Summable.java
 *
 *  Summable - Interface with a single abstract method
 *  Summable is a functional interface
 *
 *  @author Jordan Anastasiade
 *  @version 1.0, 12 Aug 2017
 ************************************************************************/

@FunctionalInterface
public interface Summable {

    /**
     * Returns true only if the sum of params is even
     *
     * @param x the integer operand
     * @param y the integer operand
     * @return true if the sum of x and y is an even number
     */
    boolean evenSum(int x, int y);
}