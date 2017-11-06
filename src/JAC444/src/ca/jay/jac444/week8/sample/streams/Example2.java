package ca.jay.jac444.week8.sample.streams;

import java.util.Arrays;
/************************************************************************
 *  Compilation:  javac Example2.java
 *  Execution:    java Example2
 *
 *  Example of using basic Streams operations with an array of integer
 *
 *  Output:
 *  1.0 2.0 3.0 4.0 5.0 true
 *  false
 *  OptionalDouble[3.0]
 *  OptionalInt[5]
 *  OptionalInt[15]
 *  1
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/
public class Example2 {

    public static void main(String[] args) {
        int[] ia = {1, 2, 3, 4, 5};

        //conversion from int to double
        Arrays.stream(ia)
                .asDoubleStream()
                .forEach(e->System.out.print(e + " "));

        //true, if predicate could be verified at least once
        System.out.println(Arrays.stream(ia)
                .anyMatch(i -> i % 2 == 0));

        //true, if predicate cannot be verified for all elements
        System.out.println(Arrays.stream(ia)
                .noneMatch(i -> i % 2 == 0));

        //calculates average
        System.out.println(Arrays.stream(ia).average());

        //determines maximum
        System.out.println(Arrays.stream(ia).max());

        //calculates the sum of elements
        System.out.println(Arrays.stream(ia).reduce((i, j) -> i + j));

        //converts Optional to int
        System.out.println(Arrays.stream(ia).min().getAsInt());
    }
}
