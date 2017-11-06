package ca.jay.jac444.week9.homework_solution;

import java.util.Arrays;
/************************************************************************
 *  Compilation:  javac -d . ExerciseComparable.java
 *  Execution:    java sort.ExerciseComparable
 *
 *  Solution Lab 9 exercise 4
 *  sorting comparable objects - OperatingSystem
 *
 *  Output:
 *  OperatingSystem [name=Android, version=4.44]
 *  OperatingSystem [name=Linux, version=6.32]
 *  OperatingSystem [name=Ubuntu, version=12.04]
 *  OperatingSystem [name=Ubuntu, version=14.04]
 *  OperatingSystem [name=Windows, version=7.0]
 *  OperatingSystem [name=Windows, version=8.0]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 18 Aug 2017
 ************************************************************************/

public class ExerciseComparable {

    public static void main(String[] args) {
        OperatingSystem[] oss = {
                new OperatingSystem("Windows", 8.00f),
                new OperatingSystem("Windows", 7.00f),
                new OperatingSystem("Ubuntu", 12.04f),
                new OperatingSystem("Ubuntu", 14.04f),
                new OperatingSystem("Linux", 6.32f),
                new OperatingSystem("Android", 4.44f),

        };
        Arrays.sort(oss);
        for (OperatingSystem os : oss)
            System.out.println(os);
    }
}
