package ca.jay.jac444.week3.sample;

import java.util.Arrays;

/**
 *  Example of an inner interface
 */
interface OuterInterface {

    void display();

    interface InnerInterface {
        void move(int x, int y);
    }
}

/**
 * Point is an example of a simple class that implements
 * an inner interface
 *
 * The class has besides ctr and the method move from InnerInterface
 * the classical methods: hashCode, equals, toString
 */

class Point implements OuterInterface.InnerInterface {
    int x, y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}

/************************************************************************
 *  Compilation:  javac Plan.java
 *  Execution:    java Plan
 *
 *  The class is an example of "HAS-A" relationship
 *  class Plan has an array of Points
 *
 *  Output:
 *  [Point [x=0, y=0], Point [x=1, y=1]]
 *  [Point [x=1, y=2], Point [x=11, y=21]]
 *  [Point [x=1, y=0], Point [x=2, y=1]]
 *  The same references !!! true
 *
 * @author Jordan Anastasiade
 * @version 1.0, 02 Dec 2001
 * @version 1.1, 03 Aug 2017
 ************************************************************************/


public class Plan {

	Point[] plan = new Point[] {new Point(0,0), new Point(1,1)};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(plan);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            System.out.print("The same references !!! ");
            return true;
        }
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		if (!Arrays.equals(plan, other.plan))
			return false;
		return true;
	}

	public void forEach() {
		for (Point p : plan)
			p.move(1,0);
	}


	public static void main(String[] a) {

	    // an array of InnerInterface objs
		OuterInterface.InnerInterface[] obj = new Plan().plan;
		System.out.println(Arrays.toString(obj));

		obj[0].move(1,2);
		obj[1].move(10,20);
		System.out.println(Arrays.toString(obj));

		Plan big = new Plan();
		big.forEach();
		System.out.println(Arrays.toString(big.plan));

		System.out.println(big.equals(big));
	}
}
