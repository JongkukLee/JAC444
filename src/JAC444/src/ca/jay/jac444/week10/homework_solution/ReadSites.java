package ca.jay.jac444.week10.homework_solution;

import java.net.*;
import java.io.*;
/************************************************************************
 *  Compilation:  javac ReadSites.java url1 url2 ...
 *  Execution:    java ReadSites
 *
 *  Lab 10 - Exercise 2
 *
 *  URL, InputStream,
 *  InputStreamReader, BufferedReader
 *
 *  Output:
 *  sites content
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Aug 2017
 ************************************************************************/
public class ReadSites {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {

            System.out.println("================== " + args[i] + "=================");

            try {
                URL u = new URL("http://" + args[i]);
                InputStream is = u.openStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String s;

                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (MalformedURLException e) {
                System.err.println(e);
            } catch (IOException e) {
                System.err.println(e);
            }

        }

    }
}

