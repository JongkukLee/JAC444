package ca.jay.jac444.week4.homework_solution;

/************************************************************************
 *  Compilation:  javac Pair.java
 *  Execution:    java Pair
 *
 *  Exercise 2 Homework 4
 *
 *  Output:
 *  (1, Test)
 *  (Test, 1)
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Sept 2012
 ************************************************************************/
public class Pair<F, S> {

	private F first;
	private S second;

    /**
     * Constructor of Pair obj
     *
     * @param f object of type F
     * @param s object of type S
     */
	public Pair(F f, S s) {
		first = f;
		second = s;
	}

    /**
     * Print the Pair object
     *
     * @return string of Pair representation
     */

	public String toString() {
		return "("+ first + ", " + second + ")";
	}

    /**
     * Flips the Pair obj elements
     * for example the pair (a, b) becomes (b, a)
     *
     * @param p object of type Pair
     * @return an object of type Pair with its
     *         components flipped
     */
	public static <F, S> Pair<S, F> flip(Pair <F, S> p) { //<-- what is <F, S>
		Pair<S, F> flipped = new Pair<S, F>(p.second, p.first);
		return flipped;
	}

    /**
     * Entry point
     * @param args array of Strings
     */
	public static void main(String[] args) {
		Pair<Integer, String> p = new Pair<>(1, "Test");
		System.out.println(p);
		System.out.println(Pair.flip(p));
	}
}