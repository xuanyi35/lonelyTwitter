/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27,2017
 *
 * Copyright (c) 2017 Team X,CMPUT301, University of Alberta - All Rights Reserved.
 * You may use,distribute, or modify thid code under terms and condition of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */





package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xuanyi on 9/13/17.
 */


/**
 *
 * Represents a tweet
 *
 * @author X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public abstract class Tweet implements Tweetable{

    /*
        Brief description
     */


    private String message;
    private Date date;

    /**
     * construct a tweet Object
     *
     * @param message tweet message
     */

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }


    /**
     *
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet (String message, Date date){
        this.date = date;
        this.message = message;
    }


    /**
     *return the String
     *
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     *
     * Sets the tweet message
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140){
            this.message = message;
        }
        else{
         throw new TweetTooLongException();
        }

    }

    /**
     * check whether the tweet is important
     * @return
     */
    public abstract Boolean isImportant();

    /**
     *
     * get the date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * convert the message and the date to a string
     *
     * @return
     */
    @Override
    public  String toString(){
        return date.toString() + "|" + message ;
    }


    /**
     *
     * check whether the mood is good or bad
     *
     */
    public void getMood(){
        Mood mood = new Good("nice");
        Mood mood1 = new Bad("terrible");
        ArrayList<Mood> moodList = new ArrayList<Mood>();
        moodList.add(mood);
        moodList.add(mood1);

    }

    


}
