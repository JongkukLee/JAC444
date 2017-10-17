package ca.jay.jac444.week6.homework_solution;

/************************************************************************
 *  Compilation:  javac ByteTest.java
 *  Execution:    java ByteTest
 *
 *  Answer to Lab 6 - Exercise 1
 *
 *  Output:
 *  ...
 *  125	125
 *  126	126
 *  127	127
 *  128	-128
 *  129	-127
 *  130	-126
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 * @version 1.1, 10 Aug 2017
 ************************************************************************/
public class ByteTest {

    public static void main(String[] args) {

        for (int i = 0; i < 256; i++) {

            //signed byte is [-128, 127] from integer [0, 256]
            byte signedByte = (byte) i;

            //to obtain unsignedByte add 256 to signedByte is signedByte < 0
            int unsignedByte = signedByte >= 0 ? signedByte : 256 + signedByte;

            //print byte values as unsigned and signed
            System.out.println(unsignedByte + "\t" + signedByte);
        }
    }
}
