package ca.jay.jac444.week6.sample;

import java.io.*;
import java.util.Scanner;

/************************************************************************
 *  Compilation:  javac Scan.java
 *  Execution:    java Scan filileName
 *
 *  Explain how to use Scanner class
 *
 *  Output:
 *  it depends on input
 *
 * @author Jordan Anastasiade
 * @version 1.1, 10 Aug 2017
 ************************************************************************/
public class Scan {

    public static void main(String[] args) throws IOException {

        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(args[0])));

            while (s.hasNext())
                System.out.println(s.next());

        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
