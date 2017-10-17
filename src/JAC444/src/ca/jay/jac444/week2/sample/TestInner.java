package ca.jay.jac444.week2.sample;

/************************************************************************
 *  Compilation:  TestInner.java
 *  Execution:    java TestInner
 *
 *  Example of using inner class - lecture 2
 *
 *  Output:
 *  Tin outer: 10 20
 *  in outer j = 30
 *  in inner: 10 20
 *  in inner j = 30
 *  in inner: 10 20
 *  in inner j = 30
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2005-03-24
 ************************************************************************/

// outer class
class X {

	private int i = 10;
	private int j = 30;

    // this.new Y().i is i from inner class
	public void printI() {
		System.out.println("in outer: " + i + " " + this.new Y().i);
	}
    public void printJ() {
        System.out.println("in outer j = " + j);
    }


    // inner class
	public class Y {

	    // i declaration shadows the declaration of the enclosing scope
		private int i = 20;

		// X.this.i is i from outer class
		public void printI() {
			System.out.println("in inner: " + X.this.i + " " + i);
		}
        public void printJ() {
            System.out.println("in inner j = " + j);
        }
	}
}

// another outer class
class X1 {

    // inner class Y1 of X1 that extends the inner class Y of outer class X
	class Y1 extends X.Y {
		Y1(X x) {
			x.super();
		}
	}
}

public class TestInner {

	public static void main(String[] arg) {

		X outerObj = new X();
        outerObj.printI();
        outerObj.printJ();

        // how to build an obj of inner when you have an object of outer
		X.Y innerObj = outerObj.new Y();
        innerObj.printI();
        innerObj.printJ();

        // how to build an obj of inner directly
		new X().new Y().printI();
        new X().new Y().printJ();
	}
}