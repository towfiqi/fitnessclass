/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Towfiqul Islam
 */
public class ClassController {
    private String[] menuItems = new String[6];
    private Scanner input = new Scanner(System.in);
    public static ArrayList<FitnessClass> fitnessClasses;
    public FitnessClass ffitnessClass;
    private String[] paymentMethods = new String[2];
    static Customer customer = new Customer();
        

        
        //============================================//
        //----------------USER INPUTS------------------//
        //============================================//
        
        //MAIN SELECTION INPUT
        public void menuSelection(){
                System.out.println("Please select an action:");
                menuItems[0] = "Book Class";
                menuItems[1] = "Change Class";
                menuItems[2] = "Attend Class";
                menuItems[3] = "Monthly Class Report";
                menuItems[4] = "Monthly Champion Report";
                menuItems[5] = "Quit App";
                
                for(int count = 0; count < 6; count++){
			System.out.println((count + 1) + ". " + menuItems[count]);
		}
		
		int selection = input.nextInt();
	
                switch (selection) {
                    case 1:
                        System.out.println(bookClass(customerDetailsInput(), classSelection(), paymentSelection() ));
                        menuSelection();
     
                        break;
                    case 2:
                        System.out.println(changeClass(getBookidID(), classSelection() ));
                        menuSelection();
                        break;

                    case 3:
                        System.out.println( attendClass(getBookidID(), ratingInput(), reviewInput() ) );
                        menuSelection();
                        
                        break;
                    case 4:
                        System.out.println( generateReport( monthInput() ) );
                        menuSelection();
                        
                        break;
                    case 5:
                        System.out.println( generateChampion( monthInput() ));
                        menuSelection();
                        
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid number entered.");
                        menuSelection();
                        break;
                }
        
        }
        
        //ENTERING AND VALIDATING CUSTOMER DETAILS
	private Customer customerDetailsInput() {
		String custName = "";
		
		//Ensures a Name is entered.
		do{
			System.out.println("Enter your Name: ");
                        input.nextLine(); //workaround: Prevents above line from appearing twice
			custName = input.nextLine();
		}
		while(custName.isEmpty());
		customer.setName(custName);

		
		return customer;
	}
        
