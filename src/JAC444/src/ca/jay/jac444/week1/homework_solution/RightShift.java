package ca.jay.jac444.week1.homework_solution;

/************************************************************************
 *  Compilation:  RightShift.java
 *  Execution:    java RightShift
 *
 *  Explains the differences between two right shift operators in Java
 *
 *  Exercises 1 - Lab 1
 *
 *  Output:
 *  -1 >>> 1
 *  -1 >> -1
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2002-08-24
 ************************************************************************/

public class RightShift {

	public static void main(String[] args) {
		int i = -1;
		System.out.print(i + " >>> ");
		i >>>= 63;
		System.out.println(i);

		int j = -1;
		System.out.print(j + " >> ");
		j >>= 63;
		System.out.println(j);
	}
}

