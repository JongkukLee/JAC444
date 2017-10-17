package ca.jay.jac444.week6.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/************************************************************************
 *  Compilation:  javac CopyBytes.java
 *  Execution:    java CopyBytes sourceFileName destinationFileName
 *
 *  Explain how to use FileInputStream, FileOutputStream to copy
 *  bytes
 *
 *  Output:
 *  nothing - check if destinationFile is created
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class CopyBytes {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("usage: CopyBytes sourceFile destinationFile");
            return;
        }

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(args[0]);
            out = new FileOutputStream(args[1]);
            int c;

            while ((c = in.read()) != -1)
                out.write(c);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
