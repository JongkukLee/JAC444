package ca.jay.jac444.week6.homework_solution;

/************************************************************************
 *  Compilation:  javac ByteBinaryValue.java
 *  Execution:    java ByteBinaryValue
 *
 *  Answer to Lab 6 - Exercise 2
 *
 *  Output:
 *  ...
 *  -1 as binary byte    11111111
 *  -1 as binary integer 11111111111111111111111111111111
 *
 * @author Jordan Anastasiade
 * @version 1.0, 15 May 2001
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class ByteBinaryValue {

    public static void main(String[] a) {

        byte minusOneAsByte = -1;
        int minusOneAsInteger = -1;

        System.out.println("-1 as binary byte    " + toBinaryString(minusOneAsByte));
        System.out.println("-1 as binary integer " + Integer.toBinaryString(minusOneAsInteger));
    }

    /**
     * Give the binary representation of a byte
     *
     * @param b byte value
     * @return  a string as a binary representation
     */
    public static String toBinaryString(byte b) {

        StringBuffer sb = new StringBuffer();

        for (int j = 7; j >= 0; j--)
            if (((1 << j) & b) != 0)
                sb.append('1');
            else
                sb.append('0');
        return sb.toString();
    }
}
