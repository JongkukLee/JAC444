package ca.jay.jac444.week1.homework_solution;

/************************************************************************
 *  Compilation:  BitwiseOperation.java
 *  Execution:    java BitwiseOperation
 *
 *  Display two numbers in decimal, binary, octal and hexadecimal
 *  and the result of all the bitwise operations
 *
 *  Exercise 2 - Lab 1
 *
 *  Output
 *  84  1010100  0124  0X54
 *  327  101000111  0507  0X147
 *  68  1000100  0104  0X44
 *  343  101010111  0527  0X157
 *  275  100010011  0423  0X113
 *  -328  11111111111111111111111010111000  037777777270  0Xfffffeb8
 *
 * @author Jordan Anastasiade
 * @version 1.2
 * @since 2000-02-11
 ************************************************************************/
public class BitwiseOperation {

    public static void main(String[] args) {
        int op1 = 84;
        int op2 = 327;

        System.out.println(op1 + "  " +
                Integer.toBinaryString(op1) + "  " +
                "0" + Integer.toOctalString(op1) + "  " +
                "0X" + Integer.toHexString(op1));

        System.out.println(op2 + "  " +
                Integer.toBinaryString(op2) + "  " +
                "0" + Integer.toOctalString(op2) + "  " +
                "0X" + Integer.toHexString(op2));
        int op3 = op1 & op2;
        System.out.println(op3 + "  " +
                Integer.toBinaryString(op3) + "  " +
                "0" + Integer.toOctalString(op3) + "  " +
                "0X" + Integer.toHexString(op3));
        int op4 = op1 | op2;
        System.out.println(op4 + "  " +
                Integer.toBinaryString(op4) + "  " +
                "0" + Integer.toOctalString(op4) + "  " +
                "0X" + Integer.toHexString(op4));
        int op5 = op1 ^ op2;
        System.out.println(op5 + "  " +
                Integer.toBinaryString(op5) + "  " +
                "0" + Integer.toOctalString(op5) + "  " +
                "0X" + Integer.toHexString(op5));

        System.out.println(~op2 + "  " +
                Integer.toBinaryString(~op2) + "  " +
                "0" + Integer.toOctalString(~op2) + "  " +
                "0X" + Integer.toHexString(~op2));

    }
}

