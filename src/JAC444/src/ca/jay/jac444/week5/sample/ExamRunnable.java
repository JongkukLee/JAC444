package ca.jay.jac444.week5.sample;

/************************************************************************
 *  Compilation:  javac ExamRunnable.java
 *  Execution:    java ExamRunnable
 *
 *  Example of how to create a thread by implementing Runnable interface
 *  and extending the Exam class
 *  ExamRunnable is an Exam
 *
 *  Output DEPENDS ON MACHINE THAT RUNS THIS PROGRAM:
 *  For student John result: Exam failed!
 *
 *  For student Mary result: Exam passed!
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 May 2000
 * @version 1.1, 09 Aug 2017
 ************************************************************************/

// simple class that calculates the exam results for a student
class Exam {

    private int mark;
    public String name;

    public Exam(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }

    public int calculateExamResult() {
        //calculate final result
        return mark;
    }
}

public class ExamRunnable extends Exam implements Runnable {

    private static final int LIMIT = 55;

    /**
     * Constructor needed for Exam objec
     * @param name student name
     * @param mark student mark
     */
    public ExamRunnable(String name, int mark) {
        super(name, mark);
    }

    public void run() {
        try {
            //simulate lengthy operation
            Thread.sleep((long) (Math.random() * 1000));

            System.out.print("\nFor student " + name + " result: ");
            if (calculateExamResult() > LIMIT)
                System.out.println("Exam passed!");
            else
                System.out.println("Exam failed!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        //ExamRunnable[] is an array of runnable objects
        ExamRunnable[] exams = {new ExamRunnable("John", 54),
                new ExamRunnable("Mary", 56)};

        //e is a Runnable object using in the Thread constructor
        for (ExamRunnable e : exams)
            new Thread(e).start();

    }
}
