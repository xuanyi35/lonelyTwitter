package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by XuanyiWu on 2017-09-13.
 */

public abstract class Mood {
    private String mood;
    private Date date;

    public Mood(String mood){
    }

    public Mood (String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public String getMood(){
        return mood;
    }


    public abstract Boolean isGood();

}
