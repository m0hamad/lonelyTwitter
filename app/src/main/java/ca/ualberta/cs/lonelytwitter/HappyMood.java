package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood {
    public HappyMood() {
        super();
    }
    public HappyMood(Date date) {
        super(date);
    }
    public String getMood() {
        return "Happy";
    }
}
