package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood{
    public SadMood() {
        super();
    }
    public SadMood(Date date) {
        super(date);
    }
    public String getMood() {
        return "Sad";
    }
}
