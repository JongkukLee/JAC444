package ca.jay.jac444.week2.sample;

/************************************************************************
 *  Compilation:  CommandLineArgs.java
 *  Execution:    java CommandLineArgs x y z
 *
 *  Example of using command line args - lecture 2
 *
 *  Output:
 *  x y z
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 1999-01-22
 ************************************************************************/

public class CommandLineArgs {

	public static void main(String[] args) {

		for (String s : args)
			System.out.print(s + " ");
	}

}
