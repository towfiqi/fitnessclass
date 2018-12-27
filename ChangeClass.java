/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author Towfiqul Islam
 */
public class ChangeClass {
    private Scanner input = new Scanner(System.in);
    private final int NUMBER_OF_CLASSES = 8;
    private FitnessClass[] classList = new FitnessClass[NUMBER_OF_CLASSES];
    private FitnessClass selectedClass;
    private Booking foundBooking;

    //ENTERING AND VALIDATING CUSTOMER DETAILS
	private Booking bookingIDInput() {
		String bookingID = "";
		
                selectedClass.showAllBookings();
		//Ensures an ID is entered.
		do{
			System.out.println("Enter your Booking ID: ");
			bookingID = input.nextLine();
		}
		while(bookingID.isEmpty());
                
                foundBooking = selectedClass.searchBookingsByID(bookingID);
                if(foundBooking == null || foundBooking.getBookingID().isEmpty()){
                    do{
                            System.out.println("Invalid ID. Enter correct Booking ID: ");
                            bookingID = input.nextLine();
                    }
                    while(foundBooking == null || foundBooking.getBookingID().isEmpty());
                }


		return foundBooking;
	}
        
        //SELECTING THE CLASS
	private FitnessClass selectOldClass() {	
                System.out.println("Select Class");
		for(int count = 0; count < NUMBER_OF_CLASSES; count++){
			System.out.println((count + 1) + ". " + classList[count]);
		}
                
		int selection = input.nextInt();
                
		if(selection > NUMBER_OF_CLASSES || selection <= 0 )
		{
			System.out.println("Invalid number entered.");
			return classSelection();
		}
		selection -= 1;
                selectedClass = classList[selection];
		return classList[selection];
		
	}
        
                //SELECTING THE CLASS
	private FitnessClass classSelection() {	
                System.out.println("Which Class would you like to join?");
		for(int count = 0; count < NUMBER_OF_CLASSES; count++){
			System.out.println((count + 1) + ". " + classList[count]);
		}
                
		int selection = input.nextInt();
                
		if(selection > NUMBER_OF_CLASSES || selection <= 0 )
		{
			System.out.println("Invalid number entered.");
			return classSelection();
		}
		selection -= 1;
		return classList[selection];
		
	}
        
        //Booking
	 public  Booking changeClass(FitnessClass oldClass, Booking foundBooking, FitnessClass newClass) {
                 Customer foundCustomer = foundBooking.getCust();
                 //FitnessClass previousClass = foundBooking.getFitnessClass();
                 String paymentm = foundBooking.getPaymentMethod();
                 
		 Booking newBooking = new Booking(foundCustomer, newClass, paymentm);

		//Makes sure the Class is not already Full
		if (newClass.getStudentCount() < 20) {
                        //previousClass.removeStudent();
           
                        oldClass.removeBooking(foundBooking); //First Remove the old booking from The Bookings list
                        newClass.addBooking(newBooking);  //Then add the new booking to The Bookings list
                        newBooking.setStatus("changed");
                        
                        System.out.println("Class Changed Successfuly! New Class Info:  \n");
			return newBooking;
		}
		else {
			System.out.println("Sorry, This class is Full, Please Join another class. \n");
			return null;
		}
	}

        
        public ChangeClass(){
            
                FitnessClass sta1 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019/02/02 9:00:00"));
                FitnessClass sat2 = new FitnessClass("Spin",10, new SimpleDateFormat("2019/02/02 15:00:00"));
                FitnessClass sat3 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019/02/02 18:00:00"));
                FitnessClass sat4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019/02/02 21:00:00"));
		
                FitnessClass sun1 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2019/02/03 9:00:00")); 
                FitnessClass sun2 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019/02/03 15:00:00"));
                FitnessClass sun3 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019/02/03 18:00:00"));
		FitnessClass sun4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019/02/03 21:00:00")); 

                //Set the classes to classList Array
		classList[0] = sta1;
		classList[1] = sat2;
		classList[2] = sat3;
		classList[3] = sat4;
                classList[4] = sun1;
                classList[5] = sun2;
                classList[6] = sun3;
                classList[7] = sun4;
            
            System.out.println(changeClass(selectOldClass(), bookingIDInput(), classSelection()));
        
        }
}
