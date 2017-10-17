package ca.jay.jac444.week6.homework_solution;

import java.io.*;

/************************************************************************
 *  Compilation:  javac TranslateByte.java
 *  Execution:    java TranslateByte string1 string2
 *
 *  Question Lab 6
 *
 *  Output:
 *  WHAT IS THE OUTPUT OF THIS PROGRAM when you run it like this
 *  java TranslateByte a X
 *  then type the text "Java language" on a new line --
 *  and see what you get.
 *  To end type ^D or ^C in windows
 *
 * @author JPH - Jordan Anastasiade
 * @version 1.1, 10 Aug 2017
 ************************************************************************/
class TranslateByte {

    public static void main(String[] args) throws IOException {

        byte from = (byte) args[0].charAt(0);
        byte to = (byte) args[1].charAt(0);
        int b;

        while ((b = System.in.read()) != -1)
            System.out.write(b == from ? to : b);
    }
}
