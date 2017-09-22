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


