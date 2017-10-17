package ca.jay.jac444.week6.sample;

import java.io.*;

/************************************************************************
 *  Compilation:  javac CountBytes.java
 *  Execution:    java CountBytes filileName
 *              or
 *                java CountBytes
 *                then by hitting [Enter]
 *                text on a single line
 *                followed by [Ctrl C]
 *  Explain how to use FileInputStream, System.in to read bytes
 *
 *  Output:
 *  it depends on input
 *
 * @author JPL
 * @author Jordan Anastasiade
 * @version 10 Aug 2017
 ************************************************************************/
class CountBytes {

    public static void main(String[] args) throws IOException {

        InputStream in;
        if (args.length == 0)
            in = System.in;
        else
            in = new FileInputStream(args[0]);

        int total = 0;
        while (in.read() != -1)
            total++;

        System.out.println("\n" + total + " bytes ");
    }
}
