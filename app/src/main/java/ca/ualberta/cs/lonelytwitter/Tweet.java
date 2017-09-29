/*
*Tweet
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
 * Represents a tweet.
 *
 * @author team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{

    protected String message;
    protected Date date;

    public Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet Object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.date = date;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets the tweets message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140) {
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    public abstract Boolean isImportant();
}

