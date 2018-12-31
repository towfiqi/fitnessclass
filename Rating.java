/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

import java.util.*;

/**
 *
 * @author Towfiqul Islam
 */
public class Rating {

        private ArrayList<Review> reviews;
        private double avg;

    
        public Rating() {
            this.reviews = new ArrayList<Review>();
            this.avg = 0;
        }

        
        public ArrayList<Review> getRevs() {
            return reviews;
        }

        
        public void setReview(Review rev){
            reviews.add(rev);
        }

        public double getAvg() {
            return avg;
        }

        public void setAvg() {
            double newAvg = 0;
            
            if(reviews.size() > 0){
            
                for(int i = 0; i < reviews.size(); i ++){
                    newAvg = newAvg + reviews.get(i).getScore();
                }
            
                this.avg = newAvg / reviews.size();
            }

        }

        @Override
        public String toString() {
            return "Rating (avg) {" +  "avg=" + avg + '}';
        }

     
}
