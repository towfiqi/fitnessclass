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
public class ClassController {
    private Scanner input = new Scanner(System.in);
	private final int NUMBER_OF_CLASSES = 8;

	private FitnessClass[] classList = new FitnessClass[NUMBER_OF_CLASSES];
        private String[] paymentMethods = new String[2];
        
        
	static Customer customer = new Customer();
	FitnessClass desiredClass = new FitnessClass();
        
        public FitnessClass highestRating(){
            
            FitnessClass hR=new FitnessClass();
            double rt=classList[0].getRating().getAvg();
            for (int i=1; i<=classList.length;i++){
                if (classList[i].getRating().getAvg()>rt)
                    rt=classList[i].getRating().getAvg();
            }
            return hR;
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
        
	//Booking
	 public  Booking bookClass(Customer aCustomer, FitnessClass aClass, String payMethod) {
		 Booking booking = new Booking(aCustomer, aClass, payMethod);
		 int maxStudent=20;

		 //Makes sure the Class is not already Full
		if (aClass.getStudentCount() < maxStudent) {
                        Booking.addBooking(booking);
			return booking;
		}
		else {
			System.out.println("Sorry, This class is Full, Please Join another class. \n");
			return null;
		}
	}




//ENTERING AND VALIDATING CUSTOMER DETAILS
	private Customer customerDetailsInput() {
		String custName = "";
		
		//Ensures a Name is entered.
		do{
			System.out.println("Enter your Name: ");
			custName = input.nextLine();
		}
		while(custName.isEmpty());
		customer.setName(custName);

		
		return customer;
	}
        
        public ClassController(){
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
                
                
		
		//Recursion for issuing another ticket
		boolean purchaseLoop = true;
		do {
			System.out.println(bookClass(customerDetailsInput(), classSelection(), paymentSelection() ));
			char purchaseAgain = '0';
			while(purchaseAgain != 'Y' && purchaseAgain != 'N') {
				System.out.println("Would you like to join another class? (Y / N)");
				purchaseAgain = input.next().charAt(0);
				purchaseAgain = Character.toUpperCase(purchaseAgain);
				if(purchaseAgain == 'N') {
					//System.out.println("Goodbye!");
                                        new FitnessBookingApp().menuSelection();
					purchaseLoop = false; //Closes the loop and the program.
				}	
				else if(purchaseAgain == 'Y') {
					continue; //Loops the program
				}
			}

		}
		while(purchaseLoop);
		//System.exit(0);
	}
}
