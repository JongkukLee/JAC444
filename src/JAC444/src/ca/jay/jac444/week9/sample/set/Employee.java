package ca.jay.jac444.week9.sample.set;

import java.util.*;

/************************************************************************
 *  Compilation:  javac -d . Employee.java
 *  Execution:    java set.Employee
 *
 *  Example of using the Set<E> collection
 *  FindDuplicateNames from an Employee array
 *
 *  Output
 *  (Name='John',Id=1)
 *  (Name='Mary',Id=5)
 *  (Name='Gary',Id=3)
 *  (Name='Mary',Id=2)
 *  (Name='John',Id=4)
 *  Duplicate Employee Names: [John, Mary]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 17 Aug 2017
 ************************************************************************/

public class Employee {

    String employeeName;
    Integer employeeId;

    public Employee() {
    }

    public Employee(String employeeName, Integer employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return
                "(Name='" + employeeName + '\'' +
                        ",Id=" + employeeId +
                        ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeName != null ? !employeeName.equals(employee.employeeName) : employee.employeeName != null)
            return false;
        return employeeId != null ? employeeId.equals(employee.employeeId) : employee.employeeId == null;
    }

    @Override
    public int hashCode() {
        int result = employeeName != null ? employeeName.hashCode() : 0;
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        return result;
    }

    public Employee[] readDB() {
        Employee[] ea = {new Employee("John", 1),
                new Employee("Mary", 2),
                new Employee("Gary", 3),
                new Employee("John", 4),
                new Employee("Mary", 5)};

        return ea;
    }

    public void findDuplicateNames() {

        Employee[] e = readDB();

        Set<String> set = new HashSet<>();
        Set<String> duplicateName = new HashSet<>();

        Set<Employee> setEmployee = new HashSet<>();

        //iterate over Employee aray
        for (int i = 0; i < e.length; i++) {
            //build a set of employee
            setEmployee.add(e[i]);

            //add employ's name, if fails add the name to duplicateName set
            if (!set.add(e[i].employeeName))
                duplicateName.add(e[i].employeeName);
        }


        setEmployee.forEach(System.out::println);
        System.out.println("Duplicate Employee Names: " + duplicateName);
    }


    public static void main(String[] args) {
        new Employee().findDuplicateNames();
    }
}
