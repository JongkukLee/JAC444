package ca.jay.jac444.week10.sample.net;

import java.net.*;

/************************************************************************
 *  Compilation:  javac Local.java
 *  Execution:    java Local
 *
 *  Example of using java.net.InetAddress
 *
 *  Output:
 *
 *  My name is ...
 *  My address is xxx.xxx.xxx.xxx
 *
 * @author Jordan Anastasiade
 * @version 1.0, 17 Aug 2017
 ************************************************************************/
public class Local {

    public static void main(String[] args) {

        try {

            InetAddress me = InetAddress.getLocalHost();
            System.out.println("My name is " + me.getHostName());
            System.out.println("My address is " + me.getHostAddress());

        } catch (UnknownHostException e) {
            System.err.println("Could not determine local address.");
        }
    }

}
