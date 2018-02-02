/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018 Team x. CMPUT 301. University of Alberta. All Rights Reserved.
 * You may use, distribute, or modify the code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet
 *
 * @author yklaw
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 *
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet message
     *
     * @param message tweet message
     */
    public Tweet(String message){

        this.message = message;
        date = new Date();
    }

    /**
     * Constructs a tweet message
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets and return the message
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets and return the date
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Turn tweet message into a String for display
     *
     * @return
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
