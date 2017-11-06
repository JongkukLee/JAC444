package ca.jay.jac444.week8.sample.intro;

/************************************************************************
 *  Compilation:  javac FirstWay.java
 *  Execution:    java FirstWay
 *
 *  Classical example of using an interface by developing a class
 *  that implements it.
 *
 *  Output
 *  Is sum even? false
 *
 * @author Jordan Anastasiade
 * @version 1.1, 12 Aug 2017
 ************************************************************************/
public class FirstWay implements Summable{

    /**
     * The implementation of evenSum
     * defined in Summable interface
     *
     * @param x the integer operand
     * @param y the integer operand
     * @return true if the sum of x and y is an even number
     */
    @Override
    public boolean evenSum(int x, int y) {
        return (x + y) % 2 == 0;
    }

    public static void main(String[] args) {

        //create the obj of type Summable
        Summable obj = new FirstWay();
        //invoke method eventSum and print the result
        System.out.println("Is sum even? " + obj.evenSum(1, 2));
    }
}
