package ca.jay.jac444.week1.sample;

/************************************************************************
 *  Compilation:  JavaArray.java
 *  Execution:    java JavaArray
 *
 *  The JavaArray program explaines how
 *  to create and initialize arraies in java
 *
 *  Output:
 *  0 0 0
 *  1 2 3
 *  10 20 30
 *  1 2
 *  3 4
 *  5 6
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2014-07-18
 *
 ************************************************************************/

public class JavaArray {

    public static void main(String[] args) {

        // array1 initialized with the default values
        int[] array1 = new int[3];

        // array2 initialized in one step
        int[] array2 = {1, 2, 3};

        // array3 initialized in two steps
        int[] array3;
        array3 = new int[]{10, 20, 30};

        // array of array
        int[][] arrOfArray = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < 3; i++)
            System.out.print(" " + array1[i]);
        System.out.println();

        for (int x : array2)
            System.out.print(" " + x);
        System.out.println();

        for (int i = 0; i < array3.length; i++)
            System.out.print(" " + array3[i]);
        System.out.println();

        for (int row = 0; row < arrOfArray.length; row++) {
            for (int col = 0; col < arrOfArray[row].length; col++)
                System.out.print(" " + arrOfArray[row][col]);
            System.out.println();
        }
    }
}