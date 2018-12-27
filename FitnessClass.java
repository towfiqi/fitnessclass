/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.text.DateFormat;
import java.util.*;

/**
 *
 * @author Towfiqul Islam
 */
public class FitnessClass {
    private String className;
    private DateFormat time;
    private int count;
    private int cost;
    private Rating rating;
    
    private ArrayList<Customer> students;
    private  ArrayList<Booking> bookings;
    
	public FitnessClass(String name, int cost, DateFormat time ) {
		this.setName(name);
                this.setCost(cost);
                this.setTime(time);
		rating=new Rating();

                this.bookings = new ArrayList<Booking>();
                this.students = new ArrayList<Customer>();
	}
	
	public FitnessClass(){
		this.className = "Unknown";
		this.rating = new Rating();
                this.count = 0;

	}
        
        public void addBooking (Booking boo) {
            //FitnessClass booClass = boo.getFitnessClass();
            Customer booCustomer = boo.getCust();
            this.addStudent(booCustomer);
            bookings.add(boo);
        }
        
        public void removeBooking (Booking boo) {
            //FitnessClass booClass = boo.getFitnessClass();
            Customer booCustomer = boo.getCust();
            this.removeStudent(booCustomer);
            bookings.remove(boo);
        }
        
        public void showAllBookings () {

            for(int i = 0; i < bookings.size(); i ++){
                Booking singleBooking = bookings.get(i);
                System.out.println(singleBooking.toString());

            }
        }
        
                
        public Booking searchBookingsByID (String providedID) {
            
            
            for(Booking bk : bookings) { 
                if(bk.getBookingID().equals(providedID)) { 
                    //found it!
                    return bk;
                }
            }

            return null;
        }
        
	
	public String getName()
	{
		return this.className;
	}
	
	public void setName(String name)
	{
		this.className = name;
	}
                
        public void setTime(DateFormat time) {
                this.time = time;
	}
        
        public DateFormat getTime() {
		return time;
	}
        
        public int getCost()
	{
		return this.cost;
	}
	
	public void setCost(int classCost)
	{
		this.cost = classCost;
	}
        
        public int getStudentCount()
	{   
                int studentCount = 0;
                if(!students.isEmpty() || students !=null){
                    studentCount = students.size();
                }
		return studentCount;
	}
	
	public void addStudent(Customer c)
	{
                students.add(c);

	}
        
        public void removeStudent(Customer c)
	{
		students.remove(c);
	}
	
	public Rating getRating()
	{
		return this.rating;
	}
	
	public void setRating(Rating rate)
	{
		this.rating = rate;
	}
	
	public String toString()
	{
		return this.className+"("+this.time.format(new Date())+")"+"[$"+this.cost+"]"+" ("+this.rating+")";
	}
}
