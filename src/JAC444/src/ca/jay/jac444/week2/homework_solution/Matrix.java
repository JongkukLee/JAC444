package ca.jay.jac444.week2.homework_solution;

/************************************************************************
 *  Compilation:  javac Matrix.java
 *  Execution:    java Matrix 
 *
 *  Defines a matrix in java
 *
 *  Exercises 5  Lab 2
 *
 *  Output:
 *  Matrix = two rows, three columns
 *  matrix[2][3] = {
 *  3, 2, 3,
 *  5, 9, 8,
 *  }
 *
 *  Matrix = one row, four columns
 *  matrix[1][4] = {
 *  0, 1, 2, 3,
 *  }
 *
 *  Matrix = three rows, one column
 *  matrix[3][1] = {
 *  0,
 *  1,
 *  2,
 *  }
 *
 * @author Jordan Anastasiade
 * @version 1.0, 01 March 2017
 ************************************************************************/


public class Matrix {

	//matrix is an array of arrays
	private int nrows;
	private int ncols;
	private int[][] cells;

	//constructor that takes another matrix
	public Matrix(int[][] cells) {
		this.cells = cells;
		this.nrows = cells.length;
		this.ncols = cells[0].length;
	}

	//constructor that defines the number of rows and columns
	public Matrix(int nrows, int ncols) {
		this.nrows = nrows;
		this.ncols = ncols;
		cells = new int[nrows][ncols];
	}

	public String toString() {
		String matrix = "\nmatrix[" + nrows + "][" + ncols + "] = {\n";
		for (int i = 0; i < nrows; i++) {
			for (int j = 0; j < ncols; j++)
				matrix += (" " + cells[i][j] + ",");
			matrix += "\n";
		}
		matrix += "}\n";

		return matrix;
	}

	public static void main(String[] args) {

		int arrayOfArray[][] = {
				{3, 2, 3},
				{5, 9, 8},
		};

		Matrix first = new Matrix(arrayOfArray);
		System.out.println("Matrix = two rows, three columns " + first);

		int[][] another = {
				{0, 1, 2, 3},
		};

		Matrix second = new Matrix(another);
		System.out.print("Matrix = one row, four columns");
		System.out.println(second);

		int[] yetAnother[] = {
				{0},
				{1},
				{2},
		};

		Matrix third = new Matrix(yetAnother);
		System.out.print("Matrix = three rows, one column");
		System.out.println(third);
	}
}