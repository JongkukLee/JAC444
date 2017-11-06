package ca.jay.jac444.week8.sample.basics;

/**
 * Generic Functional Interface to calculate
 * the result of operation applied to a set of operands
 *
 * @param <T> type of the operands
 */
@FunctionalInterface
interface GenericOperation<T> {
    /**
     * @param operands a set of params of type T
     * @return the result of applying operation to operands
     */
    T operation(T... operands);

}

/************************************************************************
 *  Compilation:  javac OperationExample.java
 *  Execution:    java OperationExample
 *
 *  Example of using a generic functional interface
 *
 *  Output
 *  Addition result: 6
 *
 * @author Jordan Anastasiade
 * @version 1.0, 13 Aug 2017
 ************************************************************************/
public class OperationExample {

    public static void main(String[] args) {

        /**
         * Create an object of type GenericOperation<Integer>
         * using lambda expression operands -> { ... }
         */
        GenericOperation<Integer> sum = operands -> {

            Integer total = 0;
            for (Integer x : operands)
                total += x;
            return total;
        };

        Integer result = sum.operation(1, 2, 3);

        System.out.println("Addition result: " + result);
    }
}