        //SELECTING THE CLASS
	private FitnessClass classSelection() {	
                System.out.println("Which Class would you like to join?");
                
                for(int i = 0; i < fitnessClasses.size(); i ++){
                    
                    try {
                        DateFormat classDate = fitnessClasses.get(i).getTime();
                        String fdate = classDate.format(new Date());
                        Date date = classDate.parse(fdate);
                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

                        
                        if( formatter.parse(fdate).after(new Date()) ){
                            System.out.println((i + 1) + ". " + fitnessClasses.get(i));
                        }

                    } catch (ParseException ex) {
                        Logger.getLogger(ClassController.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println((i + 1) + ". " + fitnessClasses.get(i));
                    }

                }
                
		int selection = input.nextInt();
                
		if(selection > fitnessClasses.size() || selection <= 0 )
		{
			System.out.println("Invalid number entered.");
			return classSelection();
		}
		selection -= 1;
		return fitnessClasses.get(selection);
		
	}
        
        //Get BookingID
	private Booking getBookidID() {
		String bookingID = "";
                Booking foundBooking = null;
		
		//Ensures a Booking ID is entered.
		do{
			System.out.println("Enter your Booking ID: ");
			bookingID = input.nextLine();
		}
		while(bookingID.isEmpty());
                
                //Find Booking
                for(int i = 0; i < fitnessClasses.size(); i ++){
                    FitnessClass singleClass = fitnessClasses.get(i);
                    Booking gotBooking = singleClass.searchBookingsByID(bookingID);

                    if( gotBooking instanceof Booking){
                        ffitnessClass = fitnessClasses.get(i);
                        return foundBooking = gotBooking;
                    }
                }
                
                //If Booking Not Found
                do{
                        System.out.println("Invalid Booking ID: ");
			bookingID = input.nextLine();
                }
                while(foundBooking == null );
		
                
		return foundBooking;
	}
        
        //SELECTING THE PAYMENT METHOD
        private String paymentSelection() {	
		System.out.println("Please Select a Payment Method:");
                paymentMethods[0] = "Cash";
                paymentMethods[1] = "Card";
                
                for(int count = 0; count < 2; count++){
			System.out.println((count + 1) + ". " + paymentMethods[count]);
		}
		
		int selection = input.nextInt();
		
	
		if(selection > 2 || selection <= 0)
		{
			System.out.println("Invalid number entered.");
			return paymentSelection();
		}
		selection -= 1;
		return paymentMethods[selection];
		
	} 
        
        //RATING THE CLASS
	private int ratingInput() {
		int classRating = 0;
		
		//Ensures a Name is entered.
		do{
			System.out.println("Please choose a number from 1-5 to Rate the Class: \n");
                        System.out.println("1. Very Dissatisfied");
                        System.out.println("2. Dissatisfied");
                        System.out.println("3. Ok");
                        System.out.println("4. Satisfied");
                        System.out.println("5. Very Satisfied");
			classRating = input.nextInt();
		}
		while(classRating  == 0 ||classRating > 5);
		//foundClass.setRating(classRating);

		
		return classRating;
	}
        
        //GETTING USER REVIEW
	private String reviewInput() {
		String classReview = "";
		
		//Ensures a Name is entered.
		do{
			System.out.println("Please write a short review for the Class: \n");
                        input.nextLine(); //workaround: Prevents above line from appearing twice
			classReview = input.nextLine();
		}
		while(classReview.isEmpty());
		//foundClass.setRating(classRating);

		
		return classReview;
	}
        
        //SELECTING THE MONTH
	private int monthInput() {
		int selectedMonth = 0;
		
		//Ensures a Name is entered.
		do{
			System.out.println("Please Select a month: \n");
                        System.out.println("1. January, 2018");
                        System.out.println("2. February, 2018");
                        System.out.println("3. March, 2018");
                        System.out.println("4. April, 2018");
                        System.out.println("5. May, 2018");
                        System.out.println("6. June, 2018");
                        System.out.println("7. July, 2018");
                        System.out.println("8. August, 2018");
                        System.out.println("9. Spetember, 2018");
                        System.out.println("10. October, 2018");
                        System.out.println("11. November, 2018");
                        System.out.println("12. December, 2018(Available)");
                        System.out.println("13. January, 2019(Available)");
                        System.out.println("14. February, 2019(Available)");
			selectedMonth = input.nextInt();
		}
		while(selectedMonth  <= 0 ||selectedMonth > 14);
		//foundClass.setRating(classRating);

		
		return selectedMonth;
	}
        
        
        //============================================//
        //-----------------FUNCTIONS------------------//
        //============================================//
        
	//Booking
	 public  Booking bookClass(Customer aCustomer, FitnessClass aClass, String payMethod) {
		 Booking booking = new Booking(aCustomer, aClass, payMethod);
		 int maxStudent=20;

		 //Makes sure the Class is not already Full
		if (aClass.getStudentCount() < maxStudent) {
                        aClass.addBooking(booking);
                        System.out.println("--------------------------YOUR BOOKING-----------------------------");
			return booking;
		}
		else {
			System.out.println("Sorry, This class is Full, Please Join another class. \n");
			return null;
		}
	}
         
 
        //Change Class
	 public  Booking changeClass(Booking prevBooking, FitnessClass newClass) {

                Customer foundCustomer = prevBooking.getCust();
                String paymentm = prevBooking.getPaymentMethod();
                 
		Booking newBooking = new Booking(foundCustomer, newClass, paymentm);
                newBooking.setStatus("changed");
                
		int maxStudent=20;

		 //Makes sure the Class is not already Full
		if (newClass.getStudentCount() < maxStudent) {

                        newClass.addBooking(newBooking);
                        ffitnessClass.removeBooking(prevBooking);
                        
                        System.out.println("Class Changed Successfully. New Booking Info:");
			return newBooking;
		}
		else {
			System.out.println("Sorry, This class is Full, Please Join another class.");
			return null;
		}
	}
         
        //Attend Class
	 public String attendClass(Booking prevBooking, int rating, String reviewInput) {
                int reviewID = (int) Math.round(Math.random() * 100);
                Review review = new Review(rating, reviewID, reviewInput);
                
                Rating fitnessClassRating = ffitnessClass.getRating();

                fitnessClassRating.setReview(review);
                
                prevBooking.setStatus("attended");
                
                System.out.println("Class Rated Successfully. Your Review:");
                return review.toString();
		
	}
        
        //Generate Fitness Class Report
	 public String generateReport(int inputMonth) {
            int theMonth = inputMonth;
            int inputyYear = 2018;
            if(inputMonth == 13){  theMonth = 1; inputyYear = 2019;}
            if(inputMonth == 14){  theMonth = 2; inputyYear = 2019;}
            System.out.println("--------------------REPORT--------------------");
            for(int i = 0; i < fitnessClasses.size(); i ++){

                DateFormat classDate = fitnessClasses.get(i).getTime();
                String fdate = classDate.format(new Date());
                
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date date = formatter.parse(fdate);

                    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int month = localDate.getMonthValue();
                    int classYear = localDate.getYear();
                    
                    fitnessClasses.get(i).getRating().setAvg();
                    
                    if( month == theMonth && classYear == inputyYear){
                        System.out.println((i + 1) + ". " + fitnessClasses.get(i)+"[Income: $"+ fitnessClasses.get(i).getIncome() +"]");
                    }
                    

                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
            
            System.out.println("--------------------REPORT END--------------------");
             
            return "";
		
	}
         
        //Generate Champion Fitness Class Report
        public String generateChampion(int inputMonth){
            int theMonth = inputMonth;
            int inputyYear = 2018;
            
            if(inputMonth == 13){ theMonth = 1; inputyYear = 2019; }
            if(inputMonth == 14){ theMonth = 2; inputyYear = 2019;}
            FitnessClass mostEarnedClass = null;
            int highestVal  = 0;
            
            System.out.println("--------------------REPORT--------------------");
            
            for(int i = 0; i < fitnessClasses.size(); i ++){

                DateFormat classDate = fitnessClasses.get(i).getTime();
                String fdate = classDate.format(new Date());
                
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date date = formatter.parse(fdate);

                    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    int classMonth = localDate.getMonthValue();
                    int classYear = localDate.getYear();
                    
                    //System.out.println("###### Matches 2019"+" "+ classMonth + " "+inputMonth+" "+ classYear + " "+inputyYear);
                    
                    if( classMonth == theMonth && classYear == inputyYear){
                        
                        

                        if(highestVal < fitnessClasses.get(i).getIncome() ){
                            highestVal  = fitnessClasses.get(i).getIncome();
                            mostEarnedClass = fitnessClasses.get(i);
                        }

                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            
            if(highestVal > 0){
                System.out.println("Most Earned Class for the Selected Month: "+ mostEarnedClass.toString() +"]"+"[Income: $"+ mostEarnedClass.getIncome() +"]");
                
            }
            
            if(highestVal == 0){
                System.out.println("No Classes booked on selected Month.");
            }
            
            System.out.println("--------------------REPORT END--------------------");
            
            return "";
         
         }
         
        
        
        public ClassController(){
         
            DummyImporter dummyItems = new DummyImporter();
            this.fitnessClasses = dummyItems.populateArray();

            //Display Main Menu
            menuSelection();

            //System.exit(0);
	}
}
