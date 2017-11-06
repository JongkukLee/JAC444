package ca.jay.jac444.week9.homework_solution;

import java.util.Arrays;

/************************************************************************
 *  Compilation:  javac -d . ExerciseArrays.java
 *  Execution:    java sort.ExerciseArrays
 *
 *  Solution Lab 9 exercise 1
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

public class ExerciseArrays {

    public static void main(String[] args) {

        String[] oss = {"Windows", "Unix", "MacOS", "Andorid", "Linux"};

        Arrays.sort(oss);

        for (String os : oss)
            System.out.println(os);
    }
}
