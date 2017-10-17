package ca.jay.jac444.week6.sample;

import java.io.*;
/************************************************************************
 *  Compilation:  javac EchoFile.java
 *  Execution:    java EchoFile fileName
 *
 *  Explain how to use BufferedReader to read one line at the time
 *  from a file. It uese try-with-resources (Java 7)
 *
 *  Output:
 *  it depends on input; it must print the content of the file argument
 *
 * @author Jordan Anastasiade
 * @version 1.2, 10 Aug 2017
 ************************************************************************/
public class EchoFile {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("EchoFile  fileName ");
            return;
        }
        String line;

        try (BufferedReader in
                     = new BufferedReader(new FileReader(args[0]));) {

            while ((line = in.readLine()) != null)
                System.out.println(line);

        } catch (FileNotFoundException f) {
            System.out.println(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


