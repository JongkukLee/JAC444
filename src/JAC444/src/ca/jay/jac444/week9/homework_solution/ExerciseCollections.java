package ca.jay.jac444.week9.homework_solution;

import java.util.*;
/************************************************************************
 *  Compilation:  javac -d . ExerciseCollections.java
 *  Execution:    java sort.ExerciseCollections
 *
 *  Solution Lab 9 exercise 2
 *
 *  Output
 *  Andorid
 *  Linux
 *  MacOS
 *  Unix
 *  Windows
 *
 * @author Jordan Anastasiade
 * @version 1.0, 18 Aug 2002
 ************************************************************************/

public class ExerciseCollections {

    public static void main(String[] args) {

        List<String> oss = new ArrayList<>();
        oss.add("Windows");
        oss.add("Unix");
        oss.add("MacOS");
        oss.add("Android");
        oss.add("Linux");

        Collections.sort(oss);
        for (String os : oss)
            System.out.println(os);
    }
}
