package ca.jay.jac444.week10.sample.net;

import java.net.*;
import java.io.*;

/************************************************************************
 *  Compilation:  javac URLReader.java
 *  Execution:    java URLReader http://www.bbc.com/
 *
 *  Example of using java.net.URLReader
 *  a small browser
 *
 *  Output:
 *
 *  <!DOCTYPE html> <html class=" b-pw-1280" lang="en" >
 *      <head> <!-- Barlesque 3.21.26 --> ...
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Aug 2017
 ************************************************************************/

public class URLReader {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("usage: java URLReader urlstring");
            return;
        }

        URL url = new URL(args[0]);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);

        in.close();
    }
}
