package ca.jay.jac444.week8.sample.intro;

/************************************************************************
 *  Compilation:  javac ThirdWay.java
 *  Execution:    java ThirdWay
 *
 *  Example of using an interface by defining a lambda expression
 *
 *  Output
 *  Is sum even? false
 *
 * @author Jordan Anastasiade
 * @version 1.0, 13 Aug 2017
 ************************************************************************/
public class ThirdWay {

    public static void main(String[] args) {

        //create an obj of type Summable using a lambda expression:
        //(x, y) -> { return (x + y) % 2 == 0; };
        Summable obj = (x, y) -> { return (x + y) % 2 == 0; };

        System.out.println("Is sum even? " + obj.evenSum(1, 2));
    }
}
