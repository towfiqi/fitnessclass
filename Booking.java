/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Towfiqul Islam
 */
public class Booking {
    
        private Customer cust = new Customer();
	private FitnessClass fclass = new FitnessClass();

        private String bookingID;
        private String status;
        private String payment;
        //private static HashMap<String,Booking> bookings;
        
	public Booking(Customer newCustomer, FitnessClass theClass, String payMethod) {
		cust.setName(newCustomer.getName());
		fclass.setName(theClass.getName());
                fclass.setTime(theClass.getTime());
		fclass.setRating(theClass.getRating());
                fclass.setCost(theClass.getCost());
                //fclass.addStudent();
                //fclass.setCount(theClass.getCount());
                this.setStatus("booked");
                this.setBookingID( newCustomer.getName() );
                this.setPaymentMethod(payMethod);
                
                
	}
        
        
	public Booking() {
		cust.setName("");
		fclass.setName("");

                this.status = "booked";
                this.payment = "cash";
	}
        
	public void setBookingID(String customerName) {

                int unique_id= (int) ((new Date().getTime() / 1000L) % 100); 
                String customName = customerName.substring(0, Math.min(customerName.length(), 3));
                this.bookingID = customName+unique_id;
	}
       
     
        
        public String getBookingID() {
            return bookingID;
        }
 	
	public Customer getCust() {
		return cust;
	}
        
        public void setStatus(String stat) {
                this.status = stat;
	}
        
        public String getStatus() {
		return status;
	}
        
        public void setPaymentMethod(String payment) {
                this.payment = payment;
	}
        
        public String getPaymentMethod() {
		return payment;
	}

	public FitnessClass getFitnessClass() {
		return fclass;
	}
        

	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		return "-------------------------------------------------------------------\n"
                           + "BOOKING ID: " +bookingID+ "\n" 
                           + "BOOKING Status: " +status+ "\n" 
                           + "CLASS BOOKING FOR: " +fclass.getName()+ ". Rating: (" +fclass.getRating()+ ")\n" 
                           + "CLASS TIME: " +fclass.getTime().format(new Date())+ "\n" 
                           //+ "Students In Class: " +fclass.getStudentCount()+ "\n" 
			   +"Customer Details: " +cust.getName()
			   + "\nTOTAL COST: $" + decimalFormat.format(fclass.getCost())
			   + "\n-------------------------------------------------------------------";
	}
}
