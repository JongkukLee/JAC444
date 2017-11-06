package ca.jay.jac444.week8.sample.adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//simple class to build collection of objects of type Student
class Student {

    private String name;
    private Character gender;
    private Float gpa;

    public Student(String name, Character gender, Float gpa) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public Float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }
}

/************************************************************************
 *  Compilation:  javac PredicateExample.java
 *  Execution:    java PredicateExample
 *
 *  Example of using java.util.function.Predicate
 *  functional interface for filtering a collection
 *
 *  Output
 *  [Student{name='Wei', gender=M, gpa=3.9},
 *  Student{name='Peter', gender=M, gpa=3.8}]

 * @author Jordan Anastasiade
 * @version 1.0, 15 Aug 2017
 ************************************************************************/

public class PredicateExample {

    List<Student> students = new ArrayList();

    public PredicateExample(List<Student> students) {
        this.students = students;
    }

    /**
     * Define the conditions of a predicate
     *
     * @return lambda expression Predicate
     */

    public Predicate<Student> istMaleSuccessful() {
        return p -> p.getGpa() > 3.5f && p.getGender().equals('M');
    }

    /**
     * Filter a list of objects of type Student
     * (it uses Stream that will be explained later in the course)
     *
     * @param ls        list of students
     * @param predicate lambda expression
     * @return list of students filtered using the predicate
     */

    public List<Student> filterStudents(List<Student> ls, Predicate<Student> predicate) {
        return students.stream().filter(predicate).collect(Collectors.<Student>toList());
    }

    public static void main(String[] args) {
        Student[] sa = {new Student("John", 'M', 3.1f),
                new Student("Wei", 'M', 3.9f),
                new Student("Lo", 'F', 3.8f),
                new Student("Peter", 'M', 3.8f),
        };

        PredicateExample pe = new PredicateExample(Arrays.asList(sa));

        System.out.println(pe.filterStudents(pe.students, pe.istMaleSuccessful()));
    }
}
