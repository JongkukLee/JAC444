package ca.jay.jac444.week10.sample.net;

import java.io.*;
import java.net.*;

/************************************************************************
 *  Compilation:  javac Local.java
 *  Execution:    java Local
 *
 *  Example of using Socket, InputStream,
 *  InputStreamReader, BufferedReader
 *
 *  Output:
 *  IOException : java.net.ConnectException: Connection refused
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Aug 2017
 ************************************************************************/

public class ReadFromSocket {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 80);

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();
            System.out.println(s);

        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }
    }
}

