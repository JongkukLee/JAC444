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

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	// one parameter constructor
	Visit(String name, Date date) throws Exception
	{
		if(name == null) throw new Exception ("Customer name must not be empty.");
		this.customer = new Customer(name);
		this.date = date;
		this.serviceExpense = 0.0d;
		this.productExpense = 0.0d;
	}
	
	// return customer's name
	// call the getName method of Customer
	public String getName()
	{
		return this.customer.getName();
	}
	
	// return service expense
	public double getServiceExpense()
	{
		return this.serviceExpense;
	}
	
	// set service expense
	public void setServiceExpense(double ex)
	{
		double sDiscount = DiscountRate.getServiceDiscountRate(this.customer.getMemberType());
		this.serviceExpense = ex * (1 + sDiscount);
	}	
	
	// return product expense
	public double getProductExpense()
	{
		return this.productExpense;
	}

	// set product expense
	public void setProductExpense(double ex)
	{
		double pDiscount = DiscountRate.getProductDiscountRate(this.customer.getMemberType());
		this.productExpense = ex * (1 + pDiscount);
	}		
	
	// return total expense
	public double getTotalExpense()
	{
		return this.serviceExpense + this.productExpense;
	}
	
	// override toStirng method
    @Override
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
		return sb.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n")
			     .append("+ " + this.customer + "\n")
			     .append("+ Date: " + new SimpleDateFormat("yyyy-MM-dd").format(this.date) + "\n")			     
			     .append("+ Service Expense: $" + String.format("%.2f", this.getServiceExpense())  + "\n")
	     		 .append("+ Product Expense: $" + String.format("%.2f", this.getProductExpense()) + "\n")
	     		 .append("+ Total   Expense: $" + String.format("%.2f", this.getTotalExpense()) + "\n")
				 .append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n")
				 .toString();
	}
}