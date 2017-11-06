package ca.jay.jac444.week9.homework_solution;

import java.util.*;
/************************************************************************
 *  Compilation:  javac -d . ExerciseComparator.java
 *  Execution:    java sort.ExerciseComparator
 *
 *  Solution Lab 9 exercise 5
 *  sorting using comparator
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

public class ExerciseComparator {

    public static void main(String[] args) {
        OperatingSystem[] oss = {
                new OperatingSystem("Windows", 8.00f),
                new OperatingSystem("Windows", 7.00f),
                new OperatingSystem("Ubuntu", 12.04f),
                new OperatingSystem("Ubuntu", 14.04f),
                new OperatingSystem("Linux", 6.32f),
                new OperatingSystem("Android", 4.44f),

        };


        /* Lambda expression (os1, os2)-> {...}
         * with the implementation of the method int compare(T o1, T o2)
         * from functional interface Comparator<T>
        */
        Arrays.sort(oss,
            (os1, os2) -> {
                int compName = os1.name.compareTo(os2.name);
                if (compName != 0)
                    return compName;
                else
                    return (int) (os1.version - os2.version);
            });


        for (OperatingSystem os : oss)
            System.out.println(os);
    }
}
