/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.text.DateFormat;
import java.util.Date;

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
	
	public FitnessClass(String name, int cost, DateFormat time ) {
		this.setName(name);
                this.setCost(cost);
                this.setTime(time);
		rating=new Rating();
                this.addStudent();
	}
	
	public FitnessClass(){
		this.className = "Unknown";
		this.rating = new Rating();
                this.count = 0;

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
		return this.count;
	}
	
	public void addStudent()
	{
		this.count = this.count + 1;
	}
        
        public void removeStudent()
	{
		this.count = this.count - 1;
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
