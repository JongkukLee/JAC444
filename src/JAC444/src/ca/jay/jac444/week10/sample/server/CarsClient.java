package ca.jay.jac444.week10.sample.server;

import java.net.*;
import java.io.*;

/************************************************************************
 *  Compilation:  javac CarsClient.java
 *  Execution:    java CarsClient
 *
 *  Example of a simple client/server application: car registration
 *  CLIENT program that uses a stream socket connection to exchange objects
 *
 *  Output:
 *  Connected to localhost
 *  I/O streams connected to the socket
 *  ### send this car to the server for registration:
 *  Model: Toyata Corolla Owner: Dawn M mileage: 1000.0 Registration: unregistered
 *
 * @author unknown
 * @author Jordan Anastasiade
 * @version 1.1, 20 Aug 2017
 ************************************************************************/
public class CarsClient {

    public static void main(String[] args) {

        Socket clientSocket;
        try {
      /*
       * step 1: connect to the server IP address/server name: "localhost"
       * port number: 8000
       */

            clientSocket = new Socket(InetAddress.getByName("localhost"), 8000);
            System.out.println("Connected to "
                    + clientSocket.getInetAddress().getHostName());
      /*
       * step 2: connect input and output streams to the socket
       */
            ObjectInputStream oisFromServer = new ObjectInputStream(
                    clientSocket.getInputStream());

            ObjectOutputStream oosToServer = new ObjectOutputStream(
                    clientSocket.getOutputStream());

            System.out.println("I/O streams connected to the socket");

      /*
       * step 3: communicate with the server
       */
            Car[] cars = new Car[3];

            cars[0] = new Car("Toyata Corolla", "Vu C", 1000);
            cars[1] = new Car("Honda Civic", "Edward H", 2000);
            cars[2] = new Car("Volvo S70", "Raymond B", 3000);

            for (int i = 0; i < 3; i++) {

                try {
                    // send an object to the server
                    oosToServer.writeObject(cars[i]);
                    oosToServer.flush();
                    System.out.println("\n---> send this car to the server for registration:\n" + cars[i]);

                    // receive an object from the server
                    cars[i] = (Car) oisFromServer.readObject(); // casting!

                    System.out.println("\t<--- the car returned by the server:\n" + cars[i]);


                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                } catch (ClassNotFoundException cnf) {
                    cnf.printStackTrace();
                } catch (EOFException eof) {
                    System.out.println("The server has terminated connection!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

      /*
       * step 4: close the connection to the server
       */
            System.out.println("\nClient: closing the connection...");
            oosToServer.close();
            oisFromServer.close();
            clientSocket.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("the client is going to stop runing...");
    }
}

