/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitness.bookingapp;

/**
 *
 * @author Towfiqul Islam
 */
public class Rating {
	//G(0), P(12), M(16);
	//private int age;
	private Review[] revs;
        private double avg;

    
        public Rating() {
        this.revs = null;
        this.avg = 0;
    }

        
    public Review[] getRevs() {
        return revs;
    }

    public void setRevs(Review[] revs) {
        this.revs = revs;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Rating (avg) {" +  "avg=" + avg + '}';
    }

   
        
        
}
