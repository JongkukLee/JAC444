package ca.jay.jac444.week2.homework_solution;

/************************************************************************
 *  Compilation:  Student.java
 *  Execution:    java Student
 *
 *  Explains basics in creating a simple class
 *
 *  Exercises 1  Lab 2
 *
 *  Output:
 *  name= 'John', id= 1934, gpa= 3.2
 *
 * @author Jordan Anastasiade
 * @version @version 1.0, 1 Aug 2017
 ************************************************************************/
public class Student {

    private String name;
    private int id;
    private float gpa;

    // default constructor
    public Student() {
    }

    // ctr with one param
    public Student(String name) {
        this.name = name;
    }

    // ctr with two params - "this" is ref to current obj
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // ctr with three params - "this(...)" invokes the ctr with two params
    // this() must be the first line in a ctr - cannot be used anywhere else
    public Student(String name, int id, float gpa) {
        this(name, id);
        this.gpa = gpa;
    }

    // getter for gpa field
    public float getGpa() {
        return gpa;
    }

    // setter for gpa field
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // method to print the object of type student - its state
    public void printStudent() {
        System.out.println(
                "name= '" + name + '\'' +
                ", id= " + id +
                ", gpa= " + gpa);
    }

    // main method to create an object and invoke method on it
    public static void main(String[] args) {
        Student john = new Student("John", 1934, 2.8f);
        john.setGpa(3.2f);
        john.printStudent();
    }
}
