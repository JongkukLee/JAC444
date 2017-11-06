package ca.jay.jac444.week8.homework_solution;

/**
 * Defines functional interface Exam
 */
@FunctionalInterface
interface Exam {
    /**
     * @param learner a Learner object
     * @return a String as result of the exam
     */
    String getExamResult(Learner learner);
}

//simple class to define a Learner
class Learner {

    public String name;

    public Learner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Learner{" + "name='" + name + "}";
    }
}

/************************************************************************
 *  Compilation:  javac ExamResults.java
 *  Execution:    java ExamResults
 *
 *  Solution Lab 7 exercise 2
 *
 *  Output
 *  Learner{name='John} result  pass
 *
 * @author Jordan Anastasiade
 * @version 1.0, 14 Aug 2017
 ************************************************************************/
public class ExamResults {

    /**
     * It returns the result of the exam result for a learner
     * @param learner lerner object
     * @param exam exam object
     * @return a string as the result of the exam
     */
    public static String result(Learner learner, Exam exam) {
        return exam.getExamResult(learner);
    }

    public static void main(String[] args) {

        Learner l = new Learner("John");
        //the result method takes two arguments a learner and an exam
        String s = ExamResults.result(l, learner -> " pass ");
        System.out.println(l + " result " + s);
    }
}
