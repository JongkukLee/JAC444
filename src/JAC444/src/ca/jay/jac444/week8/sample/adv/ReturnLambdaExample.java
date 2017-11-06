package ca.jay.jac444.week8.sample.adv;

/**
 * Define functional interface Lambda
 */
@FunctionalInterface
interface Lambda {
    /**
     * @param i integer value
     * @return string value
     */
    String apply(Integer i);
}
/************************************************************************
 *  Compilation:  javac ReturnLambdaExample.java
 *  Execution:    java ReturnLambdaExample
 *
 *  Example of a method returning a lambda expression
 *
 *  Output
 *  JAC444
 *
 * @author Jordan Anastasiade
 * @version 1.0, 15 Aug 2017
 ************************************************************************/
public class ReturnLambdaExample
{

    /**
     * @return lambda expression Lambda
     */
    public Lambda getLambda() {
        return i -> "JAC" + i;
    }

    public static void main(String[] args) {

        //invoke getLambda and then use its apply method
        String s = new ReturnLambdaExample().getLambda().apply(444);
        System.out.println(s);
    }
}
