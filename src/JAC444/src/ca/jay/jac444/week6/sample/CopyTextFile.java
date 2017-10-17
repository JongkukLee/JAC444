package ca.jay.jac444.week6.sample;

import java.io.*;

/************************************************************************
 *  Compilation:  javac CopyTextFile.java
 *  Execution:    java CopyTextFile sourceFileName destinationFileName
 *
 *  Explain how to use FileReader and FileWriter to copy
 *  one char at a time
 *  It uses try-catch-finally
 *
 *  Output:
 *  nothing - check if destinationFile is created
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 ************************************************************************/
public class CopyTextFile {

    public static void main(String[] args) throws IOException {

        if (args.length < 2) {
            System.out.println("usage: Copy source destination ");
            System.exit(0);
        }
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        FileReader in = null;
        FileWriter out = null;
        int c = 0;

        try {
            in = new FileReader(inputFile);
            out = new FileWriter(outputFile);

            while ((c = in.read()) != -1)
                out.write(c);

        } catch (FileNotFoundException e) {
            System.out.println("File: " + args[0] + " does not exist");
            System.exit(0);
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }
}
