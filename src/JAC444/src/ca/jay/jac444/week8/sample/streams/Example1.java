package ca.jay.jac444.week8.sample.streams;

import java.util.Arrays;
/************************************************************************
 *  Compilation:  javac Example1.java
 *  Execution:    java Example1
 *
 *  Example of using basic Streams with an array of integer
 *
 *  Output:
 *  12345 1 2 3 4 5
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/
public class Example1 {

    public static void main(String[] args) {

        int[] ia = {1, 2, 3, 4, 5};
        int sum = 0;

        //imperative style
        for (int i : ia)
            sum += i;

        //declarative style using streams
        sum = Arrays.stream(ia).sum();

        //use of a method reference instead of lambda
        Arrays.stream(ia).forEach(System.out::print);
        Arrays.stream(ia).forEach(x -> System.out.print(" " + x));
    }
}
