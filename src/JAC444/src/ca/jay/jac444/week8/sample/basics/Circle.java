package ca.jay.jac444.week8.sample.basics;

/**
 * Functional Interface to calculate
 * circle measurement
 */
@FunctionalInterface
interface CircleMeasurement {
    /**
     *
     * @param radius circle radius
     * @return the value of circle measure
     */
    double value(double radius);
}
/************************************************************************
 *  Compilation:  javac Circle.java
 *  Execution:    java Circle
 *
 *  Example of using lambda as method param
 *  It calculates area, circumference using CircleMeasurement interface
 *
 *  Output
 *  A circle of radius 1.0 has area  3.141592653589793
 *  and circumference 6.283185307179586 radiusSquareRoot 1.0
 *
 * @author Jordan Anastasiade
 * @version 1.0, 14 Aug 2017
 ************************************************************************/
public class Circle {

    /**
     * It calculates area or circumference of a circle
     *
     * @param radius the circle's radius
     * @param cm an object of type CircleMeasurement
     * @return the value of the measurement
     */
    public static double getValue(double radius, CircleMeasurement cm) {
        return cm.value(radius);
    }

    public static void main(String[] args) {

        //lambda expression radius -> Math.PI * radius * radius for circle area as argument
        double area = Circle.getValue(1.0, radius -> Math.PI * radius * radius);
        //lambda expression radius -> Math.PI * radius * radius for circle circumference
        double circumference = Circle.getValue(1.0, raduis -> 2 * Math.PI * raduis);

        System.out.print("A circle of radius " + 1.0);
        System.out.printf(" has area  " + area + " and circumference " + circumference);

        //Because the lambda expression invokes an existing method,
        //you can use the method reference Math::sqrt instead of a lambda expression
        System.out.printf(" radiusSquareRoot " + Circle.getValue(1.0, Math::sqrt));

    }
}
