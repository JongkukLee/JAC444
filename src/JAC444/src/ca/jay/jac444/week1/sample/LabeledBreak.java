package ca.jay.jac444.week1.sample;

/************************************************************************
 *  Compilation:  LabeledBreak.java
 *  Execution:    java LabeledBreak
 *
 *  The LabeledBreak program explaines how
 *  to use the break with a label
 *
 *  Output:
 *  0
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2017-07-18
 *
 ************************************************************************/
public class LabeledBreak {

    public static void main(String[] args) {

        //label for the break instruction
        out:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i > k)
                    break out;
            }
            System.out.println(i);
        }
    }
}
