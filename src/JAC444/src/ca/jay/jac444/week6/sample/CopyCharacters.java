package ca.jay.jac444.week6.sample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/************************************************************************
 *  Compilation:  javac CopyCharacters.java
 *  Execution:    java CopyCharacters sourceFileName destinationFileName
 *
 *  Explain how to use FileReader, FileWriter to copy
 *  characters and try-with-resources (Java 7)
 *
 *  Output:
 *  nothing - check if destinationFile is created
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class CopyCharacters {

    public static void main(String[] args) throws IOException {

        if (args.length < 2) {
            System.out.println("usage: CopyCharacters sourceFile destinationFile");
            return;
        }

		// try-with-resources statement - you do not need finally block
        try (
        	FileReader inputStream = new FileReader(args[0]);
            FileWriter outputStream = new FileWriter(args[1])) {

            int c;
            while ((c = inputStream.read()) != -1)
                outputStream.write(c);

        }
    }
}

