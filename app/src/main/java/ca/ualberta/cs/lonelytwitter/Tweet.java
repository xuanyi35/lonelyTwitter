package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xuanyi on 9/13/17.
 */

/* */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet (String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140){
            this.message = message;
        }
        else{
         throw new TweetTooLongException();
        }

    }

    public abstract Boolean isImportant();

    public Date getDate(){
        return date;
    }



    public void getMood(){
        Mood mood = new Good("nice");
        Mood mood1 = new Bad("terrible");
        ArrayList<Mood> moodList = new ArrayList<Mood>();
        moodList.add(mood);
        moodList.add(mood1);

    }

    


}
