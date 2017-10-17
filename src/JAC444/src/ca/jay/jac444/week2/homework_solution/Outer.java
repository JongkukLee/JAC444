package ca.jay.jac444.week2.homework_solution;

/************************************************************************
 *  Compilation:  javac Outer.java
 *  Execution:    java Outer
 *
 *  Explains the use of fields in inner classes
 *  (shadow and private
 *
 *  Exercises 4  Lab 2
 *
 *  Output:
 *  outer.x = 1 inner.x = 30 outer.y = 2
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 Oct 2000
 * @version 1.1, 01 Aug 2017
 ************************************************************************/

public class Outer {

	private int x;
	private int y;

    class Inner {
        // shadow variable
        private int x;
        public Inner(int x) {
            this.x = x;
        }
    }

	private Outer(int x) {
		this.x = x;
	}

	public Outer(int x, int y) {
		this(x);
		this.y = y;
	}

	public static void main(String[] args) {
		Outer outer = new Outer(1, 2);

		Outer.Inner inner = new Outer(10, 20).new Inner(30);
		System.out.println(" outer.x = " + outer.x +
				" inner.x = " + inner.x +
				" outer.y = " + outer.y);
	}
}