package ca.jay.jac444.week10.sample.server;

import java.io.*;

/************************************************************************
 *  Compilation:  javac Car.java
 *
 *  Example of a simple serializable object that can be sent
 *  over the socket

 *
 * @author Jordan Anastasiade
 * @version 1.1, 20 Aug 2017
 ************************************************************************/

public class Car implements Serializable {

    private String model;
    private String owner;
    private double mileage;
    private String registration;

    public Car(String brand, String name, double k) {
        model = brand;
        owner = name;
        mileage = k;
        registration = "unregistered";
    }

    public String toString() {
        return "Model: " + model + " Owner: " + owner +
                " mileage: " + mileage +
                " Registration: " + registration;
    }

    public void getRegistered(String plate) {
        registration = plate;
    }

}

