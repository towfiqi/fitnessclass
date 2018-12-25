/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.util.Scanner;
import java.text.SimpleDateFormat;

/**
 *
 * @author Towfiqul Islam
 */
public class AttendClass {
    private Scanner input = new Scanner(System.in);
    private Booking foundBooking;
    private FitnessClass foundClass;
    static Rating rating;
    
    //ENTERING AND VALIDATING CUSTOMER DETAILS
	private Booking bookingIDInput() {
		String bookingID = "";
		
		//Ensures an ID is entered.
		do{
			System.out.println("Enter your Booking ID: ");
			bookingID = input.nextLine();
		}
		while(bookingID.isEmpty());
                
                foundBooking = Booking.searchBookingsByID(bookingID);
                
                if(foundBooking == null || foundBooking.getBookingID().isEmpty()){
                    do{
                            System.out.println("Invalid ID. Enter correct Booking ID: ");
                            bookingID = input.nextLine();
                    }
                    while(foundBooking == null || foundBooking.getBookingID().isEmpty());
                }else{
                    foundClass = foundBooking.getFitnessClass();
                }


		return foundBooking;
	}
        
        //SELECTING THE CLASS
	private double ratingInput() {
		double classRating = 0;
		
		//Ensures a Name is entered.
		do{
			System.out.println("Please choose a number from 1-5 to Rate the Class: \n");
                        System.out.println("1. Very Dissatisfied \n");
                        System.out.println("2. Dissatisfied  \n");
                        System.out.println("3. Ok \n");
                        System.out.println("4. Satisfied \n");
                        System.out.println("5. Very Satisfied \n");
			classRating = input.nextInt();
		}
		while(classRating  == 0 ||classRating > 5);
		//foundClass.setRating(classRating);

		
		return classRating;
	}
        
        //SELECTING THE CLASS
	private String reviewInput() {
		String classReview = "";
		
		//Ensures a Name is entered.
		do{
			System.out.println("Please write a short review for the Class: \n");

			classReview = input.nextLine();
		}
		while(classReview.isEmpty());
		//foundClass.setRating(classRating);

		
		return classReview;
	}
        
        //Attend Class Method
	 public  Booking attendClass(Booking foundBooking, double newRating, String newReview) {


		foundBooking.setStatus("changed");
                
                return foundBooking;
	}

        
        public AttendClass(){
            
            
            System.out.println(attendClass(bookingIDInput(), ratingInput(), reviewInput()));
        
        }
}
