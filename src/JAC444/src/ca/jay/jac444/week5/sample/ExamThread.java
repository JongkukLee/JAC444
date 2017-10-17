package ca.jay.jac444.week5.sample;

/************************************************************************
 *  Compilation:  javac ExamThread.java
 *  Execution:    java ExamThread
 *
 *  Example of how to create a thread by extending the Thread class
 *  ExamThread has an Exam object
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
/*
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
*/

public class ExamThread extends Thread {
    /**
     * ExamThread has an Exam object
     */
    private Exam exam;
    private static final int LIMIT = 55;

    /**
     * Constructor
     *
     * @param exam an exam object for a student
     */
    ExamThread(Exam exam) {
        this.exam = exam;
    }

    /**
     * the overridden run method inherited from Thread class
     */
    public void run() {
        try {
            //simulate lengthy operation
            Thread.sleep((long) (Math.random() * 1000));

            System.out.print("\nFor student " + exam.name + " result: ");

            if (exam.calculateExamResult() > LIMIT)
                System.out.println("Exam passed!");
            else
                System.out.println("Exam failed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        Exam[] exams = {new Exam("John", 54),
                new Exam("Mary", 56)};

        //run an exam calculations in a separate thread
        for (Exam e : exams)
            new ExamThread(e).start();
    }
}
