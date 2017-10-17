package ca.jay.jac444.week3.sample;

/************************************************************************
 *  Compilation:  javac CollegeStudent.java
 *  Execution:    java CollegeStudent
 *
 *  Explains implicit casting (upcasting)
 *  Within a class, a field that has the same name
 *  as a field in the superclass hides the superclass's field
 *
 *  Output:
 *  b.show: Extended
 *  e.show: Extended
 *  b.s: Base
 *  e.s: Extended
 *
 * @author Jordan Anastasiade
 * @version 1.0, 02 Dec 2001
 ************************************************************************/

class Base {

    public String s = "Base";

    public String show() {
        return s;
    }
}

public class Extended extends Base {

    public String s = "Extended";

    public String show() {
        return s;
    }

    public static void main(String[] x) {
        Extended e = new Extended();
        Base b = e; //implicit casting (upcasting)

        System.out.println("b.show: " + b.show());
        System.out.println("e.show: " + e.show());

        // for field access what it counts is
        // the reference type not the object type
        System.out.println("b.s: " + b.s);
        System.out.println("e.s: " + e.s);
    }
}














	
  	
