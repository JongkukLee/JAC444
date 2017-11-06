package ca.jay.jac444.week8.sample.intro;

/************************************************************************
 *  Compilation:  javac SecondWay.java
 *  Execution:    java SecondWay
 *
 *  Classical example of using an interface by implementing it using
 *  the anonymous class
 *
 *  Output
 *  Is sum even? false
 *
 * @author Jordan Anastasiade
 * @version 1.0, 13 Aug 2017
 ************************************************************************/
public class SecondWay {

    public static void main(String[] args) {

        //anonymous class
        //create the object of type Summable and invoke eventSum on it
        System.out.println("Is sum even? " + new Summable() {
            @Override
            public boolean evenSum(int x, int y) {
                return (x + y) % 2 == 0;
            }
        }.evenSum(1, 2));
    }
}
