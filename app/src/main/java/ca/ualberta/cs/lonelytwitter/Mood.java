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

import java.util.Date;

/**
 * Created by XuanyiWu on 2017-09-13.
 */

/**
 * Represents a Mood
 *
 * @author X
 * @version 1.5
 * @see Bad
 * @see Good
 * @since 1.0
 *
 */
public abstract class Mood {
    private String mood;
    private Date date;

    /**
     * construct a mood object
     *
     * @param mood tweet mood
     */
    public Mood(String mood){
    }

    /**
     * construct a mood object
     *
     * @param mood tweet mood
     * @param date tweet date
     */
    public Mood (String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    /**
     * set date to the mood
     *
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * return the date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * return the date
     *
     * @return
     */
    public String getMood(){
        return mood;
    }

    /**
     * check whether the mood is good
     * @return
     */

    public abstract Boolean isGood();

}
