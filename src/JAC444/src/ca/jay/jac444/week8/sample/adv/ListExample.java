package ca.jay.jac444.week8.sample.adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Define functional interface Transform
 */
@FunctionalInterface
interface Transform {
    String change(String in);
}

/************************************************************************
 *  Compilation:  javac ListExample.java
 *  Execution:    java ListExample
 *
 *  Example of using lambda expression as method argument
 *
 *  Output
 *  [first!, second!, third!, fourth!]
 *  [fixst, second, thixd, fouxth]
 *  [FIRST, SECOND, THIRD, FOURTH]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 15 Aug 2017
 ************************************************************************/

public class ListExample {

    public static List<String> modify(List<String> ls, Transform transform) {

        List<String> result = new ArrayList<>(0);
        for (String s : ls)
            result.add(transform.change(s));
        return result;
    }

    public static void main(String[] args) {
        //create a list of strings
        List<String> listOfStrings = Arrays.asList("first", "second", "third", "fourth");

        //transform them adding an ! at the end
        System.out.println(modify(listOfStrings, s -> s + "!"));

        //transform them by replacing char r with char x
        System.out.println(modify(listOfStrings, s -> s.replace('r', 'x')));

        //transform them to upper case - use method reference
        System.out.println(modify(listOfStrings, String::toUpperCase));

    }
}
