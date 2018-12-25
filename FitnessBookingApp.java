/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Towifuql Islam
 */
public class FitnessBookingApp {
    private String[] menuItems = new String[5];
    private Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ClassController cc;
//        cc=new ClassController();
        new FitnessBookingApp().importDummyData();
        new FitnessBookingApp().menuSelection();
        
    }
    
    //SELECTING THE PAYMENT METHOD
    public void menuSelection() {	
		System.out.println("Please select an action:");
                menuItems[0] = "Book Class";
                menuItems[1] = "Change Class";
                menuItems[2] = "Attend Class";
                menuItems[3] = "Monthly Class Report";
                menuItems[4] = "Monthly Champion Report";
                
                for(int count = 0; count < 5; count++){
			System.out.println((count + 1) + ". " + menuItems[count]);
		}
		
		int selection = input.nextInt();
		
	
		if(selection == 1)
		{
                    ClassController cc;
                    cc=new ClassController();
                }
                else if(selection == 2)
		{
                    ChangeClass chclas;
                    chclas=new ChangeClass();
                }
                else if(selection == 3)
		{
                    Booking.showAllBookings();
    		}else{
                    System.out.println("Invalid number entered.");
                    menuSelection();
                }
		
	} 
    
    private void importDummyData() 
    {
        Customer cust1 = new Customer("John Doe");
        Customer cust2 = new Customer("Arlette Brown");
        Customer cust3 = new Customer("Donna Lopez");
        Customer cust4 = new Customer("Ollie Fong");
        Customer cust5 = new Customer("Christopher Fowler");
        Customer cust6 = new Customer("Samuel Phillips");
        Customer cust7 = new Customer("Jack Moorehead");
        Customer cust8 = new Customer("Doris Martinez");
        Customer cust9 = new Customer("Steve Millen");
        Customer cust10 = new Customer("Benjamin Spencer");
        Customer cust11 = new Customer("Julius Abner");
        Customer cust12 = new Customer("Christopher Goodwin");
        Customer cust13 = new Customer("Edward Keller");
        Customer cust14 = new Customer("Harold Mitchell");
        Customer cust15 = new Customer("Anna Holliday");
         
        
        FitnessClass class1 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/06 9:00:00"));
        FitnessClass class2 = new FitnessClass("Spin",10, new SimpleDateFormat("2018/10/06 15:00:00"));
        FitnessClass class3 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/06 18:00:00"));
        FitnessClass class4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/02/06 21:00:00"));
        FitnessClass class5 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018/10/07 9:00:00")); 
        FitnessClass class6 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/07 15:00:00"));
        FitnessClass class7 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/07 18:00:00"));
        FitnessClass class8 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/07 21:00:00")); 

        FitnessClass class9 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/13 9:00:00"));
        FitnessClass class10 = new FitnessClass("Spin",10, new SimpleDateFormat("2018/10/13 15:00:00"));
        FitnessClass class11 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/13 18:00:00"));
        FitnessClass class12 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/13 21:00:00"));
        FitnessClass class13 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018/10/14 9:00:00")); 
        FitnessClass class14 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/14 15:00:00"));
        FitnessClass class15 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/14 18:00:00"));
        FitnessClass class16 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/14 21:00:00")); 

        FitnessClass class17 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/20 9:00:00"));
        FitnessClass class18 = new FitnessClass("Spin",10, new SimpleDateFormat("2018/10/20 15:00:00"));
        FitnessClass class19 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/20 18:00:00"));
        FitnessClass class20 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/02/20 21:00:00"));
        FitnessClass class21 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018/10/21 9:00:00")); 
        FitnessClass class22 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/21 15:00:00"));
        FitnessClass class23 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/21 18:00:00"));
        FitnessClass class24 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/21 21:00:00")); 

        FitnessClass class25 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/27 9:00:00"));
        FitnessClass class26 = new FitnessClass("Spin",10, new SimpleDateFormat("2018/10/27 15:00:00"));
        FitnessClass class27 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/27 18:00:00"));
        FitnessClass class28 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/27 21:00:00"));
        FitnessClass class29 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018/10/28 9:00:00")); 
        FitnessClass class30 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018/10/28 15:00:00"));
        FitnessClass class31 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018/10/28 18:00:00"));
        FitnessClass class32 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018/10/28 21:00:00")); 
        
        

        Booking Booking1 = new Booking(cust1, class1, "Cash");
        Booking Booking2 = new Booking(cust4, class1, "Cash");
        Booking Booking3 = new Booking(cust2, class1, "Card");
        Booking Booking4 = new Booking(cust5, class3, "Card");
        Booking Booking5 = new Booking(cust6, class4, "Cash");
        Booking Booking6 = new Booking(cust8, class5, "Cash");
        Booking Booking7 = new Booking(cust4, class5, "Cash");
        Booking Booking8 = new Booking(cust7, class6, "Card");
        Booking Booking9 = new Booking(cust1, class7, "Card");
        Booking Booking10 = new Booking(cust13, class7, "Cash");
        
        Booking Booking11 = new Booking(cust9, class8, "Cash");
        Booking Booking12 = new Booking(cust10, class9, "Cash");
        Booking Booking13 = new Booking(cust7, class11, "Card");
        Booking Booking14 = new Booking(cust5, class12, "Card");
        Booking Booking15 = new Booking(cust6, class13, "Cash");
        Booking Booking16 = new Booking(cust11, class14, "Cash");
        Booking Booking17 = new Booking(cust14, class15, "Cash");
        Booking Booking18 = new Booking(cust2, class16, "Card");
        Booking Booking19 = new Booking(cust14, class17, "Card");
        Booking Booking20 = new Booking(cust13, class17, "Cash");
        
        Booking.addBooking(Booking1);
        Booking.addBooking(Booking2);
        Booking.addBooking(Booking3);
//        Booking.addBooking(Booking4);
//        Booking.addBooking(Booking5);
//        Booking.addBooking(Booking6);
//        Booking.addBooking(Booking7);
//        Booking.addBooking(Booking8);
//        Booking.addBooking(Booking9);
//        Booking.addBooking(Booking10);
//        
//        Booking.addBooking(Booking11);
//        Booking.addBooking(Booking12);
//        Booking.addBooking(Booking13);
//        Booking.addBooking(Booking14);
//        Booking.addBooking(Booking15);
//        Booking.addBooking(Booking16);
//        Booking.addBooking(Booking17);
//        Booking.addBooking(Booking18);
//        Booking.addBooking(Booking19);
//        Booking.addBooking(Booking20);
        
    };

    
}
