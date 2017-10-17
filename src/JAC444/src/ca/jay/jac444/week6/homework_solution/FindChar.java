package ca.jay.jac444.week6.homework_solution;

import java.io.*;
/************************************************************************
 *  Compilation:  javac FindChar.java
 *  Execution:    java FindChar char filileName
 *  exmaple       java FindChar I FindChar.java
 *
 *  Problem Lab 6 exercise 4
 *  Search for the first occurrence of <char> in the <file>
 *
 *  Output:
 *  It depends on input
 *
 * @author JPL
 * @author Jordan Anastasiade
 * @version 1.1, 12 Aug 2017
 ************************************************************************/
class FindChar {

    public static void main(String[] args) throws IOException {

        if (args.length != 2)
            throw new IllegalArgumentException("need char and file");

        int match = args[0].charAt(0);
        FileReader fileIn = new FileReader(args[1]);

        LineNumberReader in = new LineNumberReader(fileIn);

        int ch;
        while ((ch = in.read()) != -1) {
            if (ch == match) {
                System.out.println("'" + (char) ch + "' at line "
                        + in.getLineNumber());
                return;
            }
        }
        System.out.println((char) ch + " not found ");
    }
}
