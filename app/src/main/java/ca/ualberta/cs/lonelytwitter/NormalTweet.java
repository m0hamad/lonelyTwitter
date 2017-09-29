/*
*NormalTweet
*
* Version 1.0
*
* September 27, 2017
*
*Copyright © 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
*You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta.
*You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
*/

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Returns normal tweet with date.
 */
public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    public Date getDate() {
        return this.date;
    }
    public String getMessage() {
        return this.message;
    }


    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
