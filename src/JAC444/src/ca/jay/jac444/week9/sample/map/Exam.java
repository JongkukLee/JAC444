package ca.jay.jac444.week9.sample.map;

import java.util.*;

/************************************************************************
 *  Compilation:  javac -d . Exam.java
 *  Execution:    java map.Exam
 *
 *  Example of using the Map<K,V> collection
 *
 *  Output
 *  For Test here are the results:
 *  5.2---> 2
 *  9.8---> 3
 *  3.2---> 1
 *  9.7---> 1
 *
 * @author Jordan Anastasiade
 * @version 1.0, 17 Aug 2017
 ************************************************************************/
public class Exam {

    private String  name;   //exam name
    private Float[] result; //array of float values

    //private constructor
    private Exam(String name, Float[] result) {
        this.name = name;
        this.result = result;
    }

    //factory to build an exam object
    public static Exam takeExam() {
        Float[] fa = {9.8f, 5.2f, 9.7f, 9.8f, 3.2f, 5.2f, 9.8f};
        return new Exam("Test", fa);
    }

    //the most important method to understand how Map<K,V> work
    public void examResults() {

        System.out.println("For " + name + " the results are:");
        //create an empty map m
        Map<Float, Integer> m = new HashMap<>();

        //iterate on key
        for (Float key : result) {
            //retrieve the map value
            Integer val = m.get(key);
            //increase the map value
            Integer newVal = (val == null) ? 1 : val + 1;
            //store the new value in the map
            m.put(key, newVal);
        }

        //Iterate over Map.Entry set and print key and value
        for (Map.Entry<Float, Integer> e : m.entrySet())
            System.out.println(e.getKey() + "---> " + e.getValue());
    }

    public static void main(String[] args) {
        //take an exam and print the results
        Exam e = Exam.takeExam();
        e.examResults();
    }

}





