package ca.jay.jac444.week9.sample.basic;

import java.util.*;

/************************************************************************
 *  Compilation:  javac Filter.java
 *  Execution:    java Filter
 *
 *  Example of using a collection
 *  (it also shows how to filter the collection
 *
 *  Output:
 *  From 4 students
 *  [(John, 55), (Mary, 75), (Wei, 80), (Laura, 69)]
 *  with good gpa : [(Mary, 75), (Wei, 80)]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 18 Aug 2017
 ************************************************************************/

public class Filter {
    //myStudents a collection of type arraylist
    Collection<JuniorStudent> myStudens = new ArrayList<>();

    //constructor
    public Filter() {
        myStudens.add(new JuniorStudent("John", 55));
        myStudens.add(new JuniorStudent("Mary", 75));
        myStudens.add(new JuniorStudent("Wei", 80));
        myStudens.add(new JuniorStudent("Laura", 69));
    }

    /**
     * It filters collection based on condition cond
     *
     * @param collection all students
     */
    public void filter(Collection<JuniorStudent> collection) {

        for (Iterator<JuniorStudent> it = collection.iterator(); it.hasNext(); )
            if (!cond(it.next()))
                it.remove();
    }

    /**
     * Defines the condition
     *
     * @param s student
     * @return true if student fulfills the conditons
     */
    private static boolean cond(JuniorStudent s) {
        return (s.marks < 70) ? false : true;
    }

    //string representation
    public String toString() {
        return "with good gpa : " + myStudens;
    }

    public static void main(String[] args) {
        Filter fs = new Filter();
        System.out.println("From " + fs.myStudens.size() + " students ");
        System.out.println(fs.myStudens);
        fs.filter(fs.myStudens);
        System.out.println(fs);

    }
}

//simple class to define the objects' collection
class JuniorStudent {

    String name;
    int marks;

    public JuniorStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + marks + ")";
    }
}


