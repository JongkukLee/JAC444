package ca.jay.jac444.week6.sample;

import java.io.*;
/************************************************************************
 *  Compilation:  javac BookSerialize.java
 *  Execution:    java BookSerialize
 *
 *  Explains how an object could be serialized by using
 *  ObjectOutputStream and writeObject method
 *
 *  Output:
 *  Book saved (serialized): Book{name='Java Programming', price=100.0}
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 Aug 2017
 ************************************************************************/
public class BookSerialize {

    public static void main(String args[]) {

        Book myBook = new Book("Java Programming", 100.00f);

        try (FileOutputStream fis = new FileOutputStream("fileWithBook.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fis)) {

            oos.writeObject(myBook);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Book saved (serialized): " + myBook);
    }
}

