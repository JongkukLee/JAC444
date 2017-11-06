package ca.jay.jac444.week8.homework_solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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



public class PredicateExercise {

    List<Student> students = new ArrayList();

    public PredicateExercise(List<Student> students) {
        this.students = students;
    }

    /**
     * Define the predicate conditions
     *
     * @return lambda expression Predicate
     */

    public Predicate<Student> findStudent() {
        return p -> p.getGpa() > 3.5f && p.getGender().equals('M') && p.getName().contains("e");
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

        PredicateExercise pe = new PredicateExercise(Arrays.asList(sa));

        System.out.println(pe.filterStudents(pe.students, pe.findStudent()));
    }
}
