package ca.jay.jac444.week5.homework_solution;

/************************************************************************
 *  Compilation:  javac SharedResource.java
 *  Execution:    java SharedResource <number of resources>
 *
 * The program uses wait/notify on threads
 * to solve the classical producer consumer problem
 *
 *  Output for SharedResource 3
 *  Producer of Resource generates Resource value number = 1
 *  Consumer of Resource uses Resource value number = 1
 *  Producer of Resource generates Resource value number = 2
 *  Consumer of Resource uses Resource value number = 2
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Jan 2002
 * @version 1.1, 09 Aug 2017
 ************************************************************************/

public class SharedResource {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("usage: java SharedResource <number of resources>");
            System.exit(0);
        }

        //indicates how many integer will be generated and consumed
        int numberOfResources = 1;
        try {
            numberOfResources = Integer.parseInt(args[0]);
            if (numberOfResources < 0) System.exit(-1);
        } catch (NumberFormatException e) {
            System.out.println("Input: [" + args[0] + "] must be an integer number.");
            System.exit(-1);
        }

        //The shared container containing a shared int
        Container container = new Container();

        ProduceResource p = new ProduceResource(container, numberOfResources);
        ConsumeResource c = new ConsumeResource(container, numberOfResources);

        p.start();
        c.start();
    }
}

/**
 * Definition of a Thread class ProduceResource
 */
class ProduceResource extends Thread {

    private Container container;
    private int numberOfResources;

    public ProduceResource(Container c, int n) {
        super("Producer of Resource");
        container = c;
        numberOfResources = n;
    }

    public void run() {
        for (int count = 1; count <= numberOfResources; count++) {
            // sleep for a random interval
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }

            container.setSharedResource(count);
        }

    }
}

/**
 * Definition of a Thread class ConsumeResource
 */
class ConsumeResource extends Thread {

    private Container container;
    private int numberOfResources;

    public ConsumeResource(Container c, int m) {
        super("Consumer of Resource");
        container = c;
        numberOfResources = m;
    }

    public void run() {
        int val;
        do {
            // sleep for a random interval
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
            val = container.getSharedResource();
        } while (val != numberOfResources);

    }
}

/**
 * Definition of a Container
 */
class Container {
    private int sharedInt = 0;
    private boolean writeable = true;  // condition variable

    /**
     * synchronized method for setting the resource:
     * The code in the get method loops until the Producer has produced a new value.
     * Each time through the loop, the get method calls the wait method;
     * The wait method relinquishes the lock held by the Consumer on the Container
     * (thereby allowing the Producer to get the lock and update the Container)
     * and then waits for notification from the Producer.
     */
    public synchronized void setSharedResource(int val) {
        while (!writeable) {  // not the producer's turn
            try {
                System.out.println("Waiting for Consumer...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println(Thread.currentThread().getName() +
                " generates Resource value number = " + val);
        sharedInt = val;
        writeable = false;
        notify();  // tell a waiting thread to become ready
    }

    /**
     * synchronized method for getting the resource:
     * When the Producer puts something in the Container,
     * it notifies the Consumer by calling notifyAll.
     * The Consumer then comes out of the wait state, the loop exits,
     * and the get method returns the value in the Container.
     * The set method works in a similar fashion, waiting for the Consumer thread to consume
     * the current value before allowing the Producer to produce a new one.
     */
    public synchronized int getSharedResource() {
        while (writeable) {   // not the consumer's turn
            try {
                System.out.println("Waiting for Producer...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        writeable = true;
        notify();  // tell a waiting thread to become ready
        System.err.println(Thread.currentThread().getName() +
                " uses Resource value number = " + sharedInt + "\n");
        return sharedInt;
    }
}