package ca.jay.jac444.week11.sample.calc;

import java.rmi.Naming;
/************************************************************************
 *  Compilation:  javac CalculatorServer.java
 *  Execution:    java CalculatorServer
 *                rmiregistry &
 *  ps -aef | grep registry to kill previous registry running
 *
 *  Example of developing an RMI Calculator Server
 *
 *  Output:
 *  Calculator Server is running
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Sept 2001
 ************************************************************************/

public class CalculatorServer {

	public CalculatorServer() {
		try {
			Calculator c = new CalculatorImpl();
			Naming.rebind("rmi://localhost/CalculatorService", c);
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculatorServer();
		System.out.println("Calculator Server is running");
	}
}
