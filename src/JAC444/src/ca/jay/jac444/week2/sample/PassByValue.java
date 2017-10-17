package ca.jay.jac444.week2.sample;

/************************************************************************
 *  Compilation:  PassByValue.java
 *  Execution:    java PassByValue
 *
 *  Example of parameter "pass-by-value" semantics - lecture 2
 *
 *  Output:
 *  k before = 0
 *  k after = 0
 *  i in object before = 10
 *  i in object after = 100
 *
 * @author Jordan Anastasiade
 * @version 1.0
 * @since 2004-10-01
 ************************************************************************/

public class PassByValue {

	public int i = 10;

	public void changeFieldValue(int val) {
		i = val;
	}

    public void someValue(int k) {
        k = i;
    }

	public static void main(String[] a) {

		PassByValue obj = new PassByValue();

		int k = 0;
		System.out.println(" k before = " + k);
		obj.someValue(k);
		System.out.println(" k after = " + k);

		System.out.println(" i in object before = " + obj.i);
		obj.changeFieldValue(100);
		System.out.println(" i in object after = " + obj.i);
	}
}