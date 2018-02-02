/*
 * NormalTweet
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
 * Represents a normal tweet
 *
 * @author yklaw
 * @version 1.0
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet
     *
     * @param message tweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a normal tweet
     *
     * @param message tweet message
     * @param date tweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
