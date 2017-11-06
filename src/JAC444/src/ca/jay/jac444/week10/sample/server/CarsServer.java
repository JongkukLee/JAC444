package ca.jay.jac444.week10.sample.server;

import java.net.*;
import java.io.*;

/************************************************************************
 *  Compilation:  javac CarsServer.java
 *  Execution:    java CarsServer
 *
 *  Example of a simple client/server application: car registration
 *  SERVER program that uses a stream socket connection to exchange objects
 *
 *  Output:
 *  server > *** this server is going to register the cars ***
 *  listening for a connection...
 *  ....
 *
 * @author unknown
 * @author Jordan Anastasiade
 * @version 1.1, 20 Aug 2017
 ************************************************************************/

public class CarsServer {

    public static void main(String[] args) {

        ServerSocket serverSocket; // TCP socket used for listening

        try {
      /* step 1: create a server socket port number: 8000 */
            serverSocket = new ServerSocket(8000);

      /* setp 2: listen for a connection and create a socket */

            System.out
                    .println("*** this server is going to register the cars ***");
            System.out.println("listening for a connection...");

            Socket socketConnection = serverSocket.accept();

      /* step 3: connect input and output streams to the socket */
            ObjectOutputStream oosToClient = new ObjectOutputStream(
                    socketConnection.getOutputStream());

            ObjectInputStream oisFromClient = new ObjectInputStream(
                    socketConnection.getInputStream());

            System.out.println("I/O streams connected to the socket");

      /* step 4: exchange objects with the client */

            Car car;

            try {

                while (true) { // keep on getting data from the client

                    // read an object from THE client
                    car = (Car) oisFromClient.readObject(); // casting!
                    System.out.println("\n<==== receive an object from the CLIENT:\n " + car);

                    // THE CORE OPERATION ON SERVER: register the car
                    car.getRegistered("Plate: " + car.hashCode());

                    // send the object to THE client
                    oosToClient.writeObject(car);
                    oosToClient.flush();

                    // display the result to the screen of the server
                    System.out.println("\t====> send the object to the CLIENT");

                }
            } catch (ClassNotFoundException cnf) {
                cnf.printStackTrace();
            } catch (EOFException eof) {
                System.out
                        .println("*** The client has terminated connection ***");
            } catch (IOException e) {
                e.printStackTrace();
            }

      /* step 5: close the connection to the client */
            oosToClient.close();
            oisFromClient.close();
            socketConnection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*** the server is going to stop running ***");
    }
}

