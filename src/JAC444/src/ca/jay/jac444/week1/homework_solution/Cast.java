package ca.jay.jac444.week1.homework_solution;

/************************************************************************
 *  Compilation:  Cast.java
 *  Execution:    java Cast
 *
 *  Explains the danger of using cast operations
 *  Implements a method to display an integer in binary format
 *
 *  Exercises 3 and 4 - Lab 1
 *
 *  Output:
 *  value: 128, binary:
 *  00000000000000000000000010000000
 *  value: -128, binary:
 *  11111111111111111111111110000000
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2001-03-11
 ************************************************************************/
public class Cast {

    /**
     * Displays an integer in binary format
     *
     * @param n the integer to be rendered in binary
     * @return void
     */
    public static void binary(int i) {

        System.out.println("value: " + i + ", binary: ");

        for (int j = 31; j >= 0; j--)
            if (((1 << j) & i) != 0)
                System.out.print("1");
            else
                System.out.print("0");
        System.out.println();
    }

    public static void main(String[] args) {

        short sh = 128;
        binary(sh);
        byte b = (byte) sh;
        binary(b);
    }
}

