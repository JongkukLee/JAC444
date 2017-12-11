/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-12-8
**********************************************/
package ca.jay.jac444.workshop2;

import java.util.Vector;

public interface BusinessRuleIF<T extends Number> {

	public static final String MSG1_TRIANGLE = "the sum of any two sides must be greater than the other side.";
	// check rule
	public void ruleCheck(Vector<T> valList) throws Exception;
}
