package ca.jay.jac444.week11.homework_solution.car;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.Vector;
import java.io.*;
/************************************************************************
 *  Compilation:  javac RegisterClient.java
 *
 *  Solution Lab 11 exercise 2
 *  RMI Client
 *
 *  ps -aef |grep rmiregistry (if 1099 is taken, kill the process)
 *
 *  Output:
 *  Model: WV Owner: Mine mileage: 3.2 Registration: 0
 *  Model: WV Owner: Mine mileage: 3.2 Registration: 1046017035
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class RegisterClient {

    public static void main(String[] args) {

        Car car = new Car("WV", "Mine", 3.2);
        System.out.println(car);

        try {

            Register r = (Register) Naming.lookup("Wonderful");


            Car registeredCar = r.register(car);

            System.out.println(registeredCar);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
