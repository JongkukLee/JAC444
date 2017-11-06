package ca.jay.jac444.week11.homework_solution.car;

import java.io.*;
/************************************************************************
 *  Compilation:  javac Car.java
 *
 *
 *  Solution Lab 11 exercise 3
 *  Serializable object to be sent to RMIServer
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class Car implements Serializable {

    private String model;
    private String owner;
    private double mileage;
    private Integer registration;

    public Car(String brand, String name, double k) {
        model = brand;
        owner = name;
        mileage = k;
        registration = 0;
    }

    public String toString() {
        return "Model: " + model + " Owner: " + owner +
                " mileage: " + mileage +
                " Registration: " + registration;
    }

    public void getRegistered(Integer plate) {
        registration = plate;
    }

}
