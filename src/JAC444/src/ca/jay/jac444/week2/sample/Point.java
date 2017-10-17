package ca.jay.jac444.week2.sample;

/**
 * Explains the declaration and use of interface
 *
 * @author Jordan Anastasiade
 * @version 1.0, May 23, 2000
 */

// ** interface declaration */
interface PointInterface {

	int xOrigin = 0;
	int yOrigin = 0;

	void move(int dx, int dy);

	double distance(int toX, int toY);
}

/************************************************************************
 *  Compilation:  Point.java
 *  Execution:    java Point
 *
 *  Example of using an interface - lecture 2
 *
 *  Output:
 *  The distance = 5.0
 *  The distance to origin = 14.142135623730951
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 200-03-24
 ************************************************************************/

public class Point implements PointInterface {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// implementation of move()
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	// implementation of distance
	public double distance(int toX, int toY) {
		double d = 0.0;
		double dx2 = (x - toX) * (x - toX);
		double dy2 = (y - toY) * (y - toY);
		d = Math.sqrt(dx2 + dy2);
		return d;
	}

	public static void main(String[] arr) {

		PointInterface h = new Point(10, 10);
		
		System.out.println(" The distance = " + h.distance(13, 14));
		System.out.println(" The distance to origin = "
				+ h.distance(xOrigin, yOrigin));
	}
}
