package ca.jay.jac444.week5.sample;

//Attention at import static statements
import static java.lang.Thread.sleep;
import static java.lang.System.out;
/************************************************************************
 *  Compilation:  javac Deadlock.java
 *  Execution:    java Deadlock
 *
 *  Example of a run for this program that never ends
 *  Liveness Problem: Deadlock - fight for the same resources
 *
 *  Output DEPENDS ON MACHINE THAT RUNS THIS PROGRAM:
 *  It could be that this program never ends
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 May 2000
 * @version 1.1, 09 Aug 2017
 ************************************************************************/
public class Deadlock {

    public static void main(String[] args) {

        //two resources for threads to work with
        final Object r1 = "r1";
        final Object r2 = "r2";


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                out.println("Thread 1: ready");
                synchronized (r1) {
                    out.println("Thread 1: locked resource 1");
                    synchronized (r2) {
                        out.println("Thread 1: locked resource 2");
                        try {
                            sleep((long) 2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                out.println("Thread 1: done");
            }
        });


        //this -> is a lambda expression; we will learn later about it
        //it is another way of implementing anonymous Runnable interface
        Thread t2 = new Thread(() -> {

            out.println("Thread 2: ready");
            synchronized (r2) {
                out.println("Thread 2: locked resource 2");
                synchronized (r1) {
                    out.println("Thread 1: locked resource 1");
                    try {
                        sleep((long) 2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            out.println("Thread 2: done");
        });

        t1.start();
        t2.start();
    }
}



