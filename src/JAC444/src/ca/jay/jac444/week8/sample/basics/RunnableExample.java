package ca.jay.jac444.week8.sample.basics;

/************************************************************************
 *  Compilation:  javac RunnableExample.java
 *  Execution:    java RunnableExample
 *
 *  Example of building and running a thread using three styles
 *  1. From an Runnable object
 *  2. From an anonymous Runnable object
 *  3. From a lambda expression
 *
 *  Output
 *  Thread from Runnable r object
 *  Thread from anonymous Runnable
 *  Thread from lambda
 *  Thread using effective final variable
 *
 * @author Jordan Anastasiade
 * @version 1.0, 13 Aug 2017
 ************************************************************************/
public class RunnableExample {

    public static void main(String[] args) {

        /** example 1
         * thread built with a Runnable object r
         */
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread from Runnable r object");
            }
        };
        new Thread(r).start();

        /** example 2
         * thread built with anonymous Runnable object
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread from anonymous Runnable");
            }
        }).start();

        /** example 3
         * thread built with with lambda expression
         */
        new Thread(() -> System.out.println("Thread from lambda")).start();

        /** example 4
         * thread built with with lambda expression and varible capture
         */
        String s = "Thread using effective final variable";
        new Thread(() -> System.out.println(s)).start();
    }
}
