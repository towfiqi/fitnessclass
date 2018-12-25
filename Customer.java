/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

/**
 *
 * @author Towfiqul Islam
 */
public class Customer {
    private String customerName;

	public Customer(String name) {
		this.setName(name);
	}
	public Customer()
	{
		this.customerName = "Anonymous";
	}
	
	public String getName()
	{
		return this.customerName;
	}
	
	public void setName(String name)
	{
		this.customerName = name;
	}
	
	public String toString()
	{
		return "Customer Name: " +this.customerName;
	}
}
