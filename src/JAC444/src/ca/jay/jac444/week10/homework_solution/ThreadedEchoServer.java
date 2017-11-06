package ca.jay.jac444.week10.homework_solution;

import java.io.*;
import java.net.*;

/************************************************************************
 *  Compilation:  javac ThreadedEchoServer
 *  Execution:    java ThreadedEchoServer
 *
 *  Lab 10 - Exercise 3
 *
 *  Solution for a multithreaded server
 *  ServerSocket, Socket, InputStream,
 *  InputStreamReader, BufferedReader
 *
 *  Output:
 *
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Aug 2017
 ************************************************************************/

public class ThreadedEchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket s = null;
        try {
            s = new ServerSocket(7777);
            int i = 0;

            for (; ; ) {
                Socket incoming = s.accept();
                System.out.println("Spawning " + i++);
                new ThreadedEchoHandler(incoming, i).start();
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            s.close();
        }
    }
}

class ThreadedEchoHandler extends Thread {
    private Socket incoming;
    private int client;

    public ThreadedEchoHandler(Socket i, int c) {
        incoming = i;
        client = c;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    incoming.getInputStream()));
            PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);

            out.println("Hello! Enter BYE to exit.");

            boolean done = false;
            while (!done) {
                String str = in.readLine();
                if (str == null)
                    done = true;
                else {
                    out.println("Echo (" + client + "): " + str);
                    System.out
                            .println("Received from (" + client + "): " + str);
                    if (str.trim().equals("BYE"))
                        done = true;
                }
            }
            incoming.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

