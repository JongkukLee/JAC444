/**********************************************
 Course:JAC444 - 4
 Last Name: Lee
 First Name: Jongkuk
 ID: 127730158
 Section: SCC
 This assignment represents my own work in accordance with
 Seneca Academic Policy.
 Signature JK Lee
 Date: 2017-10-15
**********************************************/
package ca.jay.jac444.assignment1;

public class DiscountRate {

	private static final double serviceDiscountPremium = 0.2d;
	private static final double serviceDiscountGold = 0.15d;
	private static final double serviceDiscountSilver = 0.1d;
	private static final double productDiscountPremium = 0.1d;
	private static final double productDiscountGold = 0.1d;
	private static final double productDiscountSilver = 0.1d;	

	// return discount rate for service
	public static double getServiceDiscountRate(String type)
	{
		if(Customer.PREMIUM.equals(type)) return serviceDiscountPremium;
		else if(Customer.GOLD.equals(type)) return serviceDiscountGold;
		else if(Customer.SILVER.equals(type)) return serviceDiscountSilver;
		else return 0.0d;
	}
	
	// return discount rate for product
	public static double getProductDiscountRate(String type)
	{
		if(Customer.PREMIUM.equals(type)) return productDiscountPremium;
		else if(Customer.GOLD.equals(type)) return productDiscountGold;
		else if(Customer.SILVER.equals(type)) return productDiscountSilver;
		else return 0.0d;
	}
}
