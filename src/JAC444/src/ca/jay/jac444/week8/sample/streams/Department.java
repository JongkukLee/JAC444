package ca.jay.jac444.week8.sample.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/************************************************************************
 *  Compilation:  javac Department.java
 *  Execution:    java Department
 *
 *  Example of using Streams with Employee array
 *
 *  Output:
 *  Salary of full time employees: 145000
 *  Department salary : 185000.0
 *  Employee by type
 *  {FULLTIME=[[John, FULLTIME 30000], [Cong, FULLTIME 55000], ...
 *  [John, FULLTIME, 30000]
 *  [Cong, FULLTIME, 55000]
 *  [Ali, PARTIME, 40000]
 *  [Mary, FULLTIME, 60000]
 *  [20%, 37%, 27%, 41%]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 24 Aug 2017
 ************************************************************************/
public class Department {

    private enum Type {
        FULLTIME, PARTIME
    };

    public static final class Employee {

        private final String empName;
        private final Type empType;
        private final Integer empSalary;

        public Employee(String empName, Type empType, Integer empSalary) {
            this.empName = empName;
            this.empType = empType;
            this.empSalary = empSalary;
        }

        public Type getEmpType() {
            return empType;
        }

        public Integer getEmpSalary() {
            return empSalary;
        }

        @Override
        public String toString() {
            return String.format("[%s, %s, %d]", empName, empType, empSalary);
        }
    }


    public static void main(String[] args) {

        final Collection<Employee> department = Arrays.asList(
                new Employee("John", Type.FULLTIME, 30000),
                new Employee("Cong", Type.FULLTIME, 55000),
                new Employee("Ali", Type.PARTIME, 40000),
                new Employee("Mary", Type.FULLTIME, 60000)
        );

        // Calculate total salary of all fulltime employees using sum()
        final long fulltimeSalary = department
                .stream()
                .filter(e -> (e.getEmpType() == Department.Type.FULLTIME))
                .mapToInt(Employee::getEmpSalary)
                .sum();

        System.out.println("Salary of full time employees: " + fulltimeSalary);

        // Calculate department salary
        final double departmentSalary = department
                .parallelStream()
                .map(employee -> employee.getEmpSalary())
                .reduce(0, Integer::sum);

        System.out.println("Department salary : " + departmentSalary);

        // Group employee by type
        final Map<Type, List<Employee>> m = department
                .stream()
                .collect(Collectors.groupingBy(Employee::getEmpType));

        System.out.println("Employee by type\n" + m);

        /// Calculate the salary's weight of each employee (as percent of total salary)
        final Collection<String> percentage = department
                .stream()                                           // Stream<String>
                .mapToInt(Employee::getEmpSalary)                   // IntStream
                .asLongStream()                                     // LongStream
                .mapToDouble(s -> (double) s/fulltimeSalary)        // DoubleStream
                .boxed()                                            // Stream<Double>
                .mapToLong( weight -> (long)(weight * 100))         // LongStream
                .mapToObj( p -> p + "%" )                           // Stream<String>
                .collect( Collectors.toList() );                    // List<String>

                department.forEach(System.out::println);
                System.out.println(percentage);
    }
}

