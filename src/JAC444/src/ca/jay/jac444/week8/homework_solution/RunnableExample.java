package ca.jay.jac444.week8.homework_solution;

/************************************************************************
 *  Compilation:  javac RunnableExample.java
 *  Execution:    java RunnableExample
 *
 *  Solution Lab 7 exercise 1
 *
 *  Output
 *  Thread from Runnable r object
 *  Thread from anonymous Runnable
 *  Thread from lambda
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
                for (int i = 0; i < 2; i++)
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
                for (int i = 0; i < 2; i++)
                    System.out.println("Thread from anonymous Runnable");
            }
        }).start();

        /** example 3
         * thread built with with lambda expression
         */
        new Thread(() -> {
            for (int i = 0; i < 2; i++)
                System.out.println("Thread from lambda");
        }).start();

        String s = "Thread using effective final variable";
        new Thread(() -> System.out.println(s)).start();

    }
}
