package ca.jay.jac444.week6.sample;

import java.io.*;
/************************************************************************
 *  Compilation:  javac BookDeserialize.java
 *  Execution:    java BookDeserialize
 *
 *  Explains how an object could be deserialized by using
 *  ObjectInputStream to readObject method
 *  It uses FileInputStream to read the file fileWithBook.
 *
 *  Output:
 *  Book recovered (deserialized): Book{name='Java Programming', price=100.0}
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 Aug 2017
 ************************************************************************/
public class BookDeserialize {

    public static void main(String args[]) {

        Book bookObject = null;

        try (
        	FileInputStream fis = new FileInputStream("fileWithBook.bin");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            bookObject = (Book) ois.readObject();

        } catch (ClassNotFoundException e) {
            e.getCause();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Book recovered (deserialized): " + bookObject);
    }
}