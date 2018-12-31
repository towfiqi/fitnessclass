/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Towfiqul Islam
 */
public class DummyImporter {
    
    private ArrayList<FitnessClass> fitnessClasses;

    public ArrayList<FitnessClass> populateArray() {
        
        this.fitnessClasses = new ArrayList<FitnessClass>();

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
        
        
        FitnessClass class1 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-01 9:00:00"));
        FitnessClass class2 = new FitnessClass("Spin",10, new SimpleDateFormat("2018-12-01 15:00:00"));
        FitnessClass class3 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-01 18:00:00"));
        FitnessClass class4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-02-01 21:00:00"));
        FitnessClass class5 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018-12-02 9:00:00")); 
        FitnessClass class6 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-02 15:00:00"));
        FitnessClass class7 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-02 18:00:00"));
        FitnessClass class8 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-02 21:00:00")); 

        FitnessClass class9 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-08 9:00:00"));
        FitnessClass class10 = new FitnessClass("Spin",10, new SimpleDateFormat("2018-12-08 15:00:00"));
        FitnessClass class11 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-08 18:00:00"));
        FitnessClass class12 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-08 21:00:00"));
        FitnessClass class13 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018-12-09 9:00:00")); 
        FitnessClass class14 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-09 15:00:00"));
        FitnessClass class15 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-09 18:00:00"));
        FitnessClass class16 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-09 21:00:00")); 

        FitnessClass class17 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-15 9:00:00"));
        FitnessClass class18 = new FitnessClass("Spin",10, new SimpleDateFormat("2018-12-15 15:00:00"));
        FitnessClass class19 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-15 18:00:00"));
        FitnessClass class20 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-02-51 21:00:00"));
        FitnessClass class21 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018-12-16 9:00:00")); 
        FitnessClass class22 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-16 15:00:00"));
        FitnessClass class23 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-16 18:00:00"));
        FitnessClass class24 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-16 21:00:00")); 

        FitnessClass class25 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-22 9:00:00"));
        FitnessClass class26 = new FitnessClass("Spin",10, new SimpleDateFormat("2018-12-22 15:00:00"));
        FitnessClass class27 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-22 18:00:00"));
        FitnessClass class28 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-22 21:00:00"));
        FitnessClass class29 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2018-12-23 9:00:00")); 
        FitnessClass class30 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2018-12-23 15:00:00"));
        FitnessClass class31 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2018-12-23 18:00:00"));
        FitnessClass class32 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2018-12-23 21:00:00")); 
        
        

        Booking Booking1 = new Booking(cust1, class1, "Cash"); Booking1.setStatus("attended");
        Booking Booking2 = new Booking(cust4, class5, "Cash"); Booking2.setStatus("attended");
        Booking Booking3 = new Booking(cust2, class5, "Card"); Booking3.setStatus("attended");
        Booking Booking4 = new Booking(cust5, class3, "Card"); Booking4.setStatus("attended");
        Booking Booking5 = new Booking(cust6, class4, "Cash"); Booking5.setStatus("attended");
        Booking Booking6 = new Booking(cust8, class5, "Cash"); Booking6.setStatus("attended");
        Booking Booking7 = new Booking(cust4, class5, "Cash"); Booking7.setStatus("attended");
        Booking Booking8 = new Booking(cust7, class6, "Card"); Booking8.setStatus("attended");
        Booking Booking9 = new Booking(cust1, class7, "Card"); Booking9.setStatus("attended");
        Booking Booking10 = new Booking(cust13, class7, "Cash"); Booking10.setStatus("attended");
        
        Booking Booking11 = new Booking(cust9, class8, "Cash"); Booking11.setStatus("attended");
        Booking Booking12 = new Booking(cust10, class9, "Cash"); Booking12.setStatus("attended");
        Booking Booking13 = new Booking(cust7, class11, "Card"); Booking13.setStatus("attended");
        Booking Booking14 = new Booking(cust5, class12, "Card"); Booking14.setStatus("attended");
        Booking Booking15 = new Booking(cust6, class13, "Cash"); Booking15.setStatus("attended");
        Booking Booking16 = new Booking(cust11, class14, "Cash"); Booking16.setStatus("attended");
        Booking Booking17 = new Booking(cust14, class15, "Cash"); Booking17.setStatus("attended");
        Booking Booking18 = new Booking(cust2, class16, "Card"); Booking18.setStatus("attended");
        Booking Booking19 = new Booking(cust14, class17, "Card"); Booking19.setStatus("attended");
        Booking Booking20 = new Booking(cust13, class17, "Cash"); Booking20.setStatus("attended");
        
        
        //REVIEWS
        Review review1 = new Review(5, 1, "Loved the Class!");  Rating class1Rating = class1.getRating(); class1Rating.setReview(review1); 

        Review review2 = new Review(1, 2, "Horrible! I did not learn anything.");  Rating class2Rating = class2.getRating(); class2Rating.setReview(review2);

        Review review3 = new Review(3, 3, "It was just ok!");  Rating class3Rating = class3.getRating(); class3Rating.setReview(review3);

        Review review4 = new Review(2, 4, "The instructor was going too fast.");  Rating class4Rating = class4.getRating(); class4Rating.setReview(review4);

        Review review5 = new Review(4, 5, "Very useful! Learned a lot");  Rating class5Rating = class5.getRating(); class5Rating.setReview(review5);

        Review review6 = new Review(3, 6, "Instructor was late.");  Rating class6Rating = class6.getRating(); class6Rating.setReview(review6);

        Review review7 = new Review(4, 7, "liked the Class very much!");  Rating class7Rating = class7.getRating(); class7Rating.setReview(review7);

        Review review8 = new Review(4, 8, "Great class, great instructor!"); Rating class8Rating = class8.getRating(); class8Rating.setReview(review8);

        Review review9 = new Review(5, 9, "Loved the Class!");  Rating class9Rating = class9.getRating(); class9Rating.setReview(review9);

        Review review10 = new Review(4, 10, "Loved it! The instructor was very caring"); Rating class10Rating = class10.getRating(); class10Rating.setReview(review10);

        Review review11 = new Review(4, 11, "liked the Class very much!");  Rating class11Rating = class11.getRating(); class11Rating.setReview(review11);

        Review review12 = new Review(5, 12, "Just Loved the Class!");  Rating class12Rating = class12.getRating(); class12Rating.setReview(review12);

        Review review13 = new Review(3, 13, "It was just ok!");  Rating class13Rating = class13.getRating(); class13Rating.setReview(review13);

        Review review14 = new Review(4, 14, "Loved the Class!");  Rating class14Rating = class14.getRating(); class14Rating.setReview(review14);

        Review review15 = new Review(5, 15, "Wow! Learned a lot!");  Rating class15Rating = class15.getRating(); class15Rating.setReview(review15);

        Review review16 = new Review(2, 16, "Not very educative");  Rating class16Rating = class16.getRating(); class16Rating.setReview(review16);

        Review review17 = new Review(2, 17, "Did not like it at all!");  Rating class17Rating = class17.getRating(); class17Rating.setReview(review17);

        Review review18 = new Review(3, 18, "Did not learn that much."); Rating class18Rating = class18.getRating(); class18Rating.setReview(review18);

        Review review19 = new Review(5, 19, "Loved the Class!");  Rating class19Rating = class19.getRating(); class19Rating.setReview(review19);

        Review review20 = new Review(4, 20, "It was great!"); Rating class20Rating = class20.getRating(); class20Rating.setReview(review20);
              
        Review review21 = new Review(2, 17, "Did not like it at all!"); class1Rating.setReview(review21);
        
        class1.addBooking(Booking1);
        class1.addBooking(Booking2);
        class1.addBooking(Booking3);
        class2.addBooking(Booking4);
        class3.addBooking(Booking5);
        class4.addBooking(Booking6);
        class5.addBooking(Booking7);
        class6.addBooking(Booking8);
        class7.addBooking(Booking9);
        class8.addBooking(Booking10);

        class9.addBooking(Booking11);
        class10.addBooking(Booking12);
        class11.addBooking(Booking13);
        class12.addBooking(Booking14);
        class13.addBooking(Booking15);
        class14.addBooking(Booking16);
        class15.addBooking(Booking17);
        class16.addBooking(Booking18);
        class17.addBooking(Booking19);
        class18.addBooking(Booking20);
        
        
        fitnessClasses.add(class1); fitnessClasses.add(class2); fitnessClasses.add(class3); fitnessClasses.add(class4); fitnessClasses.add(class5);
        fitnessClasses.add(class6); fitnessClasses.add(class7); fitnessClasses.add(class8); fitnessClasses.add(class9); fitnessClasses.add(class10);
        fitnessClasses.add(class11); fitnessClasses.add(class12); fitnessClasses.add(class13); fitnessClasses.add(class14); fitnessClasses.add(class15);
        fitnessClasses.add(class16); fitnessClasses.add(class17); fitnessClasses.add(class18); fitnessClasses.add(class19); fitnessClasses.add(class20);
        fitnessClasses.add(class21); fitnessClasses.add(class22); fitnessClasses.add(class23); fitnessClasses.add(class24); fitnessClasses.add(class25);
        fitnessClasses.add(class26); fitnessClasses.add(class27); fitnessClasses.add(class28); fitnessClasses.add(class29); fitnessClasses.add(class30);
        fitnessClasses.add(class31); fitnessClasses.add(class32);
        
            //UPCOMING CLASSES
            FitnessClass sat1 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019-01-05 9:00:00"));
            FitnessClass sat2 = new FitnessClass("Spin",10, new SimpleDateFormat("2019-01-05 15:00:00"));
            FitnessClass sat3 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019-01-05 18:00:00"));
            FitnessClass sat4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019-01-05 21:00:00"));

            FitnessClass sun1 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2019-01-06 9:00:00")); 
            FitnessClass sun2 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019-01-06 15:00:00"));
            FitnessClass sun3 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019-01-06 18:00:00"));
            FitnessClass sun4 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019-01-06 21:00:00")); 
            
            FitnessClass sat5 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019-02-09 9:00:00"));
            FitnessClass sat6 = new FitnessClass("Spin",10, new SimpleDateFormat("2019-02-09 15:00:00"));
            FitnessClass sat7 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019-02-09 18:00:00"));
            FitnessClass sat8 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019-02-09 21:00:00"));

            FitnessClass sun5 = new FitnessClass("Zumba", 15, new SimpleDateFormat("2019-02-17 9:00:00")); 
            FitnessClass sun6 = new FitnessClass("Taekwondo", 25, new SimpleDateFormat("2019-02-17 15:00:00"));
            FitnessClass sun7 = new FitnessClass("Pilates", 18, new SimpleDateFormat("2019-02-17 18:00:00"));
            FitnessClass sun8 = new FitnessClass("Yoga", 20, new SimpleDateFormat("2019-02-17 21:00:00")); 

            //ADD a dummy booking to One of the Upcoming Classes
            Booking Booking21 = new Booking(cust10, sat1, "Cash");
            sat1.addBooking(Booking21);
            
            Booking Booking22 = new Booking(cust8, sat3, "Cash");
            sat3.addBooking(Booking22);
            
            fitnessClasses.add(sat1);
            fitnessClasses.add(sat2);
            fitnessClasses.add(sat3);
            fitnessClasses.add(sat4);
            fitnessClasses.add(sun1);
            fitnessClasses.add(sun2);
            fitnessClasses.add(sun3);
            fitnessClasses.add(sun4);
            fitnessClasses.add(sat5);
            fitnessClasses.add(sat6);
            fitnessClasses.add(sat7);
            fitnessClasses.add(sat8);
            fitnessClasses.add(sun5);
            fitnessClasses.add(sun6);
            fitnessClasses.add(sun7);
            fitnessClasses.add(sun8);
            


        return fitnessClasses;
    }
}
