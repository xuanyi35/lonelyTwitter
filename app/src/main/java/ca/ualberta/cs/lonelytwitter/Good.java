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
 * Created by XuanyiWu on 2017-09-14.
 */


/**
 * Represents a Mood
 *
 * @author X
 * @version 1.5
 * @see Bad
 * @see Mood
 * @since 1.0
 *
 */
public class Good extends Mood {
    /**
     * construct a good mood object
     *
     * @param mood tweet mood
     */
    public Good(String mood){
        super(mood);
    }

    /**
     * construct a good mood object
     *
     * @param mood tweet mood
     * @param date tweet date
     */
    public Good (String mood, Date date){
        super(mood,date);
    }
    /**
     * return true to show this mood is good
     * @return
     */
    @Override
    public Boolean isGood(){
        return Boolean.TRUE;
    }

}
