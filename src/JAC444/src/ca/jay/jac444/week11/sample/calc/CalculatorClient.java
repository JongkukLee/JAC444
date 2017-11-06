package ca.jay.jac444.week11.sample.calc;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
/************************************************************************
 *  Compilation:  javac CalculatorClient.java
 *  Execution:    java CalculatorClient
 *
 *  Example of developing an RMI Calculator Client
 *
 *  Output:
 *  1
 *  9
 *  18
 *  3
 *
 * @author Jordan Anastasiade
 * @version 1.0, 2 Sept 2001
 ************************************************************************/
public class CalculatorClient {

	public static void main(String[] args) {
		try {
		    //remote reference to Calculator object
			Calculator c = (Calculator) Naming.lookup("CalculatorService");

			//invocation of operations on the RMI Server c.sub(4, 3)
			System.out.println(c.sub(4, 3));
			System.out.println(c.add(4, 5));
			System.out.println(c.mul(3, 6));
			System.out.println(c.div(9, 3));

		} catch (MalformedURLException murle) {
			System.out.println("MalformedURLException");
			System.out.println(murle);
		} catch (RemoteException re) {
			System.out.println("RemoteException");
			System.out.println(re);
		} catch (NotBoundException nbe) {
			System.out.println("NotBoundException");
			System.out.println(nbe);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}
}
