package ca.jay.jac444.week4.sample;

/************************************************************************
 *  Compilation:  LabeledContinue.java
 *  Execution:    java LabeledContinue
 *
 *  The LabeledContinue program explaines how
 *  to use the continue with a label
 *
 *  Output:
 *  Value 4 found at row 0 column 3
 *  1
 *  Done
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2017-07-18
 *
 ************************************************************************/
public class LabeledContinue {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int value = 4;

        outerLoop:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == value) {
                    System.out.println("Value " + value + " found at row " + row + " column " + col);
                    continue outerLoop;
                }
            }
            System.out.println(row);
        }
        System.out.println("Done");
    }
}
