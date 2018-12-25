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
public class Review {
    private int score;
    private int id;
    private String comment;

    public Review(int score, int id, String comment) {
        this.score = score;
        this.id = id;
        this.comment = comment;
    }

    
    
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
}
