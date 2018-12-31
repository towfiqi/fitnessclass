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
    private int cost;
    private Rating rating;
    private ArrayList<Booking> bookings;
    
	public FitnessClass(String name, int cost, DateFormat time ) {
		this.setName(name);
                this.setCost(cost);
                this.setTime(time);
		rating=new Rating();

                this.bookings = new ArrayList<Booking>();

	}
	
	public FitnessClass(){
		this.className = "Unknown";
		this.rating = new Rating();

	}
        
        public void addBooking (Booking boo) {
            
            bookings.add(boo);
        }
        
        public void removeBooking (Booking boo) {

            bookings.remove(boo);
        }
        
        public void showAllBookings () {
            System.out.println("====================ALL BOOKINGS=================");
            for(int i = 0; i < bookings.size(); i ++){
                Booking singleBooking = bookings.get(i);
                System.out.println(singleBooking.toString());

            }
            System.out.println("====================ALL BOOKINGS END===============");
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
        
	public int getIncome()
	{
		return  this.bookings.size() * this.cost;
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
                if(!this.bookings.isEmpty() || this.bookings !=null){
                    studentCount = this.bookings.size();
                }
            
		return studentCount;
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
		return this.className+"("+this.time.format(new Date())+")"+"[$"+this.cost+"]"+" ("+this.rating+")"+"Students: ("+bookings.size()+"/20)";
	}
}
