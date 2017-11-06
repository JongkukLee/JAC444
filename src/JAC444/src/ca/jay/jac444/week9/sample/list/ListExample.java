package ca.jay.jac444.week9.sample.list;

import java.util.*;

/************************************************************************
 *  Compilation:  javac -d . ListExample.java
 *  Execution:    java list.ListExample
 *
 *  Example of using the List<E> collection
 *
 *  Output:
 *  All strings in the list: [First, Second, Third]
 *  Print list with the old style
 *  First
 *  Second
 *  Third
 *  Print list with the new style
 *  First
 *  Second
 *  Third
 *  Sublist [Second, Third]
 *  After removing all strings with length <= 5 [Second]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 18 Aug 2017
 ************************************************************************/
public class ListExample {

    public static void printListOldStyle(List<String> l) {
        System.out.println("Print list with the old style ");

        //iteration over list using Iterator
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void printListNewStyle(List<String> l) {
        System.out.println("Print list with the new style ");
        //iteration over list using Lambda - Java 8
        l.forEach(System.out::println);
    }

    public static void createSublist(List<String> l) {
        List<String> subList = l.subList(1, l.size());
        System.out.println("Sublist " + subList);
    }

    public static void filterList(List<String> l) {
        //removes all of the elements of this collection that satisfy the given predicate
        l.removeIf(s -> s.length() <= 5);
        System.out.println("After removing all strings with length <= 5 " + l);
    }

    public static void main(String[] args) {

        List<String> strList = new LinkedList<>();
        //adding elements to the end
        strList.add("First");
        strList.add("Second");
        strList.add("Third");

        System.out.println("All strings in the list: " + strList);

        ListExample.printListOldStyle(strList);
        ListExample.printListNewStyle(strList);
        ListExample.createSublist(strList);
        ListExample.filterList(strList);
    }
}
