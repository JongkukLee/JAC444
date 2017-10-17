package ca.jay.jac444.week3.sample;

/************************************************************************
 *  Compilation:  javac CollegeStudent.java
 *  Execution:    java CollegeStudent
 *
 *  Explains inheritance and polymorphism
 *
 *  Output:
 *  CollegeStudent
 *
 * @author Jordan Anastasiade
 * @version 1.0, 03 Aug 2017
 ************************************************************************/

// supper class
class Student {

    public void whatAreYou() {
        System.out.println("Student");
    }
}

// subclass
public class CollegeStudent extends Student {

    // overrides the whatAreYou method from Student (superclass)
    public void whatAreYou() {
        System.out.println("CollegeStudent");
    }

    public static void main(String[] args) {
        Student s = new CollegeStudent();
        // in method invocation what it counts
        // is the object type NOT reference type
        s.whatAreYou();
    }
}