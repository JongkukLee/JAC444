package ca.jay.jac444.week9.sample.algo;

import java.util.*;

/************************************************************************
 *  Compilation:  javac CollegeStudent.java
 *  Execution:    java CollegeStudent
 *
 *  Example of using a Comparator for a collection
 *
 *  Output:
 *  Eric.Marx[GPA=340, id=234]
 *  Cuong.Marx[GPA=340, id=456]
 *  John.Savage[GPA=340, id=876]
 *  Abe.Vu[GPA=345, id=123]
 *  Oscar.Savage[GPA=345, id=987]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 10 Oct 2001
 * @version 1.1, 19 Aug 2017
 ************************************************************************/
public class CollegeStudent extends Student {

    private int GPA;
    private long id;

    public CollegeStudent(String firstName, String lastName, int gPA, long id) {
        super(firstName, lastName);
        GPA = gPA;
        this.id = id;
    }


    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second
     * implements the method int compare(T o1, T o2);
     */
    static final Comparator<CollegeStudent> STUDENT_ORDER = (s1, s2) -> {
        int gpaCmp = s1.GPA - s2.GPA;
        if (gpaCmp != 0)
            return gpaCmp;

        return (int) (s1.id - s2.id);
    };


    public String toString() {
        return super.toString() + "[GPA=" + GPA + ", id=" + id + "]";
    }

    public static void main(String[] args) {
        CollegeStudent[] cs = {new CollegeStudent("Abe", "Vu", 345, 123),
                new CollegeStudent("Eric", "Marx", 340, 234),
                new CollegeStudent("Cuong", "Marx", 340, 456),
                new CollegeStudent("Oscar", "Savage", 345, 987),
                new CollegeStudent("John", "Savage", 340, 876)};

        List<CollegeStudent> list = Arrays.asList(cs);

        //sort collection using a comparator
        Collections.sort(list, STUDENT_ORDER);

        list.forEach(System.out::println);
    }
}

/**
 * A class for a Comparable<Student> type
 */
class Student implements Comparable<Student> {

    public String firstName, lastName;

    public Student(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student n = (Student) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }

    public String toString() {
        return firstName + "." + lastName;
    }

    /**
     * @param n the Student object to be compared
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Student n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }
}




