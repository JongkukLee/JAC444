package ca.jay.jac444.week5.homework_solution;

/************************************************************************
 *  Compilation:  javac BankCredit.java
 *  Execution:    java BankCredit
 *
 *  Example of how to create a bank account used by two threads
 *
 *  Output - IT DEPENDS ON MACHINE YOU ARE RUNNING this program
 *
 *  John  wants access
 *  Chan  wants access
 *  John  opening creditAccount().
 *  Chan  opening creditAccount().
 *  John  about to deposit 10 canadian dollars.
 *  Account balance is now: 10
 *  Chan  about to deposit 10 canadian dollars.
 *  John  opening creditAccount().
 *  Account balance is now: 20
 *  John  about to deposit 10 canadian dollars.
 *  Chan  opening creditAccount().
 *  Account balance is now: 30
 *  Chan  about to deposit 10 canadian dollars.
 *  John  is done.
 *  Account balance is now: 40
 *  Chan  is done.
 *
 * @author - Java course lab solution
 * @version 1.0, 09 Aug 2017
 ************************************************************************/


public class BankCredit implements Runnable {

    private int balance;

    // BankCredit constructor
    public BankCredit(int balance) {
        this.balance = balance;
    }

    // Implement run() method of Runnable to execute a new thread
    public void run() {

        // Get current active thread
        Thread activeThread = Thread.currentThread();
        System.out.println(activeThread.getName() + " wants access ");

        for (int i = 0; i < 2; i++) {
            creditAccount(10);
        }

        System.out.println(activeThread.getName() + " is done.");
    }

    // Credit account
    public void creditAccount(int credit) {
        Thread activeThread = Thread.currentThread();
        System.out.println(activeThread.getName() + " opening creditAccount().");


        synchronized (this) {
            // Move balance to an int and then update from int so its non-atomic
            int temp = balance;
            System.out.println(activeThread.getName() + " about to deposit "
                    + credit + " canadian dollars.");
            balance = temp + credit;
        }

        System.out.println("Account balance is now: " + balance);
    }

    public static void main(String[] args) {

        // Create a Runnable object
        BankCredit tbc = new BankCredit(0);

        // Create two threads which share the same bank credit
        Thread th1 = new Thread(tbc, "John ");
        Thread th2 = new Thread(tbc, "Chan ");

        // Power up the threads via the start() method
        th1.start();
        th2.start();
    }
}