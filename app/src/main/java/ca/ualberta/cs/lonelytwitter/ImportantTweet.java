/*
*ImportantTweet
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

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) throws TweetTooLongException {
        super(message, date);
        this.setMessage(message);
        this.date = date;

    }

    /**
     * Displays appropriate date for tweet.
     * @return
     */
    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }


    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}


