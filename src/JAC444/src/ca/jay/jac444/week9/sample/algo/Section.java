package ca.jay.jac444.week9.sample.algo;

import java.util.*;
/************************************************************************
 *  Compilation:  javac Section.java
 *  Execution:    java Section
 *
 *  Sorting a collection of Comparable objects
 *
 *  Output:
 *  Cuong.Marx
 *  Eric.Marx
 *  John.Savage
 *  Oscar.Savage
 *  Abe.Vu
 *
 * @author Jordan Anastasiade
 * @version 1.0, 01 Dec 2000
 * @version 1.1, 19 Aug 2017
 ************************************************************************/
public class Section {

    public static void main(String args[]) {

        Student[] studentArray = {
                new Student("John", "Savage"),
                new Student("Eric", "Marx"),
                new Student("Cuong", "Marx"),
                new Student("Oscar", "Savage"),
                new Student("Abe", "Vu")};


        List<Student> list = Arrays.asList(studentArray);

        //sort the collection list of students
        //since Student is a Comparable ojbect
        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
