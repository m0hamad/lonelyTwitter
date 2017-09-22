package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{

    protected String message;
    protected Date date;

    public Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

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

