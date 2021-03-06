package ca.jay.jac444.week6.sample;

import java.io.*;
/************************************************************************
 *  Compilation:  javac CopyLines.java
 *  Execution:    java CopyLines sourceFileName destinationFileName
 *
 *  Explain how to use BufferedReader, PrintWriter to copy
 *  one line as a time (a buffer)
 *  and try-with-resources (Java 7)
 *
 *  Output:
 *  nothing - check if destinationFile is created
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class ExtractSubtitle {

    public static void main(String[] args) throws IOException {

        try (
                BufferedReader inputBuffer = new BufferedReader(new FileReader("[DownSub.com]Parent Teacher Conference Part 2.srt"));
                PrintWriter outputBuffer = new PrintWriter(new FileWriter("[DownSub.com]Parent Teacher Conference Part 2.html"));
        ) {
            String line;
            while ((line = inputBuffer.readLine()) != null)
            {
           		if(line.length() > 0 && !java.lang.Character.isDigit(line.charAt(0)))
            		outputBuffer.println(line + "<br />");
            }
            System.out.println("done!!!");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

