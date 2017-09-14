package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xuanyi on 9/13/17.
 */

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

    public void setMessage(String message) throws TweeTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
         throw new TweeTooLongException();
        }

    }

    public abstract Boolean isImportant();

    public Date getDate(){
        return date;
    }


}
